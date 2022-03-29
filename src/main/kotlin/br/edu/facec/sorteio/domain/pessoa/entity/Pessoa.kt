package br.edu.facec.sorteio.domain.pessoa.entity

import com.sun.org.apache.xpath.internal.operations.Bool
import java.time.LocalDate
import java.util.UUID

class Pessoa private constructor(

     val id : UUID,
    private val nome : String,
    private val telefone : String,
    private val email : String
) {
    private var cpf : String? = null
    private var dataNascimento : LocalDate? = null
    private var endereco : String? = null



    fun isIdEq(id : UUID): Boolean{
        return this.id == (id)
    }

    companion object{
        operator fun invoke(id : UUID, nome : String, telefone: String,email : String) : Pessoa{
            if (nome.isBlank()){
                throw IllegalArgumentException("Nome da pessoa deve ser informado")
            }
            if (telefone.isBlank()){
                throw IllegalArgumentException("telefone da pessoa deve ser informado")
            }
            if (email.isBlank()){
                throw IllegalArgumentException("email da pessoa deve ser informado")
            }
            return Pessoa(id, nome, telefone, email)
        }
    }
}