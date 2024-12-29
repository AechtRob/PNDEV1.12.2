package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEurhinosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraMaiaspondylus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelMaiaspondylus extends ModelBasePalaeopedia {
    private ModelAnimator animator;
    private final AdvancedModelRenderer maiaspondylus;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer lower_jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pectoral_fin;
    private final AdvancedModelRenderer pectoral_fin2;
    private final AdvancedModelRenderer body_2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body_3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer pelvic_fin;
    private final AdvancedModelRenderer pelvic_fin2;
    private final AdvancedModelRenderer body_5;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body_6;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    public ModelMaiaspondylus() {

        this.textureWidth = 115;
        this.textureHeight = 110;

        this.maiaspondylus = new AdvancedModelRenderer(this);
        this.maiaspondylus.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -10.0F, -18.5F);
        this.maiaspondylus.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 58, 17, -1.5F, 1.0F, -17.0F, 2, 1, 12, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 84, 98, -2.0F, 1.0F, -10.0F, 3, 1, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 69, 0.25F, 1.5F, -16.75F, 0, 1, 12, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 69, -1.25F, 1.5F, -16.75F, 0, 1, 12, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 101, 92, -2.5F, 0.0F, -5.0F, 4, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 101, -2.5F, -1.0F, -2.0F, 4, 3, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 2.0F, -15.5F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0611F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 70, -1.0F, -1.0F, 0.0F, 2, 1, 10, -0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.7097F, 0.2309F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 101, -2.0F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0192F, -3.3944F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 51, -2.0F, 0.0F, -3.0F, 3, 1, 3, -0.002F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.65F, 0.65F, -2.25F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 17, -1.175F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 51, -1.15F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 17, 2.475F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 51, 2.45F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.lower_jaw = new AdvancedModelRenderer(this);
        this.lower_jaw.setRotationPoint(-0.5F, 2.0F, 0.0F);
        this.head.addChild(lower_jaw);
        this.setRotateAngle(lower_jaw, 0.0F, 0.0F, 0.0F);
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 72, 84, -1.0F, 0.0F, -17.0F, 2, 1, 12, 0.002F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 87, 24, -1.5F, 0.0F, -10.0F, 3, 1, 5, 0.0F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 58, 31, -2.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 70, 0, 0.7F, -0.5F, -16.75F, 0, 1, 12, 0.0F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 70, 0, -0.7F, -0.5F, -16.75F, 0, 1, 12, 0.0F, true));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 15, 101, -1.5F, -2.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.lower_jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2007F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 85, 47, -1.5F, -1.0399F, 0.196F, 3, 1, 5, -0.004F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.9968F, -2.1004F);
        this.lower_jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2007F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 101, 98, -2.0F, -3.0399F, -0.054F, 4, 3, 3, -0.002F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 95, 0, -2.5F, -2.5F, 0.0F, 5, 7, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 71, 70, -3.5F, -3.5F, 3.0F, 7, 9, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 82, -2.0F, -2.0F, 0.0F, 4, 2, 8, -0.002F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.9308F, 6.8691F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3229F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 87, 14, -2.0F, 0.0F, -7.0F, 4, 2, 7, 0.0F, false));

        this.pectoral_fin = new AdvancedModelRenderer(this);
        this.pectoral_fin.setRotationPoint(3.0F, 3.4957F, 3.569F);
        this.body.addChild(pectoral_fin);
        this.setRotateAngle(pectoral_fin, 0.0F, 0.0F, -0.7854F);
        this.pectoral_fin.cubeList.add(new ModelBox(pectoral_fin, 63, 96, -0.5F, 0.0F, -0.5F, 1, 4, 3, 0.0F, false));
        this.pectoral_fin.cubeList.add(new ModelBox(pectoral_fin, 31, 56, 0.0F, 2.0F, -1.0F, 0, 17, 7, 0.0F, false));

        this.pectoral_fin2 = new AdvancedModelRenderer(this);
        this.pectoral_fin2.setRotationPoint(-3.0F, 3.4957F, 3.569F);
        this.body.addChild(pectoral_fin2);
        this.setRotateAngle(pectoral_fin2, 0.0F, 0.0F, 0.7854F);
        this.pectoral_fin2.cubeList.add(new ModelBox(pectoral_fin2, 63, 96, -0.5F, 0.0F, -0.5F, 1, 4, 3, 0.0F, true));
        this.pectoral_fin2.cubeList.add(new ModelBox(pectoral_fin2, 31, 56, 0.0F, 2.0F, -1.0F, 0, 17, 7, 0.0F, true));

        this.body_2 = new AdvancedModelRenderer(this);
        this.body_2.setRotationPoint(-0.5F, 0.0F, 6.9F);
        this.body.addChild(body_2);
        this.body_2.cubeList.add(new ModelBox(body_2, 83, 54, -3.0F, 3.8809F, 0.3505F, 7, 4, 5, -0.004F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 25, 93, -3.0F, 5.994F, 4.882F, 7, 4, 3, 0.0F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 46, 96, -3.0F, 4.2625F, 14.6924F, 7, 4, 1, -0.004F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 0, 0, -3.5F, -3.5F, 5.95F, 8, 10, 10, 0.0F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 85, 31, 0.5F, -9.0807F, 7.8994F, 0, 7, 8, 0.0F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 23, 38, -4.0F, -3.925F, -0.025F, 9, 11, 6, 0.0F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 0, 93, -2.5F, -4.925F, -0.025F, 6, 1, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -3.5F, 15.85F);
        this.body_2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 54, 38, -2.5F, -0.1024F, -9.9883F, 5, 5, 10, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 9.994F, 7.882F);
        this.body_2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 56, -3.5F, -4.0F, 0.0F, 7, 4, 8, -0.002F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 4.5F, -6.9F);
        this.body_2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4363F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 83, -3.5F, -4.0F, 8.0F, 7, 4, 5, -0.002F, false));

        this.body_3 = new AdvancedModelRenderer(this);
        this.body_3.setRotationPoint(1.0F, 0.0F, 15.95F);
        this.body_2.addChild(body_3);
        this.body_3.cubeList.add(new ModelBox(body_3, 23, 21, -3.5F, -1.8167F, -1.5005F, 6, 5, 11, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -3.5F, -0.1F);
        this.body_3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 54, 54, -2.0F, -0.1024F, 0.0117F, 4, 5, 10, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 8.2625F, -0.2576F);
        this.body_3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.48F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 0, -2.5F, -5.0F, 0.0F, 5, 5, 11, -0.002F, false));

        this.pelvic_fin = new AdvancedModelRenderer(this);
        this.pelvic_fin.setRotationPoint(1.5F, 3.0F, 3.65F);
        this.body_3.addChild(pelvic_fin);
        this.setRotateAngle(pelvic_fin, 0.0F, 0.0F, -0.7854F);
        this.pelvic_fin.cubeList.add(new ModelBox(pelvic_fin, 46, 56, -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F, false));
        this.pelvic_fin.cubeList.add(new ModelBox(pelvic_fin, 73, 95, 0.0F, 2.0F, -1.7F, 0, 9, 5, 0.0F, false));

        this.pelvic_fin2 = new AdvancedModelRenderer(this);
        this.pelvic_fin2.setRotationPoint(-2.5F, 3.0F, 3.65F);
        this.body_3.addChild(pelvic_fin2);
        this.setRotateAngle(pelvic_fin2, 0.0F, 0.0F, 0.7854F);
        this.pelvic_fin2.cubeList.add(new ModelBox(pelvic_fin2, 46, 56, -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F, true));
        this.pelvic_fin2.cubeList.add(new ModelBox(pelvic_fin2, 73, 95, 0.0F, 2.0F, -1.7F, 0, 9, 5, 0.0F, true));

        this.body_5 = new AdvancedModelRenderer(this);
        this.body_5.setRotationPoint(0.0F, 0.0F, 9.5F);
        this.body_3.addChild(body_5);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 2.3245F, 4.7626F);
        this.body_5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 84, -1.5F, -4.0024F, -6.9883F, 4, 4, 7, -0.004F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -2.1947F, 0.3144F);
        this.body_5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 94, 64, -1.5F, -0.1024F, 0.0117F, 4, 4, 5, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 102, 38, -1.0F, -0.1024F, 5.0117F, 3, 3, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 1.8238F, 7.8544F);
        this.body_5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 96, 84, -1.5F, -3.1024F, -3.9883F, 3, 3, 4, -0.002F, false));

        this.body_6 = new AdvancedModelRenderer(this);
        this.body_6.setRotationPoint(-0.5F, 0.0F, 8.1F);
        this.body_5.addChild(body_6);
        this.body_6.cubeList.add(new ModelBox(body_6, 0, 21, 0.0F, -9.0F, 1.8F, 0, 18, 11, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.1248F, 2.8723F);
        this.body_6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 45, 102, -1.0F, -2.0024F, -3.9883F, 2, 2, 4, -0.002F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -2.1947F, -7.7856F);
        this.body_6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 83, 64, -1.0F, -0.1024F, 8.0117F, 2, 2, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 6.7464F, 6.4856F);
        this.body_6.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.4363F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 102, 31, -1.0F, -0.9614F, 0.0172F, 1, 1, 5, -0.002F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -0.4F, 3.0F);
        this.body_6.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -1.0036F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 94, 74, -1.0F, -0.0614F, -0.0828F, 1, 1, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.maiaspondylus.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();


        AdvancedModelRenderer[] fishTail = {this.body_3, this.body_5, this.body_6};
        AdvancedModelRenderer[] upperBody = {this.head};
        ((EntityPrehistoricFloraMaiaspondylus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.15F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.8F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.18F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {

            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.35F * still, -3, f2, 0.5F * still);
            }
            else {
                this.chainSwing(fishTail, speed * still, 0.45F * still, -3, f2, 0.5F * still);
            }
            this.chainSwing(upperBody, speed * still, 0.15F, 0, f2, 0.5F *still);
        }
        else {
            //Dont swing if on land - it loooks dumb
            //this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoral_fin, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoral_fin, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);
        this.walk(pectoral_fin, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(pectoral_fin2, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
        this.swing(pectoral_fin2, (float) (speed * 0.65), 0.2F, false, 0, 0, f2, 0.5F);
        this.walk(pectoral_fin2, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(pelvic_fin, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvic_fin, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
        this.walk(pelvic_fin, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        this.flap(pelvic_fin2, (float) (speed * 0.65), 0.4F, true, 1.8F, 0, f2, 0.5F);
        this.swing(pelvic_fin2, (float) (speed * 0.65), 0.2F, false, 1, 0, f2, 0.5F);
        this.walk(pelvic_fin2, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            //this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.maiaspondylus.offsetY = 0.15F;
            this.bob(maiaspondylus, -speed * 1.8F, 0.02F, false, f2, 1);
            this.walk(lower_jaw, (float) (speed * 1.8F), 0.15F, false, 1, 0, f2, 0);
            this.chainWave(fishTail, speed * 1.5F, 0.0025F, -0.1, f2, 0.4F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.01F, -0.25, f2, 0.2F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, -(float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

