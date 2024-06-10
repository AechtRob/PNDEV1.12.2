package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelBertratis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer tentacleBase;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacle15;
    private final AdvancedModelRenderer tentacle16;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacleBase4;
    private final AdvancedModelRenderer tentacle25;
    private final AdvancedModelRenderer tentacle26;
    private final AdvancedModelRenderer tentacle27;
    private final AdvancedModelRenderer tentacle28;
    private final AdvancedModelRenderer tentacle29;
    private final AdvancedModelRenderer tentacle30;
    private final AdvancedModelRenderer tentacle31;
    private final AdvancedModelRenderer tentacle32;
    private final AdvancedModelRenderer tentacleBase2;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacle10;
    private final AdvancedModelRenderer tentacle13;
    private final AdvancedModelRenderer tentacle14;
    private final AdvancedModelRenderer tentacle11;
    private final AdvancedModelRenderer tentacle12;
    private final AdvancedModelRenderer tentacleBase3;
    private final AdvancedModelRenderer tentacle17;
    private final AdvancedModelRenderer tentacle18;
    private final AdvancedModelRenderer tentacle19;
    private final AdvancedModelRenderer tentacle20;
    private final AdvancedModelRenderer tentacle21;
    private final AdvancedModelRenderer tentacle22;
    private final AdvancedModelRenderer tentacle23;
    private final AdvancedModelRenderer tentacle24;

    public ModelBertratis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 26.75F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 7, -2.0F, -4.0F, -2.0F, 4, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -3.5F, -2.5F, 5, 1, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -0.5F, -2.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tentacleBase = new AdvancedModelRenderer(this);
        this.tentacleBase.setRotationPoint(0.0F, -3.0F, 2.5F);
        this.main.addChild(tentacleBase);
        this.setRotateAngle(tentacleBase, -0.0873F, 0.0F, 0.0F);


        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(1.5F, 0.0F, -0.5F);
        this.tentacleBase.addChild(tentacle);
        this.setRotateAngle(tentacle, 0.0F, 0.3927F, 0.0F);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 7, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tentacle.addChild(tentacle2);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(-0.5F, -0.1F, -0.25F);
        this.tentacleBase.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, -0.1745F, 0.0F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 7, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tentacle3.addChild(tentacle4);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 0, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle15 = new AdvancedModelRenderer(this);
        this.tentacle15.setRotationPoint(0.5F, 0.075F, -0.25F);
        this.tentacleBase.addChild(tentacle15);
        this.setRotateAngle(tentacle15, 0.0F, 0.1745F, 0.0F);
        this.tentacle15.cubeList.add(new ModelBox(tentacle15, 7, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle16 = new AdvancedModelRenderer(this);
        this.tentacle16.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tentacle15.addChild(tentacle16);
        this.tentacle16.cubeList.add(new ModelBox(tentacle16, 0, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(-1.5F, 0.0F, -0.5F);
        this.tentacleBase.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.0F, -0.3927F, 0.0F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 7, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tentacle5.addChild(tentacle6);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 0, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacleBase4 = new AdvancedModelRenderer(this);
        this.tentacleBase4.setRotationPoint(0.0F, -3.0F, -2.5F);
        this.main.addChild(tentacleBase4);
        this.setRotateAngle(tentacleBase4, 0.0873F, 0.0F, 0.0F);


        this.tentacle25 = new AdvancedModelRenderer(this);
        this.tentacle25.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.tentacleBase4.addChild(tentacle25);
        this.setRotateAngle(tentacle25, 0.0F, -0.3927F, 0.0F);
        this.tentacle25.cubeList.add(new ModelBox(tentacle25, 7, 13, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.tentacle26 = new AdvancedModelRenderer(this);
        this.tentacle26.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.tentacle25.addChild(tentacle26);
        this.tentacle26.cubeList.add(new ModelBox(tentacle26, 0, 13, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.tentacle27 = new AdvancedModelRenderer(this);
        this.tentacle27.setRotationPoint(-0.5F, -0.1F, 0.25F);
        this.tentacleBase4.addChild(tentacle27);
        this.setRotateAngle(tentacle27, 0.0F, 0.1745F, 0.0F);
        this.tentacle27.cubeList.add(new ModelBox(tentacle27, 7, 13, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.tentacle28 = new AdvancedModelRenderer(this);
        this.tentacle28.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.tentacle27.addChild(tentacle28);
        this.tentacle28.cubeList.add(new ModelBox(tentacle28, 0, 13, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.tentacle29 = new AdvancedModelRenderer(this);
        this.tentacle29.setRotationPoint(0.5F, 0.075F, 0.25F);
        this.tentacleBase4.addChild(tentacle29);
        this.setRotateAngle(tentacle29, 0.0F, -0.1745F, 0.0F);
        this.tentacle29.cubeList.add(new ModelBox(tentacle29, 7, 13, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.tentacle30 = new AdvancedModelRenderer(this);
        this.tentacle30.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.tentacle29.addChild(tentacle30);
        this.tentacle30.cubeList.add(new ModelBox(tentacle30, 0, 13, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.tentacle31 = new AdvancedModelRenderer(this);
        this.tentacle31.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.tentacleBase4.addChild(tentacle31);
        this.setRotateAngle(tentacle31, 0.0F, 0.3927F, 0.0F);
        this.tentacle31.cubeList.add(new ModelBox(tentacle31, 7, 13, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.tentacle32 = new AdvancedModelRenderer(this);
        this.tentacle32.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.tentacle31.addChild(tentacle32);
        this.tentacle32.cubeList.add(new ModelBox(tentacle32, 0, 13, -0.5F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.tentacleBase2 = new AdvancedModelRenderer(this);
        this.tentacleBase2.setRotationPoint(2.5F, -3.0F, 0.0F);
        this.main.addChild(tentacleBase2);
        this.setRotateAngle(tentacleBase2, 0.0F, 1.5708F, 0.0873F);


        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(1.5F, 0.0F, -0.5F);
        this.tentacleBase2.addChild(tentacle7);
        this.setRotateAngle(tentacle7, 0.0F, 0.3927F, 0.0F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 7, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tentacle7.addChild(tentacle8);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 0, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(-0.5F, 0.075F, -0.25F);
        this.tentacleBase2.addChild(tentacle9);
        this.setRotateAngle(tentacle9, 0.0F, -0.1745F, 0.0F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 7, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tentacle9.addChild(tentacle10);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 0, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle13 = new AdvancedModelRenderer(this);
        this.tentacle13.setRotationPoint(0.5F, -0.05F, -0.25F);
        this.tentacleBase2.addChild(tentacle13);
        this.setRotateAngle(tentacle13, 0.0F, 0.1745F, 0.0F);
        this.tentacle13.cubeList.add(new ModelBox(tentacle13, 7, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle14 = new AdvancedModelRenderer(this);
        this.tentacle14.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tentacle13.addChild(tentacle14);
        this.tentacle14.cubeList.add(new ModelBox(tentacle14, 0, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle11 = new AdvancedModelRenderer(this);
        this.tentacle11.setRotationPoint(-1.5F, 0.0F, -0.5F);
        this.tentacleBase2.addChild(tentacle11);
        this.setRotateAngle(tentacle11, 0.0F, -0.3927F, 0.0F);
        this.tentacle11.cubeList.add(new ModelBox(tentacle11, 7, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacle12 = new AdvancedModelRenderer(this);
        this.tentacle12.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tentacle11.addChild(tentacle12);
        this.tentacle12.cubeList.add(new ModelBox(tentacle12, 0, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.tentacleBase3 = new AdvancedModelRenderer(this);
        this.tentacleBase3.setRotationPoint(-2.5F, -3.0F, 0.0F);
        this.main.addChild(tentacleBase3);
        this.setRotateAngle(tentacleBase3, 0.0F, -1.5708F, -0.0873F);


        this.tentacle17 = new AdvancedModelRenderer(this);
        this.tentacle17.setRotationPoint(-1.5F, 0.0F, -0.5F);
        this.tentacleBase3.addChild(tentacle17);
        this.setRotateAngle(tentacle17, 0.0F, -0.3927F, 0.0F);
        this.tentacle17.cubeList.add(new ModelBox(tentacle17, 7, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.tentacle18 = new AdvancedModelRenderer(this);
        this.tentacle18.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tentacle17.addChild(tentacle18);
        this.tentacle18.cubeList.add(new ModelBox(tentacle18, 0, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.tentacle19 = new AdvancedModelRenderer(this);
        this.tentacle19.setRotationPoint(0.5F, 0.075F, -0.25F);
        this.tentacleBase3.addChild(tentacle19);
        this.setRotateAngle(tentacle19, 0.0F, 0.1745F, 0.0F);
        this.tentacle19.cubeList.add(new ModelBox(tentacle19, 7, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.tentacle20 = new AdvancedModelRenderer(this);
        this.tentacle20.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tentacle19.addChild(tentacle20);
        this.tentacle20.cubeList.add(new ModelBox(tentacle20, 0, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.tentacle21 = new AdvancedModelRenderer(this);
        this.tentacle21.setRotationPoint(-0.5F, -0.05F, -0.25F);
        this.tentacleBase3.addChild(tentacle21);
        this.setRotateAngle(tentacle21, 0.0F, -0.1745F, 0.0F);
        this.tentacle21.cubeList.add(new ModelBox(tentacle21, 7, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.tentacle22 = new AdvancedModelRenderer(this);
        this.tentacle22.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tentacle21.addChild(tentacle22);
        this.tentacle22.cubeList.add(new ModelBox(tentacle22, 0, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.tentacle23 = new AdvancedModelRenderer(this);
        this.tentacle23.setRotationPoint(1.5F, 0.0F, -0.5F);
        this.tentacleBase3.addChild(tentacle23);
        this.setRotateAngle(tentacle23, 0.0F, 0.3927F, 0.0F);
        this.tentacle23.cubeList.add(new ModelBox(tentacle23, 7, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.tentacle24 = new AdvancedModelRenderer(this);
        this.tentacle24.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tentacle23.addChild(tentacle24);
        this.tentacle24.cubeList.add(new ModelBox(tentacle24, 0, 13, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.94F);

        this.main.render(f5);
        GlStateManager.disableBlend();

    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.main.setScaleX(1.0F);
        this.main.setScaleZ(1.0F);
        this.main.scaleChildren = false;
        this.main.offsetY = 0.33F;

        AdvancedModelRenderer[] tentacleF1 = {this.tentacle, this.tentacle2};
        AdvancedModelRenderer[] tentacleF2 = {this.tentacle3, this.tentacle4};
        AdvancedModelRenderer[] tentacleF3 = {this.tentacle15, this.tentacle16};
        AdvancedModelRenderer[] tentacleF4 = {this.tentacle5, this.tentacle6};
        AdvancedModelRenderer[] tentacleF5 = {this.tentacle25, this.tentacle26};
        AdvancedModelRenderer[] tentacleF6 = {this.tentacle27, this.tentacle28};
        AdvancedModelRenderer[] tentacleF7 = {this.tentacle29, this.tentacle30};
        AdvancedModelRenderer[] tentacleF8 = {this.tentacle31, this.tentacle32};
        AdvancedModelRenderer[] tentacleF9 = {this.tentacle7, this.tentacle8};
        AdvancedModelRenderer[] tentacleF10 = {this.tentacle9, this.tentacle10};
        AdvancedModelRenderer[] tentacleF11 = {this.tentacle11, this.tentacle12};
        AdvancedModelRenderer[] tentacleF12 = {this.tentacle13, this.tentacle14};
        AdvancedModelRenderer[] tentacleF13 = {this.tentacle17, this.tentacle18};
        AdvancedModelRenderer[] tentacleF14 = {this.tentacle19, this.tentacle20};
        AdvancedModelRenderer[] tentacleF15 = {this.tentacle21, this.tentacle22};
        AdvancedModelRenderer[] tentacleF16 = {this.tentacle23, this.tentacle24};

        float speed = 0.088F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        else {
            //pulsations:
            this.main.scaleChildren = false;
            float floatPulsate = this.moveBox(0.10F, 0.08F, false, f2, 1);
            //System.err.println("pulsate: " + floatPulsate);
            this.main.setScale(1-floatPulsate, 1, 1-floatPulsate);
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(main, speed * 0.22F, 0.20F, true, 0, 0, f2, 1);
            //this.walk(Body, speed * 0.3F, 0.025F, true, 0, 0, f2, 1);
            //this.flap(Body, speed * 0.2F, 0.025F, true, 0, 0, f2, 1);

            this.chainWave(tentacleF2, speed, 0.3F, -3, f2, 1);
            this.chainWave(tentacleF3, speed, -0.3F, -3, f2, 1);

            this.chainWave(tentacleF11, speed, 0.3F, -4, f2, 1);
            this.chainWave(tentacleF7, speed, -0.3F, -4, f2, 1);

            this.chainWave(tentacleF12, speed, 0.3F, -5, f2, 1);
            this.chainWave(tentacleF8, speed, -0.3F, -5, f2, 1);

            this.chainWave(tentacleF14, speed, 0.3F, -6, f2, 1);
            this.chainWave(tentacleF13, speed, -0.3F, -6, f2, 1);


            this.chainWave(tentacleF4, speed, 0.3F, -3, f2, 1);
            this.chainWave(tentacleF1, speed, -0.3F, -3, f2, 1);

            this.chainWave(tentacleF9, speed, 0.3F, -4, f2, 1);
            this.chainWave(tentacleF5, speed, -0.3F, -4, f2, 1);

            this.chainWave(tentacleF10, speed, 0.3F, -5, f2, 1);
            this.chainWave(tentacleF6, speed, -0.3F, -5, f2, 1);

            this.chainWave(tentacleF16, speed, 0.3F, -6, f2, 1);
            this.chainWave(tentacleF15, speed, -0.3F, -6, f2, 1);


            this.bob(main, -speed * 0.5F, 0.1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.2F;
                this.main.scaleChildren = true;
                this.main.setScaleX(0.2F);
                this.main.setScaleZ(1.2F);
            }
        }
    }
}
