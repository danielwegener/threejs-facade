package org.denigma.preview

import org.denigma.binding.binders.GeneralBinder
import org.denigma.binding.views.BindableView
import org.querki.jquery._
import org.scalajs.dom
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import org.denigma.binding.extensions._

/**
 * Just a simple view for the whole app, if interested ( see https://github.com/antonkulaga/scala-js-binding )
 */
@JSExport("FrontEnd")
object FrontEnd extends BindableView with scalajs.js.JSApp
{

  //override def name = "main"

  //override val params: Map[String, Any] = Map.empty

  lazy val elem: HTMLElement = dom.document.body

  val sidebarParams = js.Dynamic.literal(
    exclusive = false,
    dimPage = false,
    closable = false,
    useLegacy = true
  )
  /**
   * Register views
   */
  override lazy val injector = defaultInjector
      .register("sidebar"){
        (el, params) => new SidebarView(el).withBinder(new GeneralBinder(_))
      }


  @JSExport
  def main(): Unit = {
    this.bindElement(this.viewElement)
    this.bindView()

    Example.activate() //activate examples
  }

  @JSExport
  def showLeftSidebar() = {
    $(".left.sidebar").dyn.sidebar(sidebarParams).sidebar("show")
  }

  @JSExport
  def load(content: String, into: String): Unit = {
    dom.document.getElementById(into).innerHTML = content
  }

  @JSExport
  def moveInto(from: String, into: String): Unit = {
    for {
      ins <- sq.byId(from)
      intoElement <- sq.byId(into)
    } {
      this.loadElementInto(intoElement, ins.innerHTML)
      ins.parentNode.removeChild(ins)
    }
  }

  /*override def activateMacro(): Unit = {
    extractors.foreach(_.extractEverything(this))
  }*/

  /*
  def attachBinders() = {
    this.binders = BindableView.defaultBinders(this)
  }*/
}
