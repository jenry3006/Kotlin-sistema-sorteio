package br.edu.facec.sorteio.domain.pessoa.service

import br.edu.facec.sorteio.domain.pessoa.entity.Pessoa
import br.edu.facec.sorteio.domain.pessoa.repository.PessoaRepository
import java.util.*

class DefaultPessoaService (
    private val pessoaRepository:PessoaRepository
        ): PessoaService{

    override fun salvar(pessoa: Pessoa): UUID {
      pessoaRepository.salvar(pessoa)
        return pessoa.id

    }

    override fun buscarPorId(id: UUID): Pessoa? {
        TODO("Not yet implemented")
    }

    override fun listar(): List<Pessoa> {
        TODO("Not yet implemented")
    }

    override fun deletarPorId(id: UUID) {
        TODO("Not yet implemented")
    }

}