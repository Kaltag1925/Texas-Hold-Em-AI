

class Game(a1: Agent, a2: Agent) {
  private var middleCards: List[Card] = null
  private var turn = 1
  private var round = 1
  private var minimumRaise = 0
  private var checkingAllowed = true
  private var done = false
  private var pot = 0
  
  def getMiddleCards = middleCards
  
  def getTurn = turn
  
  def getRound = round
  
  def getMinimumRaise = minimumRaise
  
  def checkingIsAllowed = checkingAllowed
  
  def gameOver = done
  
  def getPot = pot
  
  def makeMove(player: Agent, mv: Move.Value, amt: Int){
    if(mv == Move.Bet){
      minimumRaise = amt
      pot += amt
    }
    if(round == 3){
      done = true
    }
    turn *= -1
  }
  
  def show(): Unit = {
    for(c <- a1.hand){
      print(c);
    }
  }
  
}