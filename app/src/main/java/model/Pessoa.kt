package model

class Pessoa
    (
    var _nome: String,
    var _sobreNome: String,
    var _curso: String,
    var _tel: String
) {
    var nome: String
        get() = _nome
        set(valor) {
            _nome = valor
        }
    var sobrenome: String
        get() = _sobreNome
        set(valor) {
            _sobreNome = valor
        }
    var curso: String
        get() = _curso
        set(valor) {
            _curso = valor
        }
    var tel: String
        get() = _tel
        set(valor) {
            _tel = valor
        }


}