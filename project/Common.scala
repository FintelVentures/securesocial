
object Common {
  def version = "3.4.1-SNAPSHOT"
  def playVersion = System.getProperty("play.version", "2.7.9")
  def scalaVersion = System.getProperty("scala.version", "2.12.13")
  def crossScalaVersions = Seq(scalaVersion, "2.11.12")
}
