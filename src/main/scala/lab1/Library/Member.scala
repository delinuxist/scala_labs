package lab1.Library

import lab1.Library.Member.idGenerator

class Member (val firstName: String,val lastName: String,val member: Membership){
    idGenerator = idGenerator + 1
    private val Id: Int = idGenerator
    def id: Int = Id


    override def toString = s"Member($Id, $firstName, $lastName, $member)"
}


object Member {
  // Member id generator which is static
  var idGenerator: Int = 0;
  def apply(firstName: String,lastName: String,membership: Membership) = new Member(firstName,lastName,membership)

  // Be a member without any subscription
  def apply(firstName: String,lastName: String) = new Member(firstName,lastName,Membership.GUEST)
}
