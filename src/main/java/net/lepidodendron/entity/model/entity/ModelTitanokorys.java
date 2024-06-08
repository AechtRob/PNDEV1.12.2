package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelTitanokorys extends AdvancedModelBase {
    private final AdvancedModelRenderer Titanokorys;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer FRONT;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer FRONT2;
    private final AdvancedModelRenderer HOOD1;
    private final AdvancedModelRenderer HOOD1LEFT1;
    private final AdvancedModelRenderer HOOD1LEFT2;
    private final AdvancedModelRenderer HOOD1RIGHT1;
    private final AdvancedModelRenderer HOOD1RIGHT2;
    private final AdvancedModelRenderer HOOD2;
    private final AdvancedModelRenderer HOOD2LEFT1;
    private final AdvancedModelRenderer HOOD2LEFT2;
    private final AdvancedModelRenderer HOOD2RIGHT1;
    private final AdvancedModelRenderer HOOD2RIGHT2;
    private final AdvancedModelRenderer HOOD3;
    private final AdvancedModelRenderer HOOD3LEFT1;
    private final AdvancedModelRenderer HOOD3LEFT2;
    private final AdvancedModelRenderer HOOD3RIGHT1;
    private final AdvancedModelRenderer HOOD3RIGHT2;
    private final AdvancedModelRenderer LEFTMANTLE1;
    private final AdvancedModelRenderer LEFTMANTLE2;
    private final AdvancedModelRenderer LEFTMANTLE3;
    private final AdvancedModelRenderer RIGHTMANTLE1;
    private final AdvancedModelRenderer RIGHTMANTLE2;
    private final AdvancedModelRenderer RIGHTMANTLE3;
    private final AdvancedModelRenderer leftFin1;
    private final AdvancedModelRenderer rightFin1;
    private final AdvancedModelRenderer appendageLeft;
    private final AdvancedModelRenderer leftFeeler1;
    private final AdvancedModelRenderer leftFeeler2;
    private final AdvancedModelRenderer leftFeeler3;
    private final AdvancedModelRenderer leftFeeler4;
    private final AdvancedModelRenderer leftFeeler5;
    private final AdvancedModelRenderer appendageRight;
    private final AdvancedModelRenderer rightFeeler1;
    private final AdvancedModelRenderer rightFeeler2;
    private final AdvancedModelRenderer rightFeeler3;
    private final AdvancedModelRenderer rightFeeler4;
    private final AdvancedModelRenderer rightFeeler5;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer leftFin2;
    private final AdvancedModelRenderer rightFin2;
    private final AdvancedModelRenderer leftFin3;
    private final AdvancedModelRenderer rightFin3;
    private final AdvancedModelRenderer leftFin4;
    private final AdvancedModelRenderer rightFin4;
    private final AdvancedModelRenderer leftFin5;
    private final AdvancedModelRenderer rightFin5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftFin6;
    private final AdvancedModelRenderer rightFin6;
    private final AdvancedModelRenderer leftFin7;
    private final AdvancedModelRenderer rightFin7;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer leftFin8;
    private final AdvancedModelRenderer rightFin8;
    private final AdvancedModelRenderer leftFin9;
    private final AdvancedModelRenderer rightFin9;
    private final AdvancedModelRenderer leftFin10;
    private final AdvancedModelRenderer rightFin10;

    public ModelTitanokorys() {
        this.textureWidth = 59;
        this.textureHeight = 54;

        this.Titanokorys = new AdvancedModelRenderer(this);
        this.Titanokorys.setRotationPoint(0.0F, 20.75F, 0.0F);
        this.Titanokorys.cubeList.add(new ModelBox(Titanokorys, 0, 0, -4.5F, -2.75F, -5.0F, 9, 6, 9, 0.0F, false));
        this.Titanokorys.cubeList.add(new ModelBox(Titanokorys, 20, 33, -1.0F, -4.5F, 1.0F, 2, 2, 0, 0.0F, false));
        this.Titanokorys.cubeList.add(new ModelBox(Titanokorys, 22, 17, 3.75F, -3.0F, 2.25F, 1, 1, 2, 0.0F, false));
        this.Titanokorys.cubeList.add(new ModelBox(Titanokorys, 22, 17, -4.75F, -3.0F, 2.25F, 1, 1, 2, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -4.5F, 1.0F);
        this.Titanokorys.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 26, -4.0F, 0.0F, -0.05F, 4, 2, 0, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -4.5F, 1.0F);
        this.Titanokorys.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 26, 0.0F, 0.0F, -0.05F, 4, 2, 0, 0.0F, false));

        this.FRONT = new AdvancedModelRenderer(this);
        this.FRONT.setRotationPoint(0.0F, 3.0F, -5.0F);
        this.Titanokorys.addChild(FRONT);
        this.setRotateAngle(FRONT, -0.3927F, 0.0F, 0.0F);
        this.FRONT.cubeList.add(new ModelBox(FRONT, 38, 19, -3.0F, -2.0F, -8.0F, 6, 2, 4, 0.01F, false));
        this.FRONT.cubeList.add(new ModelBox(FRONT, 0, 32, -1.0F, -3.35F, -8.0F, 2, 2, 0, 0.0F, false));
        this.FRONT.cubeList.add(new ModelBox(FRONT, 27, 30, -4.0F, -4.0F, -4.0F, 8, 4, 4, 0.0F, false));
        this.FRONT.cubeList.add(new ModelBox(FRONT, 47, 0, -1.5F, -0.65F, -6.0F, 3, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -3.35F, -8.0F);
        this.FRONT.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.4712F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -2.3F, 0.0F, 0.05F, 1, 2, 0, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 29, -2.0F, 0.0F, 0.03F, 2, 2, 0, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -3.35F, -8.0F);
        this.FRONT.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.4712F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 1.3F, 0.0F, 0.05F, 1, 2, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 29, 0.0F, 0.0F, 0.03F, 2, 2, 0, 0.0F, false));

        this.FRONT2 = new AdvancedModelRenderer(this);
        this.FRONT2.setRotationPoint(0.0F, -2.0F, -8.0F);
        this.FRONT.addChild(FRONT2);
        this.setRotateAngle(FRONT2, 0.48F, 0.0F, 0.0F);
        this.FRONT2.cubeList.add(new ModelBox(FRONT2, 0, 29, -3.0F, 0.0F, 0.0F, 6, 2, 7, -0.01F, false));

        this.HOOD1 = new AdvancedModelRenderer(this);
        this.HOOD1.setRotationPoint(0.0F, -4.5F, 5.0F);
        this.Titanokorys.addChild(HOOD1);
        this.HOOD1.cubeList.add(new ModelBox(HOOD1, 28, 9, -1.0F, 0.0F, -9.0F, 2, 0, 9, 0.0F, false));

        this.HOOD1LEFT1 = new AdvancedModelRenderer(this);
        this.HOOD1LEFT1.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.HOOD1.addChild(HOOD1LEFT1);
        this.setRotateAngle(HOOD1LEFT1, 0.0F, 0.0F, 0.3927F);
        this.HOOD1LEFT1.cubeList.add(new ModelBox(HOOD1LEFT1, 20, 20, 0.0F, 0.0F, -9.0F, 4, 0, 9, 0.0F, false));

        this.HOOD1LEFT2 = new AdvancedModelRenderer(this);
        this.HOOD1LEFT2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.HOOD1LEFT1.addChild(HOOD1LEFT2);
        this.setRotateAngle(HOOD1LEFT2, 0.0F, 0.0F, 0.5672F);
        this.HOOD1LEFT2.cubeList.add(new ModelBox(HOOD1LEFT2, 28, 0, 0.0F, 0.0F, -9.0F, 5, 0, 8, 0.0F, false));

        this.HOOD1RIGHT1 = new AdvancedModelRenderer(this);
        this.HOOD1RIGHT1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.HOOD1.addChild(HOOD1RIGHT1);
        this.setRotateAngle(HOOD1RIGHT1, 0.0F, 0.0F, -0.3927F);
        this.HOOD1RIGHT1.cubeList.add(new ModelBox(HOOD1RIGHT1, 20, 20, -4.0F, 0.0F, -9.0F, 4, 0, 9, 0.0F, true));

        this.HOOD1RIGHT2 = new AdvancedModelRenderer(this);
        this.HOOD1RIGHT2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.HOOD1RIGHT1.addChild(HOOD1RIGHT2);
        this.setRotateAngle(HOOD1RIGHT2, 0.0F, 0.0F, -0.5672F);
        this.HOOD1RIGHT2.cubeList.add(new ModelBox(HOOD1RIGHT2, 28, 0, -5.0F, 0.0F, -9.0F, 5, 0, 8, 0.0F, true));

        this.HOOD2 = new AdvancedModelRenderer(this);
        this.HOOD2.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.HOOD1.addChild(HOOD2);
        this.setRotateAngle(HOOD2, 0.1309F, 0.0F, 0.0F);
        this.HOOD2.cubeList.add(new ModelBox(HOOD2, 32, 45, -1.0F, 0.0F, -5.0F, 2, 0, 5, 0.0F, false));

        this.HOOD2LEFT1 = new AdvancedModelRenderer(this);
        this.HOOD2LEFT1.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.HOOD2.addChild(HOOD2LEFT1);
        this.setRotateAngle(HOOD2LEFT1, 0.0F, 0.0F, 0.3927F);
        this.HOOD2LEFT1.cubeList.add(new ModelBox(HOOD2LEFT1, 29, 39, 0.0F, 0.0F, -5.0F, 4, 0, 5, 0.0F, false));

        this.HOOD2LEFT2 = new AdvancedModelRenderer(this);
        this.HOOD2LEFT2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.HOOD2LEFT1.addChild(HOOD2LEFT2);
        this.setRotateAngle(HOOD2LEFT2, 0.0F, 0.0F, 0.5672F);
        this.HOOD2LEFT2.cubeList.add(new ModelBox(HOOD2LEFT2, 8, 39, 0.0F, 0.0F, -5.0F, 5, 0, 5, 0.0F, false));

        this.HOOD2RIGHT1 = new AdvancedModelRenderer(this);
        this.HOOD2RIGHT1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.HOOD2.addChild(HOOD2RIGHT1);
        this.setRotateAngle(HOOD2RIGHT1, 0.0F, 0.0F, -0.3927F);
        this.HOOD2RIGHT1.cubeList.add(new ModelBox(HOOD2RIGHT1, 29, 39, -4.0F, 0.0F, -5.0F, 4, 0, 5, 0.0F, true));

        this.HOOD2RIGHT2 = new AdvancedModelRenderer(this);
        this.HOOD2RIGHT2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.HOOD2RIGHT1.addChild(HOOD2RIGHT2);
        this.setRotateAngle(HOOD2RIGHT2, 0.0F, 0.0F, -0.5672F);
        this.HOOD2RIGHT2.cubeList.add(new ModelBox(HOOD2RIGHT2, 8, 39, -5.0F, 0.0F, -5.0F, 5, 0, 5, 0.0F, true));

        this.HOOD3 = new AdvancedModelRenderer(this);
        this.HOOD3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.HOOD2.addChild(HOOD3);
        this.setRotateAngle(HOOD3, 0.1745F, 0.0F, 0.0F);
        this.HOOD3.cubeList.add(new ModelBox(HOOD3, 43, 44, -1.0F, 0.0F, -5.0F, 2, 0, 5, 0.0F, false));
        this.HOOD3.cubeList.add(new ModelBox(HOOD3, 32, 16, -0.5F, 0.0F, -6.0F, 1, 0, 1, 0.0F, false));

        this.HOOD3LEFT1 = new AdvancedModelRenderer(this);
        this.HOOD3LEFT1.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.HOOD3.addChild(HOOD3LEFT1);
        this.setRotateAngle(HOOD3LEFT1, 0.0F, 0.0F, 0.3927F);
        this.HOOD3LEFT1.cubeList.add(new ModelBox(HOOD3LEFT1, 42, 9, 0.0F, 0.0F, -5.0F, 4, 0, 5, 0.0F, false));

        this.HOOD3LEFT2 = new AdvancedModelRenderer(this);
        this.HOOD3LEFT2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.HOOD3LEFT1.addChild(HOOD3LEFT2);
        this.setRotateAngle(HOOD3LEFT2, 0.0F, 0.0F, 0.5672F);
        this.HOOD3LEFT2.cubeList.add(new ModelBox(HOOD3LEFT2, 43, 39, 0.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, false));

        this.HOOD3RIGHT1 = new AdvancedModelRenderer(this);
        this.HOOD3RIGHT1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.HOOD3.addChild(HOOD3RIGHT1);
        this.setRotateAngle(HOOD3RIGHT1, 0.0F, 0.0F, -0.3927F);
        this.HOOD3RIGHT1.cubeList.add(new ModelBox(HOOD3RIGHT1, 42, 9, -4.0F, 0.0F, -5.0F, 4, 0, 5, 0.0F, true));

        this.HOOD3RIGHT2 = new AdvancedModelRenderer(this);
        this.HOOD3RIGHT2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.HOOD3RIGHT1.addChild(HOOD3RIGHT2);
        this.setRotateAngle(HOOD3RIGHT2, 0.0F, 0.0F, -0.5672F);
        this.HOOD3RIGHT2.cubeList.add(new ModelBox(HOOD3RIGHT2, 43, 39, -4.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, true));

        this.LEFTMANTLE1 = new AdvancedModelRenderer(this);
        this.LEFTMANTLE1.setRotationPoint(4.65F, -2.95F, 1.0F);
        this.Titanokorys.addChild(LEFTMANTLE1);
        this.setRotateAngle(LEFTMANTLE1, 0.0175F, 0.0F, -0.0873F);
        this.LEFTMANTLE1.cubeList.add(new ModelBox(LEFTMANTLE1, 0, 39, 0.0F, 0.0F, -6.0F, 0, 5, 7, 0.0F, false));

        this.LEFTMANTLE2 = new AdvancedModelRenderer(this);
        this.LEFTMANTLE2.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.LEFTMANTLE1.addChild(LEFTMANTLE2);
        this.setRotateAngle(LEFTMANTLE2, 0.0524F, 0.1571F, 0.0F);
        this.LEFTMANTLE2.cubeList.add(new ModelBox(LEFTMANTLE2, 0, 0, 0.0F, 0.0F, -4.0F, 0, 4, 4, 0.0F, false));

        this.LEFTMANTLE3 = new AdvancedModelRenderer(this);
        this.LEFTMANTLE3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.LEFTMANTLE2.addChild(LEFTMANTLE3);
        this.setRotateAngle(LEFTMANTLE3, 0.0436F, 0.2269F, 0.0F);
        this.LEFTMANTLE3.cubeList.add(new ModelBox(LEFTMANTLE3, 0, 16, 0.0F, 0.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.RIGHTMANTLE1 = new AdvancedModelRenderer(this);
        this.RIGHTMANTLE1.setRotationPoint(-4.65F, -2.95F, 1.0F);
        this.Titanokorys.addChild(RIGHTMANTLE1);
        this.setRotateAngle(RIGHTMANTLE1, 0.0175F, 0.0F, 0.0873F);
        this.RIGHTMANTLE1.cubeList.add(new ModelBox(RIGHTMANTLE1, 0, 39, 0.0F, 0.0F, -6.0F, 0, 5, 7, 0.0F, true));

        this.RIGHTMANTLE2 = new AdvancedModelRenderer(this);
        this.RIGHTMANTLE2.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.RIGHTMANTLE1.addChild(RIGHTMANTLE2);
        this.setRotateAngle(RIGHTMANTLE2, 0.0524F, -0.1571F, 0.0F);
        this.RIGHTMANTLE2.cubeList.add(new ModelBox(RIGHTMANTLE2, 0, 0, 0.0F, 0.0F, -4.0F, 0, 4, 4, 0.0F, true));

        this.RIGHTMANTLE3 = new AdvancedModelRenderer(this);
        this.RIGHTMANTLE3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.RIGHTMANTLE2.addChild(RIGHTMANTLE3);
        this.setRotateAngle(RIGHTMANTLE3, 0.0436F, -0.2269F, 0.0F);
        this.RIGHTMANTLE3.cubeList.add(new ModelBox(RIGHTMANTLE3, 0, 16, 0.0F, 0.0F, -3.0F, 0, 2, 3, 0.0F, true));

        this.leftFin1 = new AdvancedModelRenderer(this);
        this.leftFin1.setRotationPoint(4.5F, -0.35F, 3.0F);
        this.Titanokorys.addChild(leftFin1);
        this.leftFin1.cubeList.add(new ModelBox(leftFin1, 20, 30, -0.75F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.rightFin1 = new AdvancedModelRenderer(this);
        this.rightFin1.setRotationPoint(-4.5F, -0.35F, 3.0F);
        this.Titanokorys.addChild(rightFin1);
        this.rightFin1.cubeList.add(new ModelBox(rightFin1, 20, 30, -1.25F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.appendageLeft = new AdvancedModelRenderer(this);
        this.appendageLeft.setRotationPoint(1.5F, -1.5F, -11.8F);
        this.Titanokorys.addChild(appendageLeft);
        this.setRotateAngle(appendageLeft, -0.5672F, 0.3054F, 0.0F);
        this.appendageLeft.cubeList.add(new ModelBox(appendageLeft, 28, 3, -0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));
        this.appendageLeft.cubeList.add(new ModelBox(appendageLeft, 5, 0, -0.5F, 2.5F, 0.75F, 1, 2, 0, 0.0F, false));
        this.appendageLeft.cubeList.add(new ModelBox(appendageLeft, 0, 16, -0.5F, 3.0F, 0.5F, 1, 1, 0, 0.0F, false));
        this.appendageLeft.cubeList.add(new ModelBox(appendageLeft, 0, 16, -0.5F, 2.5F, 0.25F, 1, 1, 0, 0.0F, false));

        this.leftFeeler1 = new AdvancedModelRenderer(this);
        this.leftFeeler1.setRotationPoint(0.0F, 2.9F, 1.0F);
        this.appendageLeft.addChild(leftFeeler1);
        this.setRotateAngle(leftFeeler1, -0.6109F, 0.0F, 0.0F);
        this.leftFeeler1.cubeList.add(new ModelBox(leftFeeler1, 48, 26, -0.5F, 0.0F, -0.5F, 1, 0, 4, 0.0F, false));

        this.leftFeeler2 = new AdvancedModelRenderer(this);
        this.leftFeeler2.setRotationPoint(0.0F, 2.6F, 1.0F);
        this.appendageLeft.addChild(leftFeeler2);
        this.setRotateAngle(leftFeeler2, -0.48F, 0.0F, 0.0F);
        this.leftFeeler2.cubeList.add(new ModelBox(leftFeeler2, 48, 26, -0.5F, 0.0F, -0.4F, 1, 0, 4, 0.0F, false));

        this.leftFeeler3 = new AdvancedModelRenderer(this);
        this.leftFeeler3.setRotationPoint(0.0F, 2.3F, 1.0F);
        this.appendageLeft.addChild(leftFeeler3);
        this.setRotateAngle(leftFeeler3, -0.3491F, 0.0F, 0.0F);
        this.leftFeeler3.cubeList.add(new ModelBox(leftFeeler3, 48, 26, -0.5F, 0.0F, -0.3F, 1, 0, 4, 0.0F, false));

        this.leftFeeler4 = new AdvancedModelRenderer(this);
        this.leftFeeler4.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.appendageLeft.addChild(leftFeeler4);
        this.setRotateAngle(leftFeeler4, -0.2182F, 0.0F, 0.0F);
        this.leftFeeler4.cubeList.add(new ModelBox(leftFeeler4, 48, 26, -0.5F, 0.0F, -0.2F, 1, 0, 4, 0.0F, false));

        this.leftFeeler5 = new AdvancedModelRenderer(this);
        this.leftFeeler5.setRotationPoint(0.0F, 1.7F, 1.0F);
        this.appendageLeft.addChild(leftFeeler5);
        this.setRotateAngle(leftFeeler5, -0.0873F, 0.0F, 0.0F);
        this.leftFeeler5.cubeList.add(new ModelBox(leftFeeler5, 48, 26, -0.5F, 0.0F, -0.1F, 1, 0, 4, 0.0F, false));

        this.appendageRight = new AdvancedModelRenderer(this);
        this.appendageRight.setRotationPoint(-1.5F, -1.5F, -11.8F);
        this.Titanokorys.addChild(appendageRight);
        this.setRotateAngle(appendageRight, -0.5672F, -0.3054F, 0.0F);
        this.appendageRight.cubeList.add(new ModelBox(appendageRight, 28, 3, -0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F, true));
        this.appendageRight.cubeList.add(new ModelBox(appendageRight, 5, 0, -0.5F, 2.5F, 0.75F, 1, 2, 0, 0.0F, true));
        this.appendageRight.cubeList.add(new ModelBox(appendageRight, 0, 16, -0.5F, 3.0F, 0.5F, 1, 1, 0, 0.0F, true));
        this.appendageRight.cubeList.add(new ModelBox(appendageRight, 0, 16, -0.5F, 2.5F, 0.25F, 1, 1, 0, 0.0F, true));

        this.rightFeeler1 = new AdvancedModelRenderer(this);
        this.rightFeeler1.setRotationPoint(0.0F, 2.9F, 1.0F);
        this.appendageRight.addChild(rightFeeler1);
        this.setRotateAngle(rightFeeler1, -0.6109F, 0.0F, 0.0F);
        this.rightFeeler1.cubeList.add(new ModelBox(rightFeeler1, 48, 26, -0.5F, 0.0F, -0.5F, 1, 0, 4, 0.0F, true));

        this.rightFeeler2 = new AdvancedModelRenderer(this);
        this.rightFeeler2.setRotationPoint(0.0F, 2.6F, 1.0F);
        this.appendageRight.addChild(rightFeeler2);
        this.setRotateAngle(rightFeeler2, -0.48F, 0.0F, 0.0F);
        this.rightFeeler2.cubeList.add(new ModelBox(rightFeeler2, 48, 26, -0.5F, 0.0F, -0.4F, 1, 0, 4, 0.0F, true));

        this.rightFeeler3 = new AdvancedModelRenderer(this);
        this.rightFeeler3.setRotationPoint(0.0F, 2.3F, 1.0F);
        this.appendageRight.addChild(rightFeeler3);
        this.setRotateAngle(rightFeeler3, -0.3491F, 0.0F, 0.0F);
        this.rightFeeler3.cubeList.add(new ModelBox(rightFeeler3, 48, 26, -0.5F, 0.0F, -0.3F, 1, 0, 4, 0.0F, true));

        this.rightFeeler4 = new AdvancedModelRenderer(this);
        this.rightFeeler4.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.appendageRight.addChild(rightFeeler4);
        this.setRotateAngle(rightFeeler4, -0.2182F, 0.0F, 0.0F);
        this.rightFeeler4.cubeList.add(new ModelBox(rightFeeler4, 48, 26, -0.5F, 0.0F, -0.2F, 1, 0, 4, 0.0F, true));

        this.rightFeeler5 = new AdvancedModelRenderer(this);
        this.rightFeeler5.setRotationPoint(0.0F, 1.7F, 1.0F);
        this.appendageRight.addChild(rightFeeler5);
        this.setRotateAngle(rightFeeler5, -0.0873F, 0.0F, 0.0F);
        this.rightFeeler5.cubeList.add(new ModelBox(rightFeeler5, 48, 26, -0.5F, 0.0F, -0.1F, 1, 0, 4, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Titanokorys.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 16, -3.5F, -2.5F, -0.5F, 7, 5, 7, -0.01F, false));

        this.leftFin2 = new AdvancedModelRenderer(this);
        this.leftFin2.setRotationPoint(3.5F, -0.3F, 1.5F);
        this.body1.addChild(leftFin2);
        this.leftFin2.cubeList.add(new ModelBox(leftFin2, 20, 30, 0.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.rightFin2 = new AdvancedModelRenderer(this);
        this.rightFin2.setRotationPoint(-3.5F, -0.3F, 1.5F);
        this.body1.addChild(rightFin2);
        this.rightFin2.cubeList.add(new ModelBox(rightFin2, 20, 30, -2.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.leftFin3 = new AdvancedModelRenderer(this);
        this.leftFin3.setRotationPoint(3.5F, -0.25F, 3.5F);
        this.body1.addChild(leftFin3);
        this.leftFin3.cubeList.add(new ModelBox(leftFin3, 20, 30, -0.25F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.rightFin3 = new AdvancedModelRenderer(this);
        this.rightFin3.setRotationPoint(-3.5F, -0.25F, 3.5F);
        this.body1.addChild(rightFin3);
        this.rightFin3.cubeList.add(new ModelBox(rightFin3, 20, 30, -1.75F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.leftFin4 = new AdvancedModelRenderer(this);
        this.leftFin4.setRotationPoint(3.5F, -0.2F, 5.0F);
        this.body1.addChild(leftFin4);
        this.leftFin4.cubeList.add(new ModelBox(leftFin4, 22, 21, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightFin4 = new AdvancedModelRenderer(this);
        this.rightFin4.setRotationPoint(-3.5F, -0.2F, 5.0F);
        this.body1.addChild(rightFin4);
        this.rightFin4.cubeList.add(new ModelBox(rightFin4, 22, 21, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftFin5 = new AdvancedModelRenderer(this);
        this.leftFin5.setRotationPoint(3.0F, -0.15F, 6.0F);
        this.body1.addChild(leftFin5);
        this.leftFin5.cubeList.add(new ModelBox(leftFin5, 27, 16, 0.25F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightFin5 = new AdvancedModelRenderer(this);
        this.rightFin5.setRotationPoint(-3.0F, -0.15F, 6.0F);
        this.body1.addChild(rightFin5);
        this.rightFin5.cubeList.add(new ModelBox(rightFin5, 27, 16, -1.25F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 15, 45, -2.5F, -2.0F, -0.5F, 5, 4, 3, 0.0F, false));

        this.leftFin6 = new AdvancedModelRenderer(this);
        this.leftFin6.setRotationPoint(2.5F, -0.1F, 1.0F);
        this.body2.addChild(leftFin6);
        this.leftFin6.cubeList.add(new ModelBox(leftFin6, 22, 21, -0.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightFin6 = new AdvancedModelRenderer(this);
        this.rightFin6.setRotationPoint(-2.5F, -0.1F, 1.0F);
        this.body2.addChild(rightFin6);
        this.rightFin6.cubeList.add(new ModelBox(rightFin6, 22, 21, -1.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftFin7 = new AdvancedModelRenderer(this);
        this.leftFin7.setRotationPoint(2.0F, -0.05F, 2.0F);
        this.body2.addChild(leftFin7);
        this.leftFin7.cubeList.add(new ModelBox(leftFin7, 27, 16, 0.25F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightFin7 = new AdvancedModelRenderer(this);
        this.rightFin7.setRotationPoint(-2.0F, -0.05F, 2.0F);
        this.body2.addChild(rightFin7);
        this.rightFin7.cubeList.add(new ModelBox(rightFin7, 27, 16, -1.25F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 45, 50, -1.5F, -1.0F, -0.5F, 3, 2, 2, 0.0F, false));

        this.leftFin8 = new AdvancedModelRenderer(this);
        this.leftFin8.setRotationPoint(1.5F, 0.0F, 1.0F);
        this.body3.addChild(leftFin8);
        this.leftFin8.cubeList.add(new ModelBox(leftFin8, 27, 16, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.rightFin8 = new AdvancedModelRenderer(this);
        this.rightFin8.setRotationPoint(-1.5F, 0.0F, 1.0F);
        this.body3.addChild(rightFin8);
        this.rightFin8.cubeList.add(new ModelBox(rightFin8, 27, 16, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.leftFin9 = new AdvancedModelRenderer(this);
        this.leftFin9.setRotationPoint(0.5F, 0.05F, 1.5F);
        this.body3.addChild(leftFin9);
        this.setRotateAngle(leftFin9, 0.0F, 0.5672F, 0.0F);
        this.leftFin9.cubeList.add(new ModelBox(leftFin9, 28, 0, 0.0F, 0.0F, -0.5F, 1, 0, 2, 0.0F, false));

        this.rightFin9 = new AdvancedModelRenderer(this);
        this.rightFin9.setRotationPoint(-0.5F, 0.05F, 1.5F);
        this.body3.addChild(rightFin9);
        this.setRotateAngle(rightFin9, 0.0F, -0.5672F, 0.0F);
        this.rightFin9.cubeList.add(new ModelBox(rightFin9, 28, 0, -1.0F, 0.0F, -0.5F, 1, 0, 2, 0.0F, true));

        this.leftFin10 = new AdvancedModelRenderer(this);
        this.leftFin10.setRotationPoint(0.0F, 0.1F, 1.5F);
        this.body3.addChild(leftFin10);
        this.setRotateAngle(leftFin10, 0.0F, 0.1309F, 0.0F);
        this.leftFin10.cubeList.add(new ModelBox(leftFin10, 28, 0, 0.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.rightFin10 = new AdvancedModelRenderer(this);
        this.rightFin10.setRotationPoint(0.0F, 0.1F, 1.5F);
        this.body3.addChild(rightFin10);
        this.setRotateAngle(rightFin10, 0.0F, -0.1309F, 0.0F);
        this.rightFin10.cubeList.add(new ModelBox(rightFin10, 28, 0, -1.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Titanokorys.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(Titanokorys, -1.6F, 3.15F, 0.0F);
        this.Titanokorys.offsetY = -0.19F;
        this.Titanokorys.offsetX = -0.0F;
        this.Titanokorys.offsetZ = -0.58F;
        this.Titanokorys.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Titanokorys, 0.2F, 0.0F, -0.3F);
        this.setRotateAngle(body1, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(appendageLeft, -1.2F, 0.2F, 0.3F);
        this.setRotateAngle(appendageRight, -0.7F, 0.1F, -0.2F);
        this.Titanokorys.offsetZ = -0.03F;
        this.Titanokorys.offsetY = -0.2F;
        this.Titanokorys.offsetX = -0.005F;
        this.Titanokorys.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Titanokorys.offsetY = -0.9F;
        this.Titanokorys.offsetX = 0.0F;
        this.Titanokorys.rotateAngleY = (float)Math.toRadians(200);
        this.Titanokorys.rotateAngleX = (float)Math.toRadians(8);
        this.Titanokorys.rotateAngleZ = (float)Math.toRadians(-8);
        this.Titanokorys.scaleChildren = true;
        float scaler = 2.5F;
        this.Titanokorys.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Titanokorys, 0.15F, -3.6F, -0.1F);
        this.setRotateAngle(body1, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(appendageLeft, -1.2F, 0.2F, 0.3F);
        this.setRotateAngle(appendageRight, -1.7F, 0.1F, -0.2F);
        //End of pose, now render the model:
        this.Titanokorys.render(f);
        //Reset rotations, positions and sizing:
        this.Titanokorys.setScale(1.0F, 1.0F, 1.0F);
        this.Titanokorys.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Titanokorys.offsetY = 0.5F;

        AdvancedModelRenderer[] Tail = {this.body1, this.body2, this.body3};
        AdvancedModelRenderer[] FeelerL = {this.leftFeeler1, this.leftFeeler2, this.leftFeeler3, this.leftFeeler4, this.rightFeeler5};
        AdvancedModelRenderer[] FeelerR = {this.rightFeeler1, this.rightFeeler2, this.rightFeeler3, this.rightFeeler4, this.rightFeeler5};
        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            this.swing(appendageLeft, 0.8F, -0.4F, false, 3, -0.1F, f2, 0.8F);
            this.swing(appendageRight, 0.8F, 0.4F, false, 3, 0.1F, f2, 0.8F);
            this.walk(appendageLeft, 0.8F, 0.2F, false, 0, -0.2F, f2, 0.8F);
            this.walk(appendageRight, 0.8F, 0.2F, false, 0, -0.2F, f2, 0.8F);

            if (f3 != 0) {
                this.chainWave(Tail, 0.65F, 0.045F, -1.5, f2, 0.8F);
            }
            else {
                this.chainWave(Tail, 0.25F, 0.015F, -1.5, f2, 0.8F);
            }

            this.chainWave(FeelerL, 0.2F, 0.015F, -1.5, f2, 0.8F);
            this.chainWave(FeelerR, 0.2F, 0.015F, -1.5, f2, 0.8F);

            float degreeFin = 0.45F;
            this.flap(leftFin1, 0.5F, -degreeFin, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(rightFin1, 0.5F, degreeFin, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(leftFin2, 0.5F, -degreeFin, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(rightFin2, 0.5F, degreeFin, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(leftFin3, 0.5F, -degreeFin, false, 5.5F, -0.5F, f2, 0.7F);
            this.flap(rightFin3, 0.5F, degreeFin, false, 5.5F, 0.5F, f2, 0.7F);
            this.flap(leftFin4, 0.5F, -degreeFin, false, 6.0F, -0.5F, f2, 0.7F);
            this.flap(rightFin4, 0.5F, degreeFin, false, 6.0F, 0.5F, f2, 0.7F);
            this.flap(leftFin5, 0.5F, -degreeFin, false, 6.5F, -0.5F, f2, 0.7F);
            this.flap(rightFin5, 0.5F, degreeFin, false, 6.5F, 0.5F, f2, 0.7F);
            this.flap(leftFin6, 0.5F, -degreeFin, false, 7.0F, -0.5F, f2, 0.7F);
            this.flap(rightFin6, 0.5F, degreeFin, false, 7.0F, 0.5F, f2, 0.7F);
            this.flap(leftFin7, 0.5F, -degreeFin, false, 7.0F, -0.5F, f2, 0.7F);
            this.flap(rightFin7, 0.5F, degreeFin, false, 7.0F, 0.5F, f2, 0.7F);
            this.flap(leftFin8, 0.5F, -degreeFin, false, 7.0F, -0.5F, f2, 0.7F);
            this.flap(rightFin8, 0.5F, degreeFin, false, 7.0F, 0.5F, f2, 0.7F);
            this.walk(leftFin9, 0.5F, -degreeFin, true, 7.0F, -0.5F, f2, 0.7F);
            this.walk(rightFin9, 0.5F, degreeFin, false, 7.0F, 0.5F, f2, 0.7F);

            this.walk(leftFin10, 1.0F, 0.2F, false, 0F, 0F, f2, 1F);
            this.walk(rightFin10, 1.0F, 0.2F, false, 0F, 0F, f2, 1F);





            if (!e.isInWater()) {
                this.bob(Titanokorys, -speed * 1.0F, 3F, false, f2, 1);
            } else {
                if (!isAtBottom) {
                    this.bob(Titanokorys, -speed, 0.12F, false, f2, 2);
                }
            }
        }
    }
}