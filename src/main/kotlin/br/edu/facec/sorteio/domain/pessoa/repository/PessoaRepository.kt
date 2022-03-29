package br.edu.facec.sorteio.domain.pessoa.repository

import br.edu.facec.sorteio.domain.pessoa.entity.Pessoa
import java.util.UUID

interface PessoaRepository {
    fun salvar(pessoa : Pessoa)
    fun existePorId(id : UUID) : Boolean
    fun buscarPorId(id : UUID) : Pessoa?
    fun listar() : List<Pessoa>
    fun deletarPorId(id : UUID)
}