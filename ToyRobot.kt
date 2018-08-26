package com.mahshad.toyrobot


class ToyRobot {

    var x:Int=0
    var y:Int=0
    var f:String?=null
    var d:String?=null

        constructor(f:String, x:Int, y:Int, d:String):this(){

           this.f= readLine()!!
           this.x= readLine()!!.toInt()
           this.y= readLine()!!.toInt()
           this.d= readLine()!!
        }



        }


    enum class Face {
            NORTH, SOUTH, WEST, EAST
        }

        enum class Direction {
            LEFT, RIGHT
        }

        fun main(args: Array<String>) {


            var userface=Face.NORTH
            var userdirection=Direction.LEFT
            var  tr= ToyRobot("north", 0,0 ,"left")


            if(userface== Face.NORTH) {
                for (y in 0..5) {
                    y = y + 1

                    if(userdirection==Direction.LEFT) {

                        tr.f= "west"

                    }

                    if(userdirection==Direction.RIGHT) {
                        tr.f = "east"
                    }

                }



            }

            if(userface== Face.WEST) {
                for (x in 0..5) {
                    x = x - 1

                    if(userdirection==Direction.LEFT) {

                        tr.f= "south"

                    }

                    if(userdirection==Direction.RIGHT) {
                        tr.f = "north"
                    }

                }

            }

            if(userface== Face.EAST) {
                for (x in 0..5) {
                    x = x + 1

                    if(userdirection==Direction.LEFT) {

                        tr.f= "north"

                    }

                    if(userdirection==Direction.RIGHT) {
                        tr.f = "south"
                    }

                }

            }

            if(userface== Face.SOUTH) {
                for (y in 0..5) {
                    y = y - 1

                    if(userdirection==Direction.LEFT) {

                        tr.f= "west"

                    }

                    if(userdirection==Direction.RIGHT) {
                        tr.f = "east"
                    }

                }

            }




        }

}