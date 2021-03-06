package com.github.dogsunny.bpehelper

import com.intellij.openapi.util.IconLoader

object Const {
    object Icon {
        object File {
            val DESCRIPTION = IconLoader.getIcon("/icon/description_file.svg", this.javaClass)
            val DESCRIPTION_NONE = IconLoader.getIcon("/icon/description_none.svg", this.javaClass)
            val FLOW = IconLoader.getIcon("/icon/flow_file.svg", this.javaClass)
            val FLOW_NONE = IconLoader.getIcon("/icon/flow_none.svg", this.javaClass)
        }
        object Flag {
            object Service {
                val EXTERNAL = IconLoader.getIcon("/icon/flag/service/external.svg", this.javaClass)
                val INTERNAL = IconLoader.getIcon("/icon/flag/service/internal.svg", this.javaClass)
                val PUBLIC = IconLoader.getIcon("/icon/flag/service/public.svg", this.javaClass)
                val UNKNOWN = IconLoader.getIcon("/icon/flag/service/unknown.svg", this.javaClass)
                val NONE = IconLoader.getIcon("/icon/flag/service/none.svg", this.javaClass)

                val NAME_MAP = mapOf(
                    EXTERNAL to "依赖服务",
                    INTERNAL to "内部服务",
                    PUBLIC to "开放服务",
                    UNKNOWN to "未知服务",
                    NONE to  "没有找到"
                )
            }
            object Flow {
                val REFERENCE = IconLoader.getIcon("/icon/flag/flow/reference.svg", this.javaClass)
                val REFERENCE_NONE = IconLoader.getIcon("/icon/flag/flow/reference_none.svg", this.javaClass)
            }
        }
    }
    object Magic {
        object Filename {
            const val AVENUE_CONF = "avenue_conf"
            const val EXTERNAL = "external"
            const val INTERNAL = "internal"
        }
        object XmlNode {
            const val MESSAGE = "message"
            const val SERVICE = "service"
        }
        object XmlAttr {
            const val ID = "id"
            const val NAME = "name"
        }
    }
}