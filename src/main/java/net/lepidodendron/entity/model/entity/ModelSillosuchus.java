package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSillosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelSillosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended bodyback;
    private final AdvancedModelRendererExtended legL;
    private final AdvancedModelRendererExtended legL2;
    private final AdvancedModelRendererExtended legL3;
    private final AdvancedModelRendererExtended legL4;
    private final AdvancedModelRendererExtended legR;
    private final AdvancedModelRendererExtended legR2;
    private final AdvancedModelRendererExtended legR3;
    private final AdvancedModelRendererExtended legR4;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended bodyfront;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended ArmL;
    private final AdvancedModelRendererExtended ArmL2;
    private final AdvancedModelRendererExtended ArmL3;
    private final AdvancedModelRendererExtended ArmR;
    private final AdvancedModelRendererExtended ArmR2;
    private final AdvancedModelRendererExtended ArmR3;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;

    private ModelAnimator animator;

    public ModelSillosuchus() {
        this.textureWidth = 144;
        this.textureHeight = 144;

        this.bodyback = new AdvancedModelRendererExtended(this);
        this.bodyback.setRotationPoint(0.0F, -6.15F, -1.0F);
        this.setRotateAngle(bodyback, -0.0436F, 0.0F, 0.0F);
        this.bodyback.cubeList.add(new ModelBox(bodyback, 0, 65, -6.0F, -5.0F, -0.5F, 12, 15, 11, 0.0F, false));

        this.legL = new AdvancedModelRendererExtended(this);
        this.legL.setRotationPoint(6.0F, -1.75F, 6.5F);
        this.bodyback.addChild(legL);
        this.setRotateAngle(legL, -0.3491F, 0.0F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 78, 81, -1.75F, -0.9564F, -4.999F, 6, 16, 10, 0.0F, false));

        this.legL2 = new AdvancedModelRendererExtended(this);
        this.legL2.setRotationPoint(1.75F, 14.3F, -3.9F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.48F, 0.0F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 104, 101, -3.27F, -0.113F, -0.7017F, 5, 19, 6, 0.0F, false));

        this.legL3 = new AdvancedModelRendererExtended(this);
        this.legL3.setRotationPoint(0.0F, 18.887F, 4.2883F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -1.6581F, 0.0F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 107, -3.77F, -0.8918F, -1.4781F, 6, 10, 3, -0.01F, false));

        this.legL4 = new AdvancedModelRendererExtended(this);
        this.legL4.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.legL3.addChild(legL4);
        this.legL4.cubeList.add(new ModelBox(legL4, 110, 9, -3.77F, 0.0F, -1.49F, 6, 5, 3, 0.0F, false));

        this.legR = new AdvancedModelRendererExtended(this);
        this.legR.setRotationPoint(-6.0F, -1.75F, 6.5F);
        this.bodyback.addChild(legR);
        this.setRotateAngle(legR, -0.3491F, 0.0F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 46, 72, -4.25F, -0.9564F, -4.999F, 6, 16, 10, 0.0F, false));

        this.legR2 = new AdvancedModelRendererExtended(this);
        this.legR2.setRotationPoint(-1.75F, 14.3F, -3.9F);
        this.legR.addChild(legR2);
        this.setRotateAngle(legR2, 0.48F, 0.0F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 59, 101, -1.73F, -0.113F, -0.7017F, 5, 19, 6, 0.0F, false));

        this.legR3 = new AdvancedModelRendererExtended(this);
        this.legR3.setRotationPoint(0.0F, 18.887F, 4.2883F);
        this.legR2.addChild(legR3);
        this.setRotateAngle(legR3, -1.6581F, 0.0F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, -2.23F, -0.8918F, -1.4781F, 6, 10, 3, -0.01F, false));

        this.legR4 = new AdvancedModelRendererExtended(this);
        this.legR4.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.legR3.addChild(legR4);
        this.legR4.cubeList.add(new ModelBox(legR4, 46, 98, -2.23F, 0.0F, -1.49F, 6, 5, 3, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -2.0F, 11.0F);
        this.bodyback.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 46, 19, -4.5F, -2.5F, -1.0F, 9, 10, 16, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 5.5F, 6.0F);
        this.tail.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 91, -3.5F, 0.5F, -6.75F, 7, 3, 13, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 47, -3.0F, -1.75F, -1.0F, 6, 7, 18, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 16.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 81, 30, -2.0F, -1.5F, -1.0F, 4, 5, 15, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 1.0F, 14.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 27, 94, -1.5F, -1.5F, -1.0F, 3, 3, 13, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2182F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 98, 50, -1.0F, -1.0F, -1.0F, 2, 2, 13, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -0.2F, -2.0F);
        this.bodyback.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.5F, -5.2181F, -15.4952F, 13, 17, 18, 0.0F, false));

        this.bodyfront = new AdvancedModelRendererExtended(this);
        this.bodyfront.setRotationPoint(0.0F, -0.4681F, -16.9952F);
        this.body.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0873F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 35, -6.0F, -4.0115F, -12.9886F, 12, 15, 15, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 6.2385F, -12.9886F);
        this.bodyfront.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 0, -6.0F, 3.0F, 0.5F, 12, 2, 15, -0.01F, false));

        this.ArmL = new AdvancedModelRendererExtended(this);
        this.ArmL.setRotationPoint(6.0F, 6.2385F, -9.9886F);
        this.bodyfront.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.6981F, 0.0F, 0.0F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 44, 0, -1.5F, 0.0F, -1.75F, 3, 10, 3, 0.0F, false));

        this.ArmL2 = new AdvancedModelRendererExtended(this);
        this.ArmL2.setRotationPoint(0.25F, 8.75F, 0.2F);
        this.ArmL.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -1.0908F, 0.0F, 0.0F);
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 27, 91, -1.02F, -0.25F, -1.74F, 2, 9, 3, 0.0F, false));

        this.ArmL3 = new AdvancedModelRendererExtended(this);
        this.ArmL3.setRotationPoint(0.9F, 8.75F, -0.5F);
        this.ArmL2.addChild(ArmL3);
        this.setRotateAngle(ArmL3, 0.0F, 0.0F, 0.3054F);
        this.ArmL3.cubeList.add(new ModelBox(ArmL3, 0, 65, -1.92F, 0.0F, -1.24F, 2, 3, 3, 0.01F, false));

        this.ArmR = new AdvancedModelRendererExtended(this);
        this.ArmR.setRotationPoint(-6.0F, 6.2385F, -9.9886F);
        this.bodyfront.addChild(ArmR);
        this.setRotateAngle(ArmR, 0.6981F, 0.0F, 0.0F);
        this.ArmR.cubeList.add(new ModelBox(ArmR, 0, 35, -1.5F, 0.0F, -1.75F, 3, 10, 3, 0.0F, false));

        this.ArmR2 = new AdvancedModelRendererExtended(this);
        this.ArmR2.setRotationPoint(-0.25F, 8.75F, 0.2F);
        this.ArmR.addChild(ArmR2);
        this.setRotateAngle(ArmR2, -1.0908F, 0.0F, 0.0F);
        this.ArmR2.cubeList.add(new ModelBox(ArmR2, 0, 91, -0.98F, -0.25F, -1.74F, 2, 9, 3, 0.0F, false));

        this.ArmR3 = new AdvancedModelRendererExtended(this);
        this.ArmR3.setRotationPoint(-0.9F, 8.75F, -0.5F);
        this.ArmR2.addChild(ArmR3);
        this.setRotateAngle(ArmR3, 0.0F, 0.0F, -0.3054F);
        this.ArmR3.cubeList.add(new ModelBox(ArmR3, 39, 42, -0.08F, 0.0F, -1.24F, 2, 3, 3, 0.01F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -2.0115F, -12.2386F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, -0.4363F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 69, 57, -3.5F, -1.1373F, -10.2918F, 7, 9, 15, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 1.0627F, -10.0418F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3054F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 85, 4, -3.0F, -1.6486F, -9.1574F, 6, 7, 13, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.8514F, -8.6574F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0436F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 104, 24, -2.0F, -2.0872F, -7.7481F, 4, 6, 8, -0.02F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 1.4128F, -1.9981F);
        this.neck3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 55, -1.5F, -1.5F, -7.0F, 3, 4, 6, -0.02F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -1.9872F, -7.7981F);
        this.neck3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.637F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 13, -2.0F, 0.0F, -1.85F, 4, 3, 2, -0.03F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.6128F, -7.0481F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.6545F, 0.0F, 0.0F);


        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.5F, 1.3352F, 0.943F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 82, 50, -2.5F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 104, 38, -2.5F, -3.0F, -4.75F, 4, 3, 4, -0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 100, 81, -2.0F, 0.0F, -13.5F, 3, 1, 8, 0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 1.0F, -4.3F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4014F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 66, 45, -1.5F, -1.5175F, 1.9901F, 2, 1, 2, -0.03F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -10.5F);
        this.lowerjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 98, 65, -2.0F, -0.95F, 4.475F, 3, 1, 6, -0.03F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, -10.5F);
        this.lowerjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 110, -1.5F, -0.9F, -0.975F, 2, 1, 6, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.5F, 1.3352F, 0.943F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 81, 107, -2.5F, -4.0F, -6.0F, 4, 4, 6, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 110, 0, -2.0F, -2.0F, -11.7F, 3, 2, 7, 0.015F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 71, -2.0F, -1.0F, -13.725F, 3, 1, 2, 0.01F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -1.1F, -11.5F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.117F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 13, -2.0F, -1.962F, -1.1229F, 3, 1, 1, -0.02F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 13, -2.0F, -1.962F, -0.9229F, 3, 1, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -2.6F, -6.1F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 66, 45, -2.0F, -1.163F, -7.0791F, 3, 2, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-1.5F, -1.0F, -10.5F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.096F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 110, 0.0F, 0.0F, -1.0F, 1, 1, 6, 0.0125F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.5F, -1.0F, -10.5F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.096F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 110, 90, -1.0F, 0.0F, -1.0F, 1, 1, 6, 0.0125F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-2.0F, 4.0F, -6.0F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.0873F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 80, 24, -0.5F, -8.0F, 0.1F, 1, 4, 6, -0.01F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(1.0F, 4.0F, -6.0F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0873F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 83, 0, -0.5F, -8.0F, 0.1F, 1, 4, 6, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bodyback.render(f5);
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.bodyback.offsetY = 0.4F;
        this.bodyback.offsetX = 0.2F;
        this.bodyback.offsetZ = 2.0F;
        this.bodyback.rotateAngleY = (float)Math.toRadians(120);
        this.bodyback.rotateAngleX = (float)Math.toRadians(0);
        this.bodyback.rotateAngleZ = (float)Math.toRadians(0);
        this.bodyback.scaleChildren = true;
        float scaler = 0.45F;
        this.bodyback.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(bodyback, 0.4F, 3.8F, -0.2F);
        this.setRotateAngle(legL, 18.5F, 0.0F, 0.0F);
        this.setRotateAngle(legL2, 19.2F, 0.0F, 0.0F);
        this.setRotateAngle(legL3, 11.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR, 18.8F, 0.0F, 0.0F);
        this.setRotateAngle(legR2, 19.7F, 0.0F, 0.0F);
        this.setRotateAngle(legR3, 10.9F, 0.0F, 0.0F);
        this.setRotateAngle(legR4, 18.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.12F, -0.1F, -0.1F);
        this.setRotateAngle(tail3, -0.3F, -0.0F, -0.18F);
        this.setRotateAngle(tail4, -0.2F, -0.10F, -1.3F);
        this.setRotateAngle(tail5, -0.4F, -0.5F, 0.0F);
        this.setRotateAngle(body, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(bodyfront, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL, 0.6F, -0.0F, 0.0F);
        this.setRotateAngle(ArmL2, -1.8F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL3, 0.0F, -0.0F, 1.2F);
        this.setRotateAngle(ArmR, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(ArmR2, -1.8F, 0.0F, 0.0F);
        this.setRotateAngle(ArmR3, 0.0F, -0.0F, -1.3F);
        this.setRotateAngle(neck, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.4F, -0.0F, 0.1F);
        this.setRotateAngle(neck3, -0.0F, 0.1F, 0.3F);
        this.setRotateAngle(head, 0.1F, -0.9F, 0.1F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperjaw, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.bodyback.render(f);
        //Reset rotations, positions and sizing:
        this.bodyback.setScale(1.0F, 1.0F, 1.0F);
        this.bodyback.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.bodyfront.rotateAngleY = (float) Math.toRadians(0);
        this.setRotateAngle(ArmL, 0.6F, -0.0F, 0.0F);
        this.setRotateAngle(ArmL2, -1.8F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL3, 0.0F, -0.0F, 1.2F);
        this.setRotateAngle(ArmR, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(ArmR2, -1.8F, 0.0F, 0.0F);
        this.setRotateAngle(ArmR3, 0.0F, -0.0F, -1.3F);
        this.setRotateAngle(neck, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.4F, -0.0F, 0.1F);
        this.setRotateAngle(neck3, -0.0F, 0.1F, 0.3F);
        this.setRotateAngle(head, 0.1F, -0.9F, 0.1F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperjaw, 0.0F, 0.0F, 0.0F);
        this.bodyfront.offsetY = -0.0F;
        this.bodyfront.offsetX = -0.0F;
        this.bodyfront.offsetZ = 0.2F;
        this.bodyfront.render(0.01F);
        resetToDefaultPose();
    }
     public void renderStaticFloor(float f) {
        this.setRotateAngle(legL, 18.5F, 0.0F, 0.0F);
        this.setRotateAngle(legL2, 19.2F, 0.0F, 0.0F);
        this.setRotateAngle(legL3, 11.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR, 18.8F, 0.0F, 0.0F);
        this.setRotateAngle(legR2, 19.7F, 0.0F, 0.0F);
        this.setRotateAngle(legR3, 10.9F, 0.0F, 0.0F);
        this.setRotateAngle(legR4, 18.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.12F, -0.1F, -0.1F);
        this.setRotateAngle(tail3, -0.3F, -0.0F, -0.18F);
        this.setRotateAngle(tail4, -0.2F, -0.10F, -1.3F);
        this.setRotateAngle(tail5, -0.4F, -0.5F, 0.0F);
        this.setRotateAngle(body, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(bodyfront, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(bodyback, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL, 0.6F, -0.0F, 0.0F);
        this.setRotateAngle(ArmL2, -1.8F, 0.0F, 0.0F);
        this.setRotateAngle(ArmL3, 0.0F, -0.0F, 1.2F);
        this.setRotateAngle(ArmR, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(ArmR2, -1.8F, 0.0F, 0.0F);
        this.setRotateAngle(ArmR3, 0.0F, -0.0F, -1.3F);
        this.setRotateAngle(neck, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.4F, -0.0F, 0.1F);
        this.setRotateAngle(neck3, -0.0F, 0.1F, 0.3F);
        this.setRotateAngle(head, 0.1F, -0.9F, 0.1F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperjaw, 0.0F, 0.0F, 0.0F);
        this.bodyback.offsetY=-0.165f;
        this.bodyback.render(0.01F);
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
        //this.bodyback.offsetY = 0.2F;

        EntityPrehistoricFloraSillosuchus Sillosuchus = (EntityPrehistoricFloraSillosuchus) e;
        float masterSpeed = Sillosuchus.getTravelSpeed();

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, neck3);
        this.faceTarget(f3, f4, 10, head);

        //float speed = 0.2F;


        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3};
        Sillosuchus.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] ArmL = {this.ArmL, this.ArmL2};
        AdvancedModelRenderer[] ArmR = {this.ArmR, this.ArmR2};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Sillosuchus.getAnimation() == Sillosuchus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Sillosuchus.isReallyInWater()) {

            if (f3 == 0.0F || !Sillosuchus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.2F*0.6F), 0.10F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.2F*0.6F) * 2F, 0.05F, 0.12F, f2, 1F);

                return;
           }

            if (Sillosuchus.getIsFast()) { //Running
                float speed = masterSpeed / 2.1F;
                //this.body.offsetY = 0.75F;
                this.legL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.225), false, 3, f2, 1.5F);
                this.legR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.225), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
                this.walk(ArmL2, speed, 0.10F, true, 5, 0F, f2, 1F);
                this.walk(ArmR2, speed, 0.10F, true, 2, 0F, f2, 1F);

                this.walk(legL, speed, 0.60F, true, 8, 0.15F, f2, 1F);
                this.walk(legR, speed, 0.60F, true, 5, 0.15F, f2, 1F);

                this.walk(legL2, speed, 0.60F, true, 6.5F, -0.7F, f2, 1F);
                this.walk(legR2, speed, 0.60F, true, 3.5F, -0.7F, f2, 1F);

                this.walk(legL3, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                this.walk(legR3, speed, 0.25F, true, 1, -0.18F, f2, 1F);

                this.walk(legL4, speed, 1.2F, true, 7.5F, -0.5F, f2, 1F);
                this.walk(legR4, speed, 1.2F, true, 4.5F, -0.5F, f2, 1F);

                this.bobExtended(bodyback, speed * 2F, 1.0F, false, 2.5F, f2, 1F);

                this.flap(bodyback, speed, 0.08F, false, 5.0F, 0.06F, f2, 1.0F);
                this.flap(body, speed, -0.08F, false, 5.0F, -0.06F, f2, 1.0F);
                this.flap(bodyfront, speed, -0.045F, false, 5.0F, -0.04F, f2, 1.0F);
                this.flap(neck, speed, 0.09F, false, 5.0F, 0.04F, f2, 1.0F);

                this.flap(legL, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
                this.flap(legR, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);

                this.walk(body, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(bodyfront, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(neck, speed * 2, -0.25F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(neck2, speed * 2, -0.3F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(neck3, speed * 2, 0.2F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(head, speed * 2, 0.35F, false, 2.5F, 0F, f2, 0.8F);

                this.chainFlap(Tail, (speed * 0.6F), 0.20F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

                this.bodyback.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.1), false, 1.5F, f2, 1) + 0.2F;
            }
            else { //Walking
                float speed = masterSpeed / 2.45F;
                //this.body.offsetY = 0.95F;
                this.legL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.125), false, 3, f2, 1.5F);
                this.legR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.125), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
                this.walk(ArmL2, speed, 0.10F, true, 5, 0F, f2, 1F);
                this.walk(ArmR2, speed, 0.10F, true, 2, 0F, f2, 1F);

                this.walk(legL, speed, 0.40F, true, 8, 0.15F, f2, 1F);
                this.walk(legR, speed, 0.40F, true, 5, 0.15F, f2, 1F);

                this.walk(legL2, speed, 0.30F, true, 6.5F, 0F, f2, 1F);
                this.walk(legR2, speed, 0.30F, true, 3.5F, 0F, f2, 1F);

                this.bobExtended(legL2, speed, 1.5F, false, 7.0F, f2, 1F);
                this.bobExtended(legR2, speed, 1.5F, false, 4.0F, f2, 1F);

                this.walk(legL3, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                this.walk(legR3, speed, 0.25F, true, 1, -0.18F, f2, 1F);

                this.walk(legL4, speed, 0.5F, true, 5.0F, 0F, f2, 1F);
                this.walk(legR4, speed, 0.5F, true, 2.0F, 0F, f2, 1F);

                this.bobExtended(bodyback, speed * 2F, 1.33F, false, 3.5F, f2, 1F);

                this.flap(bodyback, speed, 0.11F, false, 6.0F, 0.06F, f2, 1.0F);
                this.flap(body, speed, -0.11F, false, 6.0F, -0.06F, f2, 1.0F);
                this.flap(bodyfront, speed, -0.06F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(neck, speed, 0.08F, false, 6.0F, 0.04F, f2, 1.0F);

                this.flap(legL, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
                this.flap(legR, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);

                this.walk(body, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(bodyfront, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(neck, speed * 2, -0.25F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(neck2, speed * 2, -0.3F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(neck3, speed * 2, 0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(head, speed * 2, 0.35F * 0.75F, false, 2.5F, 0F, f2, 0.8F);

                this.chainFlap(Tail, (speed * 0.6F), 0.20F * 0.75F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F * 0.75F, 0.12F, f2, 1F);

                this.bodyback.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.0), false, 1.75F, f2, 1) + 0.2F;

            }
        }
        else {
            //Swimming pose:
            
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water

            return;

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSillosuchus e = (EntityPrehistoricFloraSillosuchus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.bodyback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.bodyback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.rotate(this.bodyback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.bodyback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.rotate(this.bodyback, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(15);
        animator.move(this.neck, (float) Math.toRadians(-30),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.neck, (float) Math.toRadians(-35),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(2);
        animator.move(this.neck, (float) Math.toRadians(-32),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-32), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.setStaticKeyframe(2);
        animator.startKeyframe(2);
        animator.move(this.neck, (float) Math.toRadians(-35),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(2);
        animator.move(this.neck, (float) Math.toRadians(-32),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-32), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(-6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.bodyback, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(-6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.bodyback, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(10);
        animator.move(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
