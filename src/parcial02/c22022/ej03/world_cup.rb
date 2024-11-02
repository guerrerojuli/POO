require_relative "team_position"
require_relative "world_cup_error"

class WorldCup
  def initialize
    @groups = {}
  end

  def add_team(group, team)
    @groups[group] = {} unless @groups.key?(group)
    @groups[group][team] = TeamPosition.new(team)
  end

  def play_match(group, team1, team2, goals1, goals2)
    raise WorldCupError.new "Missing Group" unless @groups.key? group
    raise WorldCupError.new "Missing Team"  unless @groups[group].key?(team1) && @groups[group].key?(team2)
    @groups[group][team1].add_goals(goals1, goals2)
    @groups[group][team2].add_goals(goals2, goals1)
    if (goals1 > goals2)
        @groups[group][team1].add_win
    elsif (goals1 < goals2)
      @groups[group][team2].add_win
    else
      @groups[group][team1].add_draw
      @groups[group][team2].add_draw
    end
  end

  def to_s
    to_return = "World Cup\n"
    @groups.keys.each do |group|
      to_return += "#{group}\n"
      to_return += "Team  P  GF  GC\n"
      @groups[group].values.sort.each {|team| to_return += "#{team}\n"}
    end
    to_return
  end
end