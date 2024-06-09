package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelIowagnathus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer gill;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    public ModelIowagnathus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 27, 19, -1.5F, -4.0F, -7.0F, 3, 3, 4, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-1.0F, -3.0F, -6.0F);
        this.head.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, -0.2182F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 26, 9, -1.75F, -1.25F, -1.25F, 2, 2, 2, 0.0F, false));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(1.0F, -3.0F, -6.0F);
        this.head.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, 0.2182F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 24, 0, -0.25F, -1.25F, -1.25F, 2, 2, 2, 0.0F, false));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, -1.65F, -5.35F);
        this.head.addChild(mouth);
        this.setRotateAngle(mouth, -0.2182F, 0.0F, 0.0F);
        this.mouth.cubeList.add(new ModelBox(mouth, 0, 38, -1.49F, 0.0F, -1.75F, 3, 1, 4, 0.0F, false));
        this.mouth.cubeList.add(new ModelBox(mouth, 12, 0, -1.0F, 0.75F, -1.5F, 2, 1, 3, 0.0F, false));
        this.mouth.cubeList.add(new ModelBox(mouth, 19, 1, -0.5F, 0.75F, -1.5F, 1, 1, 3, 0.0F, false));

        this.gill = new AdvancedModelRenderer(this);
        this.gill.setRotationPoint(0.0F, -2.5F, -3.0F);
        this.head.addChild(gill);
        this.gill.cubeList.add(new ModelBox(gill, 40, 6, -1.5F, -1.51F, 0.0F, 3, 3, 9, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.gill.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.5F, -1.51F, 0.0F, 3, 3, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, -1.5F, -1.51F, 0.0F, 3, 3, 6, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 0, -1.5F, -1.51F, 0.0F, 3, 3, 6, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 0, -1.5F, -1.51F, 0.0F, 3, 3, 6, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 0, 0, -1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 0, 0, -1.5F, -1.51F, 0.0F, 3, 3, 6, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body10.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 16, 21, -1.0F, -1.5F, 0.0F, 2, 3, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 0, -1.0F, -1.51F, 0.0F, 2, 3, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 24, 0.0F, -4.0F, 0.0F, 0, 7, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 6, 18, -1.0F, -1.5F, 0.0F, 2, 3, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 9, 0.0F, -4.0F, 0.0F, 0, 7, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 26, 26, -0.5F, -1.0F, 0.0F, 1, 2, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -2.5F, 0.0F, 0, 5, 10, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.head.render(f5 * 0.25F);
        this.head.render(f5);
    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.offsetX = -0.4F;
        this.head.offsetY = -0.2F;
        this.head.offsetZ = 0.2F;
        this.head.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, -0.2F, 0.0F, 0.5F);
        this.setRotateAngle(body, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(body6, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(body7, 0.3F, -0.3F, 0.0F);
        this.setRotateAngle(body8, 0.3F, -0.3F, 0.0F);
        this.setRotateAngle(body9, 0.3F, -0.3F, 0.0F);
        this.setRotateAngle(body10, 0.3F, -0.3F, 0.0F);
        this.setRotateAngle(tail1, 0.3F, -0.3F, 0.0F);
        this.setRotateAngle(tail2, 0.3F, -0.3F, 0.0F);
        this.setRotateAngle(tail4, 0.3F, -0.3F, 0.0F);
        this.head.offsetZ = -0.2F;
        this.head.offsetY = -0.25F;
        this.head.offsetX = -0.08F;
        this.head.render(0.01F);
        this.resetToDefaultPose();
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
        //this.head.offsetY = 1.17F;
        //this.gill.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.gill.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.tail1, this.tail2, this.tail3, this.tail4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.4F, -3, f2, 0.7F);
            this.swing(head, speed, 0.4F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.head.rotateAngleZ = (float) Math.toRadians(90);
                this.head.offsetY = 0F;
                this.bob(head, -speed, 5F, false, f2, 1);
            }
        }
    }
}
