package org.denigma.threejs.textures

import org.denigma.threejs.math.Vector2
import org.scalajs.dom._
import org.denigma.threejs._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.Texture")
class Texture extends js.Object {
  def this(image: js.Any, mapping: Mapping = js.native, wrapS: Wrapping = js.native, wrapT: Wrapping = js.native, magFilter: TextureFilter = js.native, minFilter: TextureFilter = js.native, format: PixelFormat = js.native, `type`: TextureDataType = js.native, anisotropy: Double = js.native) = this()
  var id: Double = js.native
  var uuid: String = js.native
  var name: String = js.native
  var image: js.Any = js.native
  var mipmaps: js.Array[ImageData] = js.native
  var mapping: Mapping = js.native
  var wrapS: Wrapping = js.native
  var wrapT: Wrapping = js.native
  var magFilter: TextureFilter = js.native
  var minFilter: TextureFilter = js.native
  var anisotropy: Double = js.native
  var format: PixelFormat = js.native
  var `type`: TextureDataType = js.native
  var offset: Vector2 = js.native
  var repeat: Vector2 = js.native
  var generateMipmaps: Boolean = js.native
  var premultiplyAlpha: Boolean = js.native
  var flipY: Boolean = js.native
  var unpackAlignment: Double = js.native
  var needsUpdate: Boolean = js.native
  var onUpdate: js.Function0[Unit] = js.native
  override def clone(): Texture = js.native
  def update(): Unit = js.native
  def dispose(): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[js.Any, _]): Unit = js.native
  def hasEventListener(`type`: String, listener: js.Function1[js.Any, _]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[js.Any, _]): Unit = js.native
  def dispatchEvent(event: js.Any): Unit = js.native
}

@js.native
@JSName("THREE.Texture")
object Texture extends js.Object {
  var DEFAULT_IMAGE: js.Any = js.native
  var DEFAULT_MAPPING: js.Any = js.native
}

@js.native
@JSName("THREE.CompressedTexture")
class CompressedTexture extends Texture {
  def this(mipmaps: js.Array[ImageData], width: Double, height: Double, format: PixelFormat = js.native, `type`: TextureDataType = js.native, mapping: Mapping = js.native, wrapS: Wrapping = js.native, wrapT: Wrapping = js.native, magFilter: TextureFilter = js.native, minFilter: TextureFilter = js.native, anisotropy: Double = js.native) = this()

  override def clone(): CompressedTexture = js.native
}

@js.native
@JSName("THREE.CubeTexture")
class CubeTexture extends Texture {
  def this(images: js.Array[js.Any], mapping: Mapping = js.native, wrapS: Wrapping = js.native, wrapT: Wrapping = js.native, magFilter: TextureFilter = js.native, minFilter: TextureFilter = js.native, format: PixelFormat = js.native, `type`: TextureDataType = js.native, anisotropy: Double = js.native) = this()
  var images: js.Array[js.Any] = js.native
  def clone(texture: CubeTexture): CubeTexture = js.native
}

@js.native
@JSName("THREE.DataTexture")
class DataTexture extends Texture {
  def this(data: ImageData, width: Double, height: Double, format: PixelFormat, `type`: TextureDataType, mapping: Mapping, wrapS: Wrapping, wrapT: Wrapping, magFilter: TextureFilter, minFilter: TextureFilter, anisotropy: Double = js.native) = this()

  override def clone(): DataTexture = js.native
}