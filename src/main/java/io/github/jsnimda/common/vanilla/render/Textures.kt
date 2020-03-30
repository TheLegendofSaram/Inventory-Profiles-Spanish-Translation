package io.github.jsnimda.common.vanilla.render

import io.github.jsnimda.common.vanilla.DrawableHelper
import io.github.jsnimda.common.vanilla.Identifier
import io.github.jsnimda.common.vanilla.Vanilla

fun bindTexture(identifier: Identifier) {
  Vanilla.textureManager().bindTexture(identifier)
  enableBlend()
}

// for 256 x 256 texture
fun blit(screenX: Int, screenY: Int, textureX: Int, textureY: Int, width: Int, height: Int) {
  DrawableHelper.blit(screenX, screenY, 0, textureX.toFloat(), textureY.toFloat(), width, height, 256, 256)
}
