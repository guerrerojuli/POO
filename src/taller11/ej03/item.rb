class Item
  attr_reader :product, :amount

  def initialize(product, amount)
    @product = product
    @amount = amount
  end

  def total
    @product.price * amount
  end

  def to_s
    format("%s \t %d \t $%g", @product.description, @amount, @product.price)
  end

  def eql?(other)
    return false unless other.is_a?(Item)
    @product == other.product && @amount == other.amount
  end

  def hash
    [@product, @amount].hash
  end

  alias_method :==, :eql?
end
