package com.devijoe.model.texture_module;


import com.devijoe.model.model_direction.CompassDirection;
import lombok.Data;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Класс хранит в себе именнованную метадату по позиционированию кортежей текстур в атласе
 */
public enum TextureType {


    YELLOW_STANDARD_TANK(asList(
            new Container(0 * TextureType.TANK_TEXTURE_SIZE, 0 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.NORTH),
            new Container(2 * TextureType.TANK_TEXTURE_SIZE, 0 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.EAST),
            new Container(4 * TextureType.TANK_TEXTURE_SIZE, 0 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.SOUTH),
            new Container(6 * TextureType.TANK_TEXTURE_SIZE, 0 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.WEST)
    )),

    GREEN_STANDARD_TANK(asList(
            new Container(0 * TextureType.TANK_TEXTURE_SIZE, 8 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.NORTH),
            new Container(2 * TextureType.TANK_TEXTURE_SIZE, 8 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.EAST),
            new Container(4 * TextureType.TANK_TEXTURE_SIZE, 8 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.SOUTH),
            new Container(6 * TextureType.TANK_TEXTURE_SIZE, 8 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.WEST)
    )),

    WHITE_STANDARD_TANK(asList(
            new Container(8 * TextureType.TANK_TEXTURE_SIZE, 0 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.NORTH),
            new Container(10 * TextureType.TANK_TEXTURE_SIZE, 0 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.EAST),
            new Container(12 * TextureType.TANK_TEXTURE_SIZE, 0 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.SOUTH),
            new Container(14 * TextureType.TANK_TEXTURE_SIZE, 0 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.WEST)
    )),

    PURPLE_STANDARD_TANK(asList(
            new Container(8 * TextureType.TANK_TEXTURE_SIZE, 8 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.NORTH),
            new Container(10 * TextureType.TANK_TEXTURE_SIZE, 8 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.EAST),
            new Container(12 * TextureType.TANK_TEXTURE_SIZE, 8 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.SOUTH),
            new Container(14 * TextureType.TANK_TEXTURE_SIZE, 8 * TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, TextureType.TANK_TEXTURE_SIZE, CompassDirection.WEST)
    ));

    /** Размер текстуры танка */
    public static final int TANK_TEXTURE_SIZE = 16;

    /** Контейнер, описывающий конкретную текстуру */


    public static class Container {
        /** Координата X верхнего левого угла */
        @Getter
        private int x;
        /** Координата Y верхнего левого угла */
        @Getter
        private int y;
        /** Ширина */
        @Getter
        private int w;
        /** Высота */
        @Getter
        private int h;

        /** Уникальное ключевое значение текстуры */
        @Getter
        Enum anEnum;

        public Container(int x, int y, int w, int h, Enum anEnum) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.anEnum = anEnum;
        }
    }

    /** Лист, внутри которого заложена метадата по каждой конкретной текстуре {@code Container} */
    @Getter
    private List<Container> textureContext;


    TextureType(List<Container> textureContext) {
        this.textureContext = textureContext;
    }

}
