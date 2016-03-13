package org.denigma.preview

import org.denigma.binding.extensions._
import org.denigma.binding.views.BindableView
import org.querki.jquery._
import org.scalajs.dom.Element
import rx._

/**
 * Just a simple view for the sidebar, if interested ( see https://github.com/antonkulaga/scala-js-binding )
 */
class SidebarView (val elem:Element,val params:Map[String,Any] = Map.empty[String,Any]) extends BindableView {


  val title = Var("Threejs facade")

  val logo = Var("/resources/logo.jpg")

  override def bindView() = {
    $(".ui.accordion").dyn.accordion()
  }

  //override def activateMacro(): Unit = { extractors.foreach(_.extractEverything(this))}

  //override protected def attachBinders(): Unit =  binders =  BindableView.defaultBinders(this)
}
