package br.edu.facec.sorteio.domain.pessoa.repository

import br.edu.facec.sorteio.domain.pessoa.entity.Pessoa
import java.util.*

class MemoryPessoaRepository : PessoaRepository
{

    private val database : MutableSet<Pessoa> = mutableSetOf()

    override fun salvar(pessoa: Pessoa) {
        database.add(pessoa)
        return
    }


    override fun existePorId(id: UUID): Boolean {
        TODO("Not yet implemented")
    }

    override fun buscarPorId(id: UUID): Pessoa? {
        for (pessoa in database){
            if (pessoa.isIdEq(id)){
                return pessoa;
            }
        }

        return null
    }

    override fun listar(): List<Pessoa> {
        return database.toList()
    }

    override fun deletarPorId(id: UUID) {
        database.removeIf { it.isIdEq(id) }
    }
}