require_relative 'bank_account'

class SavingsAccount < BankAccount

 def initialize(id)
   create(id)
 end

 private def extract?(amount)
   @balance - amount >= 0
 end

end
