package com.example

class AdditionOperationSpec extends spock.lang.Specification {

  def "test modulus"() {
    given: Operation op = new AdditionOperation()

    expect: op.calculate(5, 2) == 7
    op.calculate(10, 5) == 15
    op.calculate(4, 2) == 6
  }
}
