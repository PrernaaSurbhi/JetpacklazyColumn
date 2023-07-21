package com.example

const val DETAILED_ARG_KEY = "id"
const val DETAILED_ARG_KEY2 = "name"

sealed class Screens(val route :String){
    object Home : Screens(route = "home_screen")
//    //Passing multiple parameter of arguments
//    object Detail:Screens(route = "detail_screen/{$DETAILED_ARG_KEY}/{$DETAILED_ARG_KEY2}"){
//        fun passNameAndId(
//            id:Int,
//            name:String
//        ):String{
//            return "detail_screen/$id/$name"
//        }
//    }

    //Passing  Single Optional parameter of arguments
//    object Detail:Screens(route = "detail_screen/?id={id}"){
//        fun passOptionalArgument(id:Int = 0):String{
//            return "detail_screen?id =$id"
//        }
//    }

    //Passing  Multiple Optional parameter of arguments
    object Detail:Screens(route = "detail_screen/?id={$DETAILED_ARG_KEY}&name={$DETAILED_ARG_KEY2}"){
        fun passOptionalMutiArgument(id:Int = 0,name: String = "Prerna-surbhi"): String{
            return "detail_screen?id =$id&name=$name"
        }
    }

}
