class TeamPosition
  def initialize(team)
    @team = team
    @points = 0
    @gf = 0
    @gc = 0
  end

  def add_goals(gf, gc)
    @gf += gf
    @gc += gc
  end

  def add_points(points)
    @points += points
  end

  def add_win()
    add_points(3)
  end

  def add_draw()
    add_points(1)
  end

  def <=>(other)
    cmp = other.points <=> @points
    return cmp unless cmp == 0
    cmp = other.gf <=> @gf
    return cmp unless cmp == 0
    cmp = other.gc <=> @gc
    return cmp unless cmp == 0
    @team <=> other.team
  end

  def to_s
    "#{@team.to_s}  #{@points.to_s}  #{@gf.to_s}  #{@gc.to_s}"
  end

  private :add_points
  attr_reader :team, :points, :gf, :gc
end