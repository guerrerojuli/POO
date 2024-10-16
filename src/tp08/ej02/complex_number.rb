class ComplexNumber
  attr_reader :real, :imaginary

  def initialize(real, imaginary)
    @real = real
    @imaginary = imaginary
  end 

  def +(other)
    ComplexNumber.new(@real + other.real, @imaginary + other.imaginary)
  end

  def to_s
    "#{@real} #{@imaginary.positive? ? '+' : '-'} #{@imaginary.abs}i"
  end
end
