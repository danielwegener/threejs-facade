package org.denigma.threejs

import org.denigma.threejs.materials.Material
import org.denigma.threejs.math.Color
import org.denigma.threejs.textures.Texture

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

package object legacy {

  @js.native
  @JSName("THREE.PointCloudMaterial")
  class PointCloudMaterial extends Material {
    def this(parameters: PointCloudMaterialParameters = js.native) = this()
    var color: Color = js.native
    var map: Texture = js.native
    var size: Double = js.native
    var sizeAttenuation: Boolean = js.native
    var vertexColors: Boolean = js.native
    var fog: Boolean = js.native
    override def clone(): PointCloudMaterial = js.native
  }

  @js.native
  @JSName("THREE.ParticleBasicMaterial")
  class ParticleBasicMaterial extends PointCloudMaterial {
  }

  @js.native
  @JSName("THREE.ParticleSystemMaterial")
  class ParticleSystemMaterial extends PointCloudMaterial {
  }

}
