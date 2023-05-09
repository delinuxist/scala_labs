package lab1.Library

enum Membership(numberOfBooks: Int) {
  case JUNIOR extends Membership(2)
  case REGULAR extends Membership(4)
  case SENIOR extends Membership(8)
  case GUEST extends Membership(0)
}