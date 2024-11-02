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
end
