require_relative "subway_system"
require_relative "status_subway_station"

class StatusSubwaySystem < SubwaySystem
  def initialize(city)
    super(city)
  end

  def build_station(name)
    StatusSubwayStation.new(name)
  end
end
