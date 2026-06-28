package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAquaticSticker;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAfrocascudo extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer dorsalFin;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r21;

    public ModelAfrocascudo() {
        this.textureWidth = 34;
        this.textureHeight = 35;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.2083F, -1.8792F);
        this.main.cubeList.add(new ModelBox(main, 0, 7, -1.5F, -0.2583F, -2.1208F, 3, 2, 4, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.2833F, 1.8792F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.048F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -1.0F, 0.0F, -4.0F, 2, 1, 4, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0912F, -2.1308F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 1, 1, -1.0F, 1.8078F, -3.99F, 2, 1, 4, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.8151F, -3.7796F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, -1, 33, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.25F, 2.6828F, -3.265F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.48F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 12, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.25F, 2.6828F, -3.265F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.48F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 12, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.9F, 1.0146F, -2.4769F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6661F, -0.1726F, -0.1341F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 29, 0.0F, 0.0F, -1.6F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.8F, 1.0919F, -1.9458F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4815F, -0.0774F, -0.0404F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 30, -0.45F, -0.425F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 2.3078F, -3.99F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 0, 0.0F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.6178F, -2.7703F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6545F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 15, -1.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.9F, 1.0146F, -2.4769F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6661F, 0.1726F, 0.1341F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 29, -1.0F, 0.0F, -1.6F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.8F, 1.0919F, -1.9458F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4815F, 0.0774F, 0.0404F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 30, -0.55F, -0.425F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 2.3078F, -3.99F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1745F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 14, -1.0F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.6124F, -2.2813F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 24, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.01F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 26, -1.0F, 0.0F, 1.4F, 2, 2, 1, 0.0F, false));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, 2.8078F, -3.19F);
        this.head.addChild(mouth);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.mouth.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 30, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0776F, 1.6128F);
        this.main.addChild(tail1);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.1249F, 1.0517F);
        this.tail1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 30, 0.0F, -2.1F, 0.0F, 0, 3, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.6391F, 0.2664F);
        this.tail1.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1222F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 6, -1.0F, -1.975F, -0.3F, 2, 3, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2771F, 1.9643F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 6, -0.2F, -0.6381F, -0.098F, 1, 2, 2, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 6, -0.8F, -0.6381F, -0.098F, 1, 2, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.7381F, 2.002F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 0, -0.2F, 0.0F, -2.0F, 1, 1, 2, -0.01F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 0, -0.8F, 0.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2619F, 1.402F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 20, -0.5F, -1.0F, -0.1F, 1, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.9F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 16, 24, 0.0F, -1.5F, 0.0F, 0, 3, 2, 0.0F, false));

        this.dorsalFin = new AdvancedModelRenderer(this);
        this.dorsalFin.setRotationPoint(0.0F, -1.2449F, 0.5403F);
        this.main.addChild(dorsalFin);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.7243F, 2.1243F);
        this.dorsalFin.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 21, 26, 0.0F, -0.9F, -1.0F, 0, 3, 2, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5032F, 1.6352F, 0.6841F);
        this.main.addChild(backLeftFin);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5541F, -0.3239F, -0.1615F);
        this.backLeftFin.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3491F, 0.5672F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 20, 0.0F, 0.0F, 0.1F, 2, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5032F, 1.6352F, 0.6841F);
        this.main.addChild(backRightFin);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5541F, -0.3239F, -0.1615F);
        this.backRightFin.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.3491F, -0.5672F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 20, -2.0F, 0.0F, 0.1F, 2, 0, 3, 0.0F, true));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.4942F, 1.333F, -1.6597F);
        this.main.addChild(frontRightFin);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.2077F, -0.1068F, 0.2824F);
        this.frontRightFin.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0945F, -0.5215F, -0.4801F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 20, -2.6F, 0.0F, -0.7F, 3, 0, 3, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.4942F, 1.333F, -1.6597F);
        this.main.addChild(frontLeftFin);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.2077F, -0.1068F, 0.2824F);
        this.frontLeftFin.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0945F, 0.5215F, 0.4801F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 11, 20, -0.4F, 0.0F, -0.7F, 3, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -4.4F;
        this.main.offsetX = 2.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(310);
        this.main.rotateAngleX = (float)Math.toRadians(-80);
        this.main.rotateAngleZ = (float)Math.toRadians(28);
        this.main.scaleChildren = true;
        float scaler = 6.4F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

//    public void renderStaticWall(float f) {
//        this.main.rotateAngleY = (float) Math.toRadians(180);
//        this.main.rotateAngleX = (float) Math.toRadians(-90);
//        this.main.offsetZ = -0.19F;
//        this.main.offsetY = -0.3F;
//        this.main.offsetX = -0.0F;
//        this.main.render(0.01F);
//        resetToDefaultPose();
//    }
//    public void renderStaticFloor(float f) {
//        this.setRotateAngle(main, -0.4F, 0.0F, 0.0F);
//        this.setRotateAngle(main2, 0.1F, 0.0F, 0.0F);
//        this.setRotateAngle(main3, 0.2F, 0.1F, 0.0F);
//        this.setRotateAngle(main4, 0.3F, 0.4F, 0.0F);
//        this.setRotateAngle(main5, 0.4F, 0.6F, 0.0F);
//        this.main.offsetY = -0.11F;
//        this.main.render(0.01F);
//        resetToDefaultPose();
//    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3, this.tail4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        EntityPrehistoricFloraAquaticSticker EntitySticker = (EntityPrehistoricFloraAquaticSticker) e;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (EntitySticker.getAttachmentPos() != null) {
                this.chainSwing(fishTail, speed*0.3F, 0.07F, 0, f2, 1);
                this.swing(main, speed*0.3F, 0.1F, true, 0, 0, f2, 1);
            } else {
                this.chainSwing(fishTail, speed * 0.8F, 0.27F, 0, f2, 1);
                this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
            }


             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
