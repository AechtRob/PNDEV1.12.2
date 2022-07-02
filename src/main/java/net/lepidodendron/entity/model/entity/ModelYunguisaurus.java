package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraYunguisaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelYunguisaurus extends AdvancedModelBase {
    private final AdvancedModelRenderer Yunguisaurus;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer flipper;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer flipper3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer rightbackflipper;
    private final AdvancedModelRenderer flipper2;
    private final AdvancedModelRenderer leftbackflipper;
    private final AdvancedModelRenderer flipper4;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;

    private ModelAnimator animator;


    public ModelYunguisaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Yunguisaurus = new AdvancedModelRenderer(this);
        this.Yunguisaurus.setRotationPoint(0.5F, 24.0F, 7.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Yunguisaurus.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -8.0F, -16.0F, 11, 8, 17, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, -4.0F, -15.5F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 43, 67, -4.5F, -3.5F, -3.0F, 9, 7, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 76, 1, -4.0F, -2.5F, -3.0F, 8, 5, 4, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 17, 44, -2.5F, -2.0F, -7.0F, 5, 4, 7, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0F, -5.75F);
        this.neck3.addChild(neck4);
        this.neck4.cubeList.add(new ModelBox(neck4, 39, 0, -2.0444F, -2.0029F, -8.249F, 4, 4, 8, -0.01F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(-0.0444F, -0.7529F, -6.999F);
        this.neck4.addChild(neck5);
        this.neck5.cubeList.add(new ModelBox(neck5, 0, 39, -2.0F, -1.25F, -8.25F, 4, 4, 8, -0.011F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.25F, 0.1985F, -7.6826F);
        this.neck5.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 61, 36, -1.75F, -1.6221F, -2.8022F, 4, 3, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 62, 42, -1.75F, -0.6221F, -5.8022F, 4, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 2.0F, 1.3779F, -6.0522F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.5F, 1.3779F, -6.0522F, 0, 1, 2, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 57, 21, -1.25F, -0.6221F, -9.8022F, 3, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 2, 1.5F, 1.3779F, -9.8022F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 2, -1.0F, 1.3779F, -9.8022F, 0, 1, 3, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.25F, -0.1221F, -5.8022F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 27, -1.0F, -1.0F, -3.75F, 3, 2, 7, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.25F, 1.3779F, -9.3022F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3054F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 10, 0.0F, -0.5F, 2.5F, 0, 2, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.75F, 1.3779F, -9.3022F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.3054F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 4, 10, 0.0F, -0.5F, 2.5F, 0, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.25F, 1.3779F, -8.3022F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.0873F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 8, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.75F, 1.3779F, -8.3022F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.0873F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 8, 0.0F, -1.0F, -0.5F, 0, 3, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.25F, 1.3779F, -9.8022F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 9, -1.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.75F, 1.3779F, -3.3022F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3054F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 2, 10, 0.0F, -1.25F, -0.75F, 0, 2, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.25F, 1.3779F, -3.3022F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.3054F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 2, 10, 0.0F, -1.25F, -0.75F, 0, 2, 1, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(-0.25F, 1.8779F, -0.5522F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 34, 56, -1.5F, -0.5F, -5.25F, 4, 1, 6, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 0, 2.25F, -1.5F, -4.5F, 0, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 0, -1.25F, -1.5F, -4.5F, 0, 1, 3, 0.0F, true));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 31, 63, -1.0F, -3.0F, -1.5F, 3, 3, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 39, 12, -1.0F, -0.5F, -9.25F, 3, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 1, 1.75F, -1.5F, -8.25F, 0, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 1, -0.75F, -1.5F, -8.25F, 0, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -0.5F, -5.75F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 0, 0.0F, -2.5F, -3.5F, 0, 3, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0F, -0.5F, -5.75F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 0, 0.0F, -2.5F, -3.5F, 0, 3, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -0.5F, -6.75F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.2182F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 10, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.0F, -0.5F, -6.75F);
        this.lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.2182F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 10, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -0.5F, -9.25F);
        this.lowerjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.5F, -2.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, -0.5F, -4.75F);
        this.lowerjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.2618F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 3, 0.0F, -1.5F, -0.25F, 0, 2, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.5F, -0.5F, -4.75F);
        this.lowerjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.2618F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 3, 0.0F, -1.5F, -0.25F, 0, 2, 1, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-4.5F, 2.0F, -1.0F);
        this.neck.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.2182F, 0.5672F, 0.0F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 16, 39, -2.5F, -1.0F, -1.5F, 4, 2, 3, 0.0F, true));

        this.flipper = new AdvancedModelRenderer(this);
        this.flipper.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.rightarm.addChild(flipper);
        this.flipper.cubeList.add(new ModelBox(flipper, 0, 32, -14.0F, -0.5F, -1.5F, 14, 1, 6, 0.0F, true));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(4.5F, 2.0F, -1.0F);
        this.neck.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.2182F, -0.5672F, 0.0F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 16, 39, -1.5F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.flipper3 = new AdvancedModelRenderer(this);
        this.flipper3.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.leftarm.addChild(flipper3);
        this.flipper3.cubeList.add(new ModelBox(flipper3, 0, 32, 0.0F, -0.5F, -1.5F, 14, 1, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -4.0F, -0.5F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 35, 34, -4.0F, -3.5F, 0.0F, 8, 7, 5, 0.0F, false));

        this.rightbackflipper = new AdvancedModelRenderer(this);
        this.rightbackflipper.setRotationPoint(-3.75F, 2.0F, 1.5F);
        this.tail.addChild(rightbackflipper);
        this.setRotateAngle(rightbackflipper, -0.0335F, -0.0806F, 0.394F);
        this.rightbackflipper.cubeList.add(new ModelBox(rightbackflipper, 16, 39, -2.25F, -1.0F, -1.0F, 4, 2, 3, 0.0F, true));

        this.flipper2 = new AdvancedModelRenderer(this);
        this.flipper2.setRotationPoint(-2.25F, 0.0F, 0.5F);
        this.rightbackflipper.addChild(flipper2);
        this.setRotateAngle(flipper2, 0.3927F, 0.0F, 0.0F);
        this.flipper2.cubeList.add(new ModelBox(flipper2, 0, 32, -14.0F, -0.5F, -1.5F, 14, 1, 6, 0.0F, true));

        this.leftbackflipper = new AdvancedModelRenderer(this);
        this.leftbackflipper.setRotationPoint(3.75F, 2.0F, 1.5F);
        this.tail.addChild(leftbackflipper);
        this.setRotateAngle(leftbackflipper, -0.0335F, 0.0806F, -0.394F);
        this.leftbackflipper.cubeList.add(new ModelBox(leftbackflipper, 16, 39, -1.75F, -1.0F, -1.0F, 4, 2, 3, 0.0F, false));

        this.flipper4 = new AdvancedModelRenderer(this);
        this.flipper4.setRotationPoint(2.25F, 0.0F, 0.5F);
        this.leftbackflipper.addChild(flipper4);
        this.setRotateAngle(flipper4, 0.3927F, 0.0F, 0.0F);
        this.flipper4.cubeList.add(new ModelBox(flipper4, 0, 32, 0.0F, -0.5F, -1.5F, 14, 1, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3504F, 4.4591F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 73, 23, -3.0F, -2.3504F, -0.9591F, 6, 4, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -2.6004F, 2.5409F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 57, 11, -2.0F, -0.25F, -3.75F, 5, 4, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.5261F, 0.8271F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3112F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 54, 56, -1.5F, -1.0F, -1.75F, 4, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3504F, 4.7909F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 14, 55, -2.0F, -1.5F, -1.0F, 4, 3, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 51, -1.4564F, -1.5F, -0.999F, 3, 3, 7, -0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.5436F, 0.0F, 6.001F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 61, -1.5436F, -1.5F, 0.0F, 2, 3, 6, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(-0.5F, 0.0F, 5.75F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 9, -0.5436F, -1.0F, -1.0F, 1, 2, 6, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail6.addChild(tail7);
        this.tail7.cubeList.add(new ModelBox(tail7, 0, 0, -0.5436F, -1.0F, 0.0F, 1, 2, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Yunguisaurus.render(f5 * 0.15F);
    }

    public void renderStatic(float f) {
        //Static renderer for taxidermy
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        float Finvertcialangle = 1;

        AdvancedModelRenderer[] tailArr = {this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};

        float speed = 0.18F;

        EntityPrehistoricFloraYunguisaurus ee = (EntityPrehistoricFloraYunguisaurus) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.66F;
        }
        if (!e.isInWater()) {
            speed = 0.3F;
        }
        int CycleA1 = 8;
        int CycleA2 = 2;
        int CycleA3 = 8;
        int CycleA4 = 2;

        int tickA = ee.getCycleTick();
        double revisedtickA = 0;

        if (tickA <= CycleA1) {
            revisedtickA = tickA;
        }
        else {
            if (tickA > (CycleA1 + CycleA2) && tickA <= (CycleA1 + CycleA2 + CycleA3)) {
                revisedtickA = (CycleA1 + CycleA2 + CycleA3) - tickA + 1;
            }
            else {
                if (tickA > (CycleA1 + CycleA2)) {
                    revisedtickA = 0;
                }
                else {
                    revisedtickA = CycleA1;
                }
            }
        }

        double percenttickA = revisedtickA / CycleA1;
        double radiansA = percenttickA * (Math.PI * 0.25 * 2);
        float angleA = (float)Math.sin(radiansA);

        System.err.println("angleA " + angleA);

        //for regular animation
        if (e.isInWater()) {
            this.chainWave(tailArr, speed * still, 0.03F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(tailArr, speed * still, 0.48F * still, -3, f2, 0.5F * still);

            this.swing(Yunguisaurus, speed, 0.1F * still, true, 2, 0, f2, 0.5F);

            //for flipper movement
            //stuff here
        }
        else {
            this.swing(Yunguisaurus, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }

    }

    //for attack animation, copied from Xenacanthus, needs work
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

























































