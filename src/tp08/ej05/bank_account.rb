class BankAccount

 def initialize
   raise 'Debe sobreescribir este método'
 end

 def create(id)
   @id = id
   @balance = 0
 end

 def deposit(amount)
   @balance += amount
 end

 def extract(amount)
   raise 'No cuenta con los fondos necesarios' unless extract? amount
   @balance -= amount
 end

 def extract?(_amount)
   raise 'Debe sobreescribir este método'
 end

 def to_s
   "Cuenta #{@id} con saldo #{@balance}"
 end

 private :create, :extract?

end
