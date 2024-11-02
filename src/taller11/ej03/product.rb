# frozen_string_literal: true
class Product
  attr_reader :description, :price

  def initialize(description, price)
    @description = description
    @price = price
  end

  def ==(other)
    return false unless other.is_a?(Product)
    @description == other.description && @price == other.price
  end

  def hash
    [@description, @price].hash
  end

  alias_method :eql?, :==
end
