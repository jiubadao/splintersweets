/*
 * Copyright (c) 2017. Marius Reimer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.reimerm.splintersweets

import com.badlogic.gdx.Files
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import de.reimerm.splintersweets.main.MainGame
import de.reimerm.splintersweets.utils.GameSettings

object DesktopLauncher {

    @JvmStatic
    fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()
        config.resizable = false
        config.addIcon("ic_launcher.png", Files.FileType.Internal)
        config.title = "Splinter Sweets"
        config.width = (GameSettings.WIDTH * 1.25f).toInt()
        config.height = (GameSettings.HEIGHT * 1.25f).toInt()
        LwjglApplication(MainGame, config)
    }
}