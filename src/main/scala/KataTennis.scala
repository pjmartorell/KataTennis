class KataTennis(player1Name:String, player2Name:String){
 
  var (p1, p2, p1N, p2N) = (0, 0, player1Name, player2Name)
  var p = Array("Love", "Fifteen", "Thirty", "Forty")
  
  def won_point(n:String){
    if (n == p1N) p1 += 1
    else p2 += 1
  }
  
  def score : String = {
    if ((p1 < 4 && p2 < 4) && (p1 + p2 < 6)){
      var s = p(p1)
      if (p1 == p2) s + "-All" else s + "-" + p(p2)
    }else{
      if (p1 == p2) "Deuce"
      else{
        var s = if (p1 > p2) p1N else p2N
        if (Math.abs(p1 - p2) == 1) "Advantage " + s else "Win for " + s
      }
    }
  }
}