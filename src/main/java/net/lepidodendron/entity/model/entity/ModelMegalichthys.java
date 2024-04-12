package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMegalichthys extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;

    public ModelMegalichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.4479F, -1.5953F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -2.5F, -3.0F, 4, 5, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 4.4521F, 1.1953F);
        this.main.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -1.9521F, -4.0953F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 26, -0.5F, -2.0119F, -2.9741F, 3, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -5.1521F, -10.9203F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.3265F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 14, -1.425F, 2.2326F, -1.204F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.925F, -4.2918F, -10.3798F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.3265F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -5.1521F, -10.9203F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.3265F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 3, 14, 1.425F, 2.2326F, -1.204F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, -0.25F, 0.1576F, -1.204F, 1, 0, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 12, -0.5F, -0.0174F, -1.004F, 2, 5, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 41, -0.5F, 1.4826F, -0.004F, 2, 3, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.925F, -4.2918F, -10.3798F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.3265F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -5.9521F, -9.0953F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4102F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 12, -0.5F, -0.0114F, -1.9966F, 2, 1, 2, -0.002F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -6.4271F, -7.1453F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2356F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 10, -0.5F, -0.0048F, -2.0037F, 2, 2, 2, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -6.9521F, -4.1953F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 29, -0.5F, 0.0F, -3.0F, 3, 3, 3, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -3.1871F, -6.8101F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.48F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 0.06F, -0.2602F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 14, -1.4F, -0.4869F, -1.9668F, 0, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 0, -1.4F, -0.4869F, -3.9668F, 0, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 14, 0.4F, -0.4869F, -1.9668F, 0, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 0, 0.4F, -0.4869F, -3.9668F, 0, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 21, -1.5F, -0.2869F, -4.2168F, 2, 1, 5, -0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 12, -1.0F, -0.4619F, -3.9668F, 1, 1, 0, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.75F, -5.0683F, -8.8789F);
        this.head.addChild(eye);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, 0.0162F, -0.6414F);
        this.eye.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.5F, -0.3F, -0.1F, 1, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 1.0F, -0.3F, -0.1F, 1, 1, 1, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.05F, -3.0F, -4.25F);
        this.head.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -1.1338F, 0.504F, -0.8021F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 40, 37, -0.2111F, -0.9955F, -0.3414F, 1, 2, 2, 0.0F, false));
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 26, 0.5389F, -1.4955F, 0.6586F, 0, 3, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.05F, -3.0F, -4.25F);
        this.head.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -1.1338F, -0.504F, 0.8021F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 40, 37, -0.7889F, -0.9955F, -0.3414F, 1, 2, 2, 0.0F, true));
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 26, -0.5389F, -1.4955F, 0.6586F, 0, 3, 5, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0117F, 2.6627F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 13, 12, -1.5F, -2.0117F, -0.1627F, 3, 4, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -2.5117F, -0.1627F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1265F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 19, -0.5F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 2.4883F, -0.1627F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0349F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 0, -0.5F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.9872F, 3.6043F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 23, 21, -1.0F, -0.5245F, -0.267F, 2, 3, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.4755F, -0.267F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 36, -0.5F, -1.125F, 0.1F, 1, 1, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -1.4335F, -0.1913F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 28, 0.5F, 0.4128F, -0.2038F, 0, 3, 5, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 28, 0.0F, 0.4128F, -0.2038F, 1, 1, 2, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.5245F, 1.733F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 0, -0.5F, -0.325F, -2.0F, 1, 1, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.6F, 2.6803F, 0.3068F);
        this.body2.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.9888F, 0.1975F, -0.2898F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 21, 0, -0.0981F, -2.3617F, 0.3242F, 0, 3, 6, 0.0F, false));
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 18, 21, -0.5981F, -0.8617F, -0.4258F, 1, 1, 2, -0.001F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.6F, 2.6803F, 0.3068F);
        this.body2.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.9888F, -0.1975F, 0.2898F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 21, 0, 0.0981F, -2.3617F, 0.3242F, 0, 3, 6, 0.0F, true));
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 18, 21, -0.4019F, -0.8617F, -0.4258F, 1, 1, 2, -0.001F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0036F, 1.0274F, 3.748F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 31, 32, -0.5036F, -1.0519F, -0.515F, 1, 2, 4, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5036F, 1.3052F, 1.0375F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.5236F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 38, 0.5F, -1.1F, -0.5F, 0, 2, 4, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 3, 0.0F, -0.075F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.0036F, 1.4481F, 1.485F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 35, -0.5F, -0.7F, -1.925F, 1, 1, 4, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5036F, -2.0709F, -0.3934F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5716F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 10, 0.525F, 0.7988F, 0.992F, 0, 3, 5, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 37, 0, 0.0F, 0.7988F, -0.008F, 1, 1, 2, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.0036F, -1.0519F, 1.485F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1265F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 34, 6, -0.5F, -0.4F, -2.0F, 1, 1, 4, -0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.0036F, -0.0099F, 3.3968F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 38, 32, -0.5F, -0.4863F, -0.0116F, 1, 1, 2, 0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.4297F, -0.1513F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2182F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 39, -0.5F, -0.8566F, 0.1397F, 1, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 1.4579F, 0.4898F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3927F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 12, 0.5F, -7.0896F, -0.1522F, 0, 7, 6, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.4579F, 0.4898F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3491F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 7, 37, -0.5F, -1.1896F, -0.1522F, 1, 1, 4, -0.002F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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
        //this.head.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.tail, this.tail2};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(main, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0.1f, f2, 1);

            this.flap(backRightFin, speed * 0.8F, -0.3F, true, 0F, -0.5F, f2, 1F);
            this.flap(backLeftFin, speed * 0.8F, 0.3F, true, 0F, 0.5F, f2, 1F);
            this.flap(frontRightFin, speed * 0.8F, -0.25F, false, 0F, -0.1F, f2, 1F);
            this.flap(frontLeftFin, speed * 0.8F, 0.25F, false, 0F, 0.1F, f2, 1F);
            this.walk(frontRightFin, speed * 0.8F, -0.4F, true, 0F, -0.2F, f2, 1F);
            this.walk(frontLeftFin, speed * 0.8F, 0.4F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                //this.head.offsetY = 1.20F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
