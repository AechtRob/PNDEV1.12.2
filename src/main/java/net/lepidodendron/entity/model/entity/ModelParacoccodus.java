package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelParacoccodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail4;

    public ModelParacoccodus() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0077F, 19.272F, -4.3109F);
        this.setRotateAngle(main, -0.0873F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0077F, -2.0657F, 0.1065F, 4, 5, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0077F, 3.9066F, 1.488F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0785F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 31, -0.5F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0077F, 2.9895F, -0.5795F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1833F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 6, -0.5F, -1.475F, -0.8F, 3, 2, 3, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0077F, 2.2033F, -1.3744F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.9381F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 10, -0.5F, -1.0F, 0.0F, 3, 2, 4, 0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5077F, 2.191F, -3.6105F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4581F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 41, 0.0F, 0.2F, -0.85F, 1, 1, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 12, -0.5F, 0.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.4923F, -0.5797F, -0.9173F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.589F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 34, -2.1F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 34, 0.1F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5077F, -1.1349F, -1.3882F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.9817F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 27, -0.5F, 0.0F, -4.0F, 2, 1, 4, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0077F, -2.4204F, 0.1439F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6981F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 37, -0.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.0077F, -3.619F, -1.6568F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.8247F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 42, -0.5F, 0.0F, 0.0F, 1, 3, 1, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.0077F, -2.843F, 1.0502F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.0036F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 42, -0.5F, -3.7F, -0.8F, 1, 4, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0077F, -3.2657F, 1.9565F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 17, -0.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0077F, -3.2657F, 1.9565F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4363F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 37, -0.5F, 0.0F, -2.0F, 3, 2, 2, 0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.2423F, 3.0343F, 4.3065F);
        this.main.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.1372F, 0.3027F, 0.0411F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 22, 33, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.2577F, 3.0343F, 4.3065F);
        this.main.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.1372F, -0.3027F, -0.0411F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 22, 33, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.9923F, -0.4657F, 2.2065F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.1922F, 0.4293F, 0.0808F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 37, 42, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.0077F, -0.4657F, 2.2065F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.1922F, -0.4293F, -0.0808F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 37, 42, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(1.9923F, 3.789F, 2.9833F);
        this.main.addChild(leftSpike);
        this.setRotateAngle(leftSpike, 0.1745F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.6952F, 0.5805F, 1.3769F);
        this.leftSpike.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.074F, 0.1267F, -0.1461F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 40, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.15F, -0.7F, 0.0F);
        this.leftSpike.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5214F, 0.3843F, -0.2121F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 29, -1.0F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(-2.0077F, 3.789F, 2.9833F);
        this.main.addChild(rightSpike);
        this.setRotateAngle(rightSpike, 0.1745F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.6952F, 0.5805F, 1.3769F);
        this.rightSpike.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.074F, -0.1267F, 0.1461F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 40, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.15F, -0.7F, 0.0F);
        this.rightSpike.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5214F, -0.3843F, 0.2121F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 29, 0.0F, -0.5F, -1.0F, 1, 1, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.0077F, 2.2229F, -1.4017F);
        this.main.addChild(jaw);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.0196F, 0.0273F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4581F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 0, -0.5F, 0.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0077F, 0.3177F, 3.8867F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 10, -1.5F, -1.9833F, -0.4302F, 3, 4, 4, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -3.4961F, 0.0679F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2618F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 19, -0.5F, 0.0F, 0.0F, 2, 2, 4, 0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 3.3771F, 0.293F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1876F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 26, -0.5F, -2.05F, -0.125F, 2, 2, 4, 0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.059F, 3.7193F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 0, -1.0F, -1.5423F, -0.6495F, 2, 3, 4, 0.006F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 2.6395F, -0.1199F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3185F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 42, 0.5F, 0.0F, 1.0F, 0, 1, 3, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 17, -0.5F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -2.3778F, 0.6918F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.288F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 39, 22, 0.5F, -1.975F, -0.925F, 0, 2, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -2.4948F, 0.2123F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.288F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 26, 24, -0.5F, 0.0F, -0.425F, 2, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0824F, 3.3466F);
        this.tail2.addChild(tail3);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.4349F, 0.0539F);
        this.tail3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1265F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 11, 33, -0.5F, 0.0F, -0.5F, 1, 2, 4, 0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.3195F, 0.0691F);
        this.tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1876F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 41, 12, -0.5F, 0.0F, -0.625F, 1, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.4F, 3.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 15, 17, 0.0F, -2.4349F, 0.0539F, 0, 4, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.4F;
        this.main.offsetX = 1.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.125F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
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
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                //this.body.offsetY = -0.10F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
