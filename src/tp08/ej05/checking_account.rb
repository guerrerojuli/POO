require_relative 'bank_account'

class CheckingAccount < BankAccount

 def initialize(id, overdraft)
   create(id)
   @overdraft = overdraft
 end

 private def extract?(amount)
   @balance + @overdraft - amount >= 0
 end

end
