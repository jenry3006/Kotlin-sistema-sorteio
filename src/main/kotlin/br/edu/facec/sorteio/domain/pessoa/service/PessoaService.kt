package br.edu.facec.sorteio.domain.pessoa.service

import br.edu.facec.sorteio.domain.pessoa.entity.Pessoa
import java.util.*

interface PessoaService {
    fun salvar(pessoa : Pessoa) : UUID
    fun buscarPorId(id : UUID) : Pessoa?
    fun listar() : List<Pessoa>
    fun deletarPorId(id : UUID)
}