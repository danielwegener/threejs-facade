package org.denigma.threejs.loaders

import org.denigma.threejs._
import org.denigma.threejs.core.{Object3D, BufferGeometry, Geometry}
import org.denigma.threejs.materials.Material
import org.denigma.threejs.textures.{CompressedTexture, Texture}
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.raw.{XMLHttpRequest, HTMLElement, HTMLImageElement}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * A simple caching class, used internally by [[XHRLoader]].
  * @constructor Creates a new Cache.
  * @see [[http://threejs.org/docs/#Reference/Loaders/Cache]]
  */
@js.native
@JSName("THREE.Cache")
class Cache extends js.Object {
  /** Whether caching is enabled. Default is false. */
  var enabled:Boolean = js.native
  /** An object that hold cached values. TODO: is this type signature correct? */
  var files: js.Array[js.Any] = js.native

  /**
    * Adds a cache entry with that key to hold the value. If this key already holds a value, it is overwritten.
    * @param key A string key
    * @param value A value
    */
  def add(key: String, value: js.Any): Unit = js.native

  /**
    * Get the value of key. If the key does not exist undefined is returned.
    * @param key A string key
    * @return
    */
  def get(key: String): js.Dynamic = js.native

  /**
    * Remove the cached value associated with the key.
    * @param key A string key
    */
  def remove(key: String): Unit = js.native

  /**
    * Remove all values from the cache.
    */
  def clear(): Unit = js.native
}

/**
  * A loader for loading an [[HTMLImageElement]].
  * @param manager The loadingManager for the loader to use. Default is [[THREE.DefaultLoadingManager]].
  * @constructor Creates a new ImageLoader.
  * @see [[http://threejs.org/docs/#Reference/Loaders/ImageLoader]]
  */
@js.native
@JSName("THREE.ImageLoader")
class ImageLoader(manager: LoadingManager = js.native) extends js.Object {

  /** The crossOrigin string to implement CORS for loading the url from a different domain that allows CORS. */
  var crossOrigin: String = js.native

  /**
    * Begin loading from url and return the [[HTMLImageElement]] object that will contain the data.
    * @param url required
    * @param onLoad Will be called when load completes. The argument will be the loaded Imageloader.
    * @param onProgress Will be called while load progresses. The argument will be the progress event.
    * @param onError Will be called when load errors.
    */
  def load(url: String, onLoad: js.Function1[HTMLImageElement, _] = js.native, onProgress: js.Function1[ProgressEvent, _] = js.native, onError: js.Function1[js.Any, _] = js.native): HTMLImageElement = js.native

  /**
    * The crossOrigin string to implement CORS for loading the url from a different domain that allows CORS.
    * @param crossOrigin The crossOrigin string.
    */
  def setCrossOrigin(crossOrigin: String): Unit = js.native
}

@js.native
trait JSonLoaderResultGeometry extends Geometry {
  var animation: AnimationData = js.native
}

/**
 * A loader for loading objects in JSON format.
 * @see [[http://threejs.org/docs/#Reference/Loaders/JSONLoader]]
 */
@js.native
@JSName("THREE.JSONLoader")
class JSONLoader extends Loader {
  def this(showStatus: Boolean = js.native) = this()

  /**
   * If true, the ajax request will use cookies.
   */
  var withCredentials: Boolean = js.native

  /**
   * @param url required
   * @param callback Will be called when load completes. The arguments will be the loaded Object3D and the loaded materials.
   * @param texturePath If not specified, textures will be assumed to be in the same folder as the Javascript model file.
   */
  def load(url: String, callback: js.Function2[JSonLoaderResultGeometry, js.Array[Material], Unit], texturePath: String = js.native): Unit = js.native
  def loadAjaxJSON(context: JSONLoader, url: String, callback: js.Function2[Geometry, js.Array[Material], Unit], texturePath: String = js.native, callbackProgress: js.Function1[Progress, Unit] = js.native): Unit = js.native

  /**
   * Parse a JSON structure
   * @param json JSON object to parse.
   * @param texturePath Base path for textures.
   * @return an Object containing the parsed .Geometry and .materials.
   */
  def parse(json: String, texturePath: String): js.Dynamic = js.native
}

@js.native
trait Progress extends js.Object {
  var total: Double = js.native
  var loaded: Double = js.native
}

/**
  * Base class for implementing loaders.
  * @constructor Creates a new Loader. This should be called as base class.
  * @see [[http://threejs.org/docs/#Reference/Loaders/Loader]]
  */
@js.native
@JSName("THREE.Loader")
class Loader extends js.Object {
  def this(showStatus: Boolean = js.native) = this()
  var showStatus: Boolean = js.native
  var statusDomElement: HTMLElement = js.native
  /**
    * Will be called when load starts.
    *
    * The default is a function with empty body.
    */
  var onLoadStart: js.Function0[_] = js.native
  /**
    * Will be called while load progresses.
    *
    * The default is a function with empty body.
    */
  var onLoadProgress: js.Function0[_] = js.native
  /**
    * Will be called when load completes.
    *
    * The default is a function with empty body.
    */
  var onLoadComplete: js.Function0[_] = js.native

  /**
    * The crossOrigin string to implement CORS for loading the url from a different domain that allows CORS.
    */
  var crossOrigin: String = js.native

  /**
    * Extract the base from the URL.
    * @param url The url to extract the base url from.
    */
  def extractUrlBase(url: String): String = js.native

  /**
    * Creates an array of Material based on the array of parameters m. The index of the parameters decide the correct index of the materials.
    * @param materials an array of parameters to create materials.
    * @param texturePath The base path of the textures.
    */
  def initMaterials(materials: js.Array[Material], texturePath: String): js.Array[Material] = js.native

  /**
    * Creates the Material based on the parameters m.
    */
  def createMaterial(): js.Function3[js.Any, String, String, Material] = js.native
}

@js.native
@JSName("THREE.Loader")
object Loader extends js.Object {
  var Handlers: LoaderHandler = js.native
}

/** Artificial common trait for Loaders */
@js.native
trait LoaderBase[T] extends js.Object {

  /**
    * Begin loading from url and return the loaded object.
    * @param url required
    * @param onLoad Will be called when load completes. The argument will be the loaded object.
    * @param onProgress Will be called while load progresses. The argument will be the progress event.
    * @param onError Will be called when load errors.
    */
  def load(url: String, onLoad: js.Function1[T, _], onProgress: js.Function1[ProgressEvent, _] = js.native, onError: js.Function1[js.Any, _] = js.native): Unit = js.native

  /**
    * @param crossOrigin The crossOrigin string to implement CORS for loading the url from a different domain that allows CORS.
    */
  def setCrossOrigin(crossOrigin: String): Unit = js.native

}

@js.native
trait LoaderHandler extends js.Object {
  var handlers: js.Array[js.Any] = js.native
  def add(regex: String, loader: Loader): Unit = js.native
  def get(file: String): Loader = js.native
}

@js.native
@JSName("THREE.BufferGeometryLoader")
class BufferGeometryLoader extends LoaderBase[BufferGeometry] {
  def this(manager: LoadingManager = js.native) = this()

  override def load(url: String, onLoad: js.Function1[BufferGeometry, _], onProgress: js.Function1[ProgressEvent, _] = js.native, onError: js.Function1[js.Any, _] = js.native): Unit = js.native

  override def setCrossOrigin(crossOrigin: String): Unit = js.native

  def parse(json: js.Any): BufferGeometry = js.native
}

/**
  * Handles and keeps track of loaded and pending data.
  * @see [[http://threejs.org/docs/#Reference/Loaders/LoadingManager]]
  */
@js.native
@JSName("THREE.LoadingManager")
class LoadingManager  extends js.Object {
  /**
    * Creates a LoadingManager.
    * @param onLoad The function that needs to be called when all loaders are done.
    * @param onProgress The function that needs to be called when an item is complete
    * @param onError The function that needs to be called when an item is errors. The argument is the url that caused the error.
    * @return
    */
  def this(onLoad: js.Function0[_] = js.native, onProgress: js.Function3[String, Double, Double, _] = js.native, onError: js.Function1[String,_] = js.native) = this()
  /** The function that needs to be called when all loaders are done. */
  var onLoad: js.Function0[_] = js.native

  /**
    * The function that needs to be called when an item is complete.
    * The arguments are url(The url of the item just loaded), loaded(the amount of items already loaded), total( The total amount of items to be loaded.)
    */
  var onProgress: js.Function3[String, Double, Double, _] = js.native
  /**
    * The function that needs to be called when an item errors. The argument is the url that caused the error.
    */
  var onError: js.Function1[String,_] = js.native

  /**
    * This should be called by any loader used by the manager when the loader starts loading an url. These shouldn't be called outside a loader.
    * @param url the url to load
    */
  def itemStart(url: String): Unit = js.native

  /**
    * This should be called by any loader used by the manager when the loader ended loading an url. These shouldn't be called outside a loader.
    * @param url the loaded url
    */
  def itemEnd(url: String): Unit = js.native
}

/**
  * A loader for loading a [[Material]] in JSON format.
  * @param manager The loadingManager for the loader to use. Default is [[THREE.DefaultLoadingManager]].
  * @constructor Creates a new MaterialLoader.
  * @see [[http://threejs.org/docs/#Reference/Loaders/MaterialLoader]]
  */
@js.native
@JSName("THREE.MaterialLoader")
class MaterialLoader(manager: LoadingManager = js.native) extends LoaderBase[Material] {

  override def load(url: String, onLoad: js.Function1[Material, _] = js.native, onProgress: js.Function1[ProgressEvent, _] = js.native, onError: js.Function1[js.Any,_] = js.native): Unit = js.native


  /**
    * Parse a JSON structure and create a new Material of the type json.type with parameters defined in the json object.
    * @param json The json object containing the parameters of the Material.
    */
  def parse(json: js.Any): Material = js.native
}

/**
  * A loader for loading a JSON resource. Unlike the JSONLoader, this one make use of the .type attributes of objects to map them to their original classes.
  * @constructor Creates a new ObjectLoader.
  * @param manager The loadingManager for the loader to use. Default is THREE.DefaultLoadingManager.
  * @see [[http://threejs.org/docs/#Reference/Loaders/ObjectLoader]]
  */
@js.native
@JSName("THREE.ObjectLoader")
class ObjectLoader(manager: LoadingManager = js.native) extends LoaderBase[Object3D] {

  override def load(url: String, onLoad: js.Function1[Object3D, _], onProgress: js.Function1[ProgressEvent, _] = js.native, onError: js.Function1[js.Any,_] = js.native): Unit = js.native

  override def setCrossOrigin(crossOrigin: String): Unit = js.native

  /** Parse a JSON content and return a threejs object. */
  def parse[T <: Object3D](json: js.Any): T = js.native
  def parseGeometries(json: js.Any): js.Array[js.Any] = js.native
  def parseMaterials(json: js.Any): js.Array[Material] = js.native
  def parseObject[T <: Object3D](data: js.Any, geometries: js.Array[js.Any], materials: js.Array[Material]): T = js.native
}

/**
  * Class for loading a [[Texture]].
  * @see [[http://threejs.org/docs/#Reference/Loaders/TextureLoader]]
  * @constructor Creates a new TextureLoader.
  * @param manager The loadingManager for the loader to use. Default is THREE.DefaultLoadingManager.
  */
@js.native
@JSName("THREE.TextureLoader")
class TextureLoader(manager: LoadingManager = js.native) extends LoaderBase[Texture] {
  var crossOrigin: String = js.native

  override def load(url: String, onLoad: js.Function1[Texture, _], onProgress: js.Function1[ProgressEvent, _], onError: js.Function1[js.Any,_] = js.native): Unit = js.native
  override def setCrossOrigin(crossOrigin: String): Unit = js.native
}

/**
  * Class for loading a [[CompressedTexture]].
  * @see [[https://github.com/mrdoob/three.js/blob/master/src/loaders/CompressedTextureLoader.js]]
  * @constructor Creates a new CompressedTextureLoader.
  * @param manager The loadingManager for the loader to use. Default is THREE.DefaultLoadingManager.
  */
@js.native
@JSName("THREE.CompressedTextureLoader")
abstract class CompressedTextureLoader(manager: LoadingManager = js.native) extends LoaderBase[CompressedTexture]

/**
  * A low level class for loading resources with XmlHttpRequest, used internally by most loaders.
  * @constructor Creates a new XHRLoader.
  * @param manager The loadingManager for the loader to use. Default is [[THREE.DefaultLoadingManager]].
  * @see [[http://threejs.org/docs/#Reference/Loaders/XHRLoader]]
  */
@js.native
@JSName("THREE.XHRLoader")
class XHRLoader(manager: LoadingManager = js.native)  extends LoaderBase[js.Any] {

  /** A cache instance that hold the response from each request made through this loader, so each file is requested once. */
  def cache: Cache = js.native

  /** Can be set to change the response type. */
  var responseType: String = js.native

  override def load(url: String, onLoad: js.Function1[js.Any, _] = js.native, onProgress: js.Function1[ProgressEvent, _] = js.native, onError: js.Function1[js.Any, _] = js.native): Unit = js.native

  override def setCrossOrigin(crossOrigin: String): Unit = js.native

  /**
    * the empty string (default), "arraybuffer", "blob", "document", "json", or "text".
    * @see [[XMLHttpRequest.responseType]]
    */
  def setResponseType(responseType: String): Unit = js.native
}
