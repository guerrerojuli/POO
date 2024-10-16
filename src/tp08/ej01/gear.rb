require_relative "wheel"

class Gear 
  def initialize(chainring, cog, rim = 0, tire = 0)
    @chainring = chainring
    @cog = cog
    @wheel = Wheel.new(rim, tire)
  end
  
  def ratio
    @chainring / @cog.to_f
  end

  def gear_inches
    ratio * @wheel.diameter
  end
end
