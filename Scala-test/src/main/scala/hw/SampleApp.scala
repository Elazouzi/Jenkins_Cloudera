package main.scala.hw
import org.apache.spark.SparkContext, org.apache.spark.SparkConf
object SimpleApp {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("scala spark").setMaster("local")
  for(i<- conf.getAll){
  print(i)
  }
  }
}