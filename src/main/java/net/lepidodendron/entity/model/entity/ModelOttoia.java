package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraOttoia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOttoia extends AdvancedModelBase {
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer body18;
    private final AdvancedModelRenderer body17;
    private final AdvancedModelRenderer body16;
    private final AdvancedModelRenderer body15;
    private final AdvancedModelRenderer body14;
    private final AdvancedModelRenderer body13;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer mouth2;

    public ModelOttoia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 59.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 8, 27, -1.0F, 2.0F, -1.0F, 2, 1, 2, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 20, 4, -1.5F, 0.0F, -1.5F, 3, 2, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 25, 17, -1.5F, 2.5F, -1.5F, 3, 0, 3, 0.0F, false));

        this.body18 = new AdvancedModelRenderer(this);
        this.body18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(body18);
        this.body18.cubeList.add(new ModelBox(body18, 12, 13, -1.99F, -2.0F, -2.01F, 4, 2, 4, 0.0F, false));

        this.body17 = new AdvancedModelRenderer(this);
        this.body17.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body18.addChild(body17);
        this.body17.cubeList.add(new ModelBox(body17, 12, 13, -2.0F, -2.0F, -2.0F, 4, 2, 4, 0.0F, false));

        this.body16 = new AdvancedModelRenderer(this);
        this.body16.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body17.addChild(body16);
        this.body16.cubeList.add(new ModelBox(body16, 0, 31, -2.49F, -2.0F, -2.51F, 5, 2, 5, 0.0F, false));

        this.body15 = new AdvancedModelRenderer(this);
        this.body15.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body16.addChild(body15);
        this.body15.cubeList.add(new ModelBox(body15, 0, 31, -2.5F, -2.0F, -2.5F, 5, 2, 5, 0.0F, false));

        this.body14 = new AdvancedModelRenderer(this);
        this.body14.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body15.addChild(body14);
        this.body14.cubeList.add(new ModelBox(body14, 0, 31, -2.49F, -2.0F, -2.51F, 5, 2, 5, 0.0F, false));

        this.body13 = new AdvancedModelRenderer(this);
        this.body13.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body14.addChild(body13);
        this.body13.cubeList.add(new ModelBox(body13, 0, 31, -2.5F, -2.0F, -2.5F, 5, 2, 5, 0.0F, false));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body13.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 0, 31, -2.49F, -2.0F, -2.51F, 5, 2, 5, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body12.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 0, 31, -2.5F, -2.0F, -2.5F, 5, 2, 5, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body11.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 0, 31, -2.49F, -2.0F, -2.51F, 5, 2, 5, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body10.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 0, 31, -2.5F, -2.0F, -2.5F, 5, 2, 5, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body9.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 31, -2.49F, -2.0F, -2.51F, 5, 2, 5, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body8.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 31, -2.5F, -2.0F, -2.5F, 5, 2, 5, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body7.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 31, -2.49F, -2.0F, -2.51F, 5, 2, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body6.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 31, -2.5F, -2.0F, -2.5F, 5, 2, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body5.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 31, -2.49F, -2.0F, -2.51F, 5, 2, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body4.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 31, -2.5F, -2.0F, -2.5F, 5, 2, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body3.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 12, 13, -1.99F, -2.0F, -2.01F, 4, 2, 4, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body2.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 12, 13, -2.0F, -2.0F, -2.0F, 4, 2, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body1.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -2.5F, -4.0F, -2.5F, 5, 4, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 24, 9, -3.0F, -4.0F, 0.5F, 6, 4, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 12, 23, -3.0F, -4.0F, 1.5F, 6, 4, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 24, 13, -3.0F, -4.0F, -0.5F, 6, 4, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 24, 23, -3.0F, -4.0F, -1.5F, 6, 4, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 12, 3, 1.5F, -4.0F, -3.0F, 0, 4, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 11, 0.5F, -4.0F, -3.0F, 0, 4, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 7, -0.5F, -4.0F, -3.0F, 0, 4, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 3, -1.5F, -4.0F, -3.0F, 0, 4, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, -4.01F, -0.5F, 1, 4, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 19, -4.0F, -28.0F, 0.0F, 8, 4, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 0, -4.0F, -22.0F, 0.0F, 8, 4, 0, 0.0F, false));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head.addChild(mouth);
        this.mouth.cubeList.add(new ModelBox(mouth, 20, 31, -1.0F, -4.0F, -1.0F, 2, 5, 2, 0.0F, false));
        this.mouth.cubeList.add(new ModelBox(mouth, 4, 39, -0.499F, -4.0F, -0.501F, 1, 5, 1, 0.0F, false));

        this.mouth2 = new AdvancedModelRenderer(this);
        this.mouth2.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.mouth.addChild(mouth2);
        this.mouth2.cubeList.add(new ModelBox(mouth2, 0, 21, -1.5F, -2.0F, -1.5F, 3, 2, 3, 0.0F, false));
        this.mouth2.cubeList.add(new ModelBox(mouth2, 0, 39, -0.501F, -2.0F, -0.499F, 1, 2, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.tail.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.tail.offsetZ = -0.04F;
        this.tail.offsetY = -0.43F;
        this.tail.render(0.011F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        float offsetV = 0.76F - 3.05F;
        this.tail.offsetY = offsetV;
        float rotX = (float) Math.toRadians(90);
        this.tail.rotateAngleX = rotX;
        this.tail.offsetZ = 0.2F;

        EntityPrehistoricFloraOttoia ee = (EntityPrehistoricFloraOttoia) e;

        this.bob(mouth, 0.25F, 0.6F, false, f2, 1);

        float speedmodifier = 1;
        float swaymodifier = 1;
        float buried = 1;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fullBody = {this.body18, this.body17, this.body16, this.body15, this.body14, this.body13, this.body12, this.body11, this.body10, this.body9, this.body8, this.body7, this.body6, this.body5, this.body4, this.body3, this.body2, this.body1, this.head};
        AdvancedModelRenderer[] headBody = {this.body4, this.body3, this.body2, this.body1, this.head};

        float speed = 0.4F;
        float taildegree = 0.3F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        speed = 0.15F * speedmodifier;
        taildegree = 0.12F;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.tail.offsetY = offsetV + 0.92F + 3.05F;
                this.tail.rotateAngleX = rotX - (float) Math.toRadians(98);
                this.tail.offsetZ = 0;
                swaymodifier = 0;
                buried = 0;
                //Do some fully-buried wiggle animatins:
                this.chainWave(headBody, speed, -0.35F, 1.5, f2, 0.9F);
                this.chainSwing(headBody, speed, -0.35F, -1.5, f2, 0.9F);
            }
            else {
                this.tail.offsetY = offsetV + (0.92F * (float)((double)ee.getBuriedTick()/60D));
                this.tail.rotateAngleX = rotX - (float) Math.toRadians(98 * ((double)ee.getBuriedTick()/60D));
                this.tail.offsetZ = 0.2F - (float) (0.2 * ((double)ee.getBuriedTick()/60D));
                buried = 0;
            }
        }
        else {
            this.tail.offsetY = offsetV;
            this.tail.rotateAngleX = rotX - (float) Math.toRadians(8);

            this.chainSwing(fullBody, speed, taildegree * buried * 0.7F, -3, f2, 1 * 0.7F);
            this.chainWave(headBody, speed, -0.05F * buried * 0.5F, 2, f2, 1 * 0.5F);
            this.chainSwing(headBody, speed, -taildegree * buried * 0.7F, -2, f2, 1 * 0.7F);

            this.body16.walk(speed, -buried * 0.012F, false, 3.5F, -buried * 0.012F, f2, 1F);
            this.body14.walk(speed, -buried * 0.012F, false, 3.5F, -buried * 0.012F, f2, 1F);
            this.body12.walk(speed, -buried * 0.012F, false, 3.5F, -buried * 0.012F, f2, 1F);
            this.body10.walk(speed, -buried * 0.012F, false, 4.0F, -buried * 0.012F, f2, 1F);
            this.body8.walk(speed, -buried * 0.012F, false, 4.0F, -buried * 0.012F, f2, 1F);
            this.body6.walk(speed, -buried * 0.012F, false, 4.0F, -buried * 0.012F, f2, 1F);
            this.body4.walk(speed, -buried * 0.012F, false, 4.5F, -buried * 0.012F, f2, 1F);
            this.body2.walk(speed, -buried * 0.012F, false, 4.5F, -buried * 0.012F, f2, 1F);
        }

        float bobber = 0.3F;

        if (!e.isInWater()) {
            //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            this.tail.offsetY =- 0.05F - 0.76F - 2.0F;
            bobber = 1.2F;
            this.chainWave(fullBody, speed, 0.2F * 0.5F, -2, f2, 1 * 0.5F);
        }
        else {
            this.chainWave(fullBody, speed, 0.05F * buried, -3, f2, 1);
        }
        this.bob(tail, -speed, bobber, false, f2, 1);

    }
}
