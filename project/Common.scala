
object Common {
  def version = "2.8.1-SNAPSHOT"
  def playVersion = System.getProperty("play.version", "2.8.18")
  def scalaVersion = System.getProperty("scala.version", "2.13.10")
  def crossScalaVersions = Seq(scalaVersion, "2.12.13")
}
