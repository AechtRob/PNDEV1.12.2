package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEffigia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelEffigia extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended bodyback;
    private final AdvancedModelRendererExtended legR;
    private final AdvancedModelRendererExtended legR2;
    private final AdvancedModelRendererExtended legR3;
    private final AdvancedModelRendererExtended legR4;
    private final AdvancedModelRendererExtended legL;
    private final AdvancedModelRendererExtended legL2;
    private final AdvancedModelRendererExtended legL3;
    private final AdvancedModelRendererExtended legL4;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended bodymiddle;
    private final AdvancedModelRendererExtended bodyfront;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended ArmR;
    private final AdvancedModelRendererExtended ArmR2;
    private final AdvancedModelRendererExtended ArmL;
    private final AdvancedModelRendererExtended ArmL2;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;

    private ModelAnimator animator;

    public ModelEffigia() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 20.85F, -8.0F);


        this.bodyback = new AdvancedModelRendererExtended(this);
        this.bodyback.setRotationPoint(0.0F, -18.0F, 7.0F);
        this.body.addChild(bodyback);
        this.setRotateAngle(bodyback, -0.0436F, 0.0F, 0.0F);
        this.bodyback.cubeList.add(new ModelBox(bodyback, 33, 47, -4.0F, -3.0F, 0.0F, 8, 10, 7, 0.0F, false));

        this.legR = new AdvancedModelRendererExtended(this);
        this.legR.setRotationPoint(-4.0F, -0.75F, 2.75F);
        this.bodyback.addChild(legR);
        this.setRotateAngle(legR, -0.2618F, 0.0F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 71, 16, -2.25F, 0.0436F, -2.999F, 4, 9, 5, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 3, 93, -2.25F, 0.0436F, 2.001F, 4, 9, 1, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 71, 16, -2.25F, -0.9564F, -2.999F, 4, 1, 5, 0.0F, false));
        this.legR.cubeList.add(new ModelBox(legR, 3, 93, -2.25F, -0.9564F, 2.001F, 4, 1, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRendererExtended(this);
        this.legR2.setRotationPoint(-0.75F, 8.6F, -2.7F);
        this.legR.addChild(legR2);
        this.setRotateAngle(legR2, 0.7418F, 0.0F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 72, -0.98F, 0.0F, -0.24F, 3, 9, 4, 0.0F, false));

        this.legR3 = new AdvancedModelRendererExtended(this);
        this.legR3.setRotationPoint(0.0F, 8.2F, 2.65F);
        this.legR2.addChild(legR3);
        this.setRotateAngle(legR3, -0.6981F, 0.0F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 70, 0, -0.98F, 0.3911F, -2.1953F, 3, 7, 3, -0.01F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 71, 2, -0.98F, 7.3911F, -2.1953F, 3, 1, 2, -0.01F, false));
        this.legR3.cubeList.add(new ModelBox(legR3, 70, 0, -0.98F, -0.6089F, -2.1953F, 3, 1, 3, -0.01F, false));

        this.legR4 = new AdvancedModelRendererExtended(this);
        this.legR4.setRotationPoint(0.0F, 7.5673F, -0.5213F);
        this.legR3.addChild(legR4);
        this.setRotateAngle(legR4, -1.309F, 0.0F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 79, 41, -1.48F, 0.1807F, -1.0249F, 4, 5, 2, -0.01F, false));
        this.legR4.cubeList.add(new ModelBox(legR4, 79, 41, -1.48F, -1.7193F, -1.0249F, 4, 2, 2, -0.02F, false));

        this.legL = new AdvancedModelRendererExtended(this);
        this.legL.setRotationPoint(4.0F, -0.75F, 2.75F);
        this.bodyback.addChild(legL);
        this.setRotateAngle(legL, -0.2618F, 0.0F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 23, 65, -1.75F, 0.0436F, -2.999F, 4, 9, 5, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 23, 65, -1.75F, -0.9564F, -2.999F, 4, 1, 5, 0.0F, false));
        this.legL.cubeList.add(new ModelBox(legL, 3, 93, -1.75F, 0.0436F, 2.001F, 4, 9, 1, 0.0F, true));
        this.legL.cubeList.add(new ModelBox(legL, 3, 93, -1.75F, -0.9564F, 2.001F, 4, 1, 1, 0.0F, true));

        this.legL2 = new AdvancedModelRendererExtended(this);
        this.legL2.setRotationPoint(0.75F, 8.6F, -2.7F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.7418F, 0.0F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 42, 68, -2.02F, 0.0F, -0.24F, 3, 9, 4, 0.0F, false));

        this.legL3 = new AdvancedModelRendererExtended(this);
        this.legL3.setRotationPoint(0.0F, 8.2F, 2.65F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -0.6981F, 0.0F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 52, 0, -2.02F, 0.3911F, -2.1953F, 3, 7, 3, -0.01F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 53, 2, -2.02F, 7.3911F, -2.1953F, 3, 1, 2, -0.01F, false));
        this.legL3.cubeList.add(new ModelBox(legL3, 52, 0, -2.02F, -0.6089F, -2.1953F, 3, 1, 3, -0.01F, false));

        this.legL4 = new AdvancedModelRendererExtended(this);
        this.legL4.setRotationPoint(0.0F, 7.5673F, -0.5213F);
        this.legL3.addChild(legL4);
        this.setRotateAngle(legL4, -1.309F, 0.0F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 57, 79, -2.52F, 0.1807F, -1.0249F, 4, 5, 2, -0.01F, false));
        this.legL4.cubeList.add(new ModelBox(legL4, 57, 79, -2.52F, -1.7193F, -1.0249F, 4, 2, 2, -0.02F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -1.0F, 7.0F);
        this.bodyback.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 28, 10, -3.0F, -1.5F, -1.0F, 6, 7, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 41, -2.0F, -0.75F, -1.0F, 4, 5, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 23, 29, -1.5F, -0.5F, -1.0F, 3, 3, 14, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 13.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 52, 0, -1.0F, -0.5F, -1.0F, 2, 2, 13, 0.0F, false));

        this.bodymiddle = new AdvancedModelRendererExtended(this);
        this.bodymiddle.setRotationPoint(0.0F, -1.1F, 1.0F);
        this.bodyback.addChild(bodymiddle);
        this.setRotateAngle(bodymiddle, 0.0436F, 0.0F, 0.0F);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 0, -4.5F, -2.0F, -9.5F, 9, 10, 10, 0.0F, false));

        this.bodyfront = new AdvancedModelRendererExtended(this);
        this.bodyfront.setRotationPoint(0.0F, 0.75F, -9.0F);
        this.bodymiddle.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0873F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 21, -4.0F, -2.75F, -10.0F, 8, 9, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 6.5F, -10.0F);
        this.bodyfront.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 29, -4.0F, -3.0F, 0.0F, 8, 3, 10, -0.01F, false));

        this.ArmR = new AdvancedModelRendererExtended(this);
        this.ArmR.setRotationPoint(-4.0F, 4.5F, -7.0F);
        this.bodyfront.addChild(ArmR);
        this.setRotateAngle(ArmR, 1.0036F, 0.0F, 0.0F);
        this.ArmR.cubeList.add(new ModelBox(ArmR, 0, 21, -0.75F, 0.0F, -1.0F, 2, 6, 2, 0.0F, false));

        this.ArmR2 = new AdvancedModelRendererExtended(this);
        this.ArmR2.setRotationPoint(0.15F, 5.25F, 0.3F);
        this.ArmR.addChild(ArmR2);
        this.setRotateAngle(ArmR2, -0.6545F, 0.0F, 0.0F);
        this.ArmR2.cubeList.add(new ModelBox(ArmR2, 63, 16, -0.38F, 0.0F, -0.24F, 1, 6, 1, 0.0F, false));
        this.ArmR2.cubeList.add(new ModelBox(ArmR2, 49, 29, -0.38F, 0.0F, -0.74F, 1, 6, 1, -0.01F, false));

        this.ArmL = new AdvancedModelRendererExtended(this);
        this.ArmL.setRotationPoint(4.0F, 4.5F, -7.0F);
        this.bodyfront.addChild(ArmL);
        this.setRotateAngle(ArmL, 1.0036F, 0.0F, 0.0F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 0, 0, -1.25F, 0.0F, -1.0F, 2, 6, 2, 0.0F, false));

        this.ArmL2 = new AdvancedModelRendererExtended(this);
        this.ArmL2.setRotationPoint(-0.15F, 5.05F, 0.3F);
        this.ArmL.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -0.6545F, 0.0F, 0.0F);
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 44, 29, -0.62F, 0.1587F, -0.1182F, 1, 6, 1, 0.0F, false));
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 44, 0, -0.62F, 0.1587F, -0.6182F, 1, 6, 1, -0.01F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -1.5F, -9.25F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, -0.7418F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 55, 56, -2.5F, -0.4021F, -4.8231F, 5, 6, 9, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 1.5979F, -4.5731F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 59, -2.0F, -1.75F, -6.25F, 4, 5, 7, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.25F, -5.75F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3491F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 57, 43, -1.5F, -2.0F, -5.75F, 3, 4, 6, -0.02F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.neck3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 0, -1.0F, -2.25F, -5.0F, 2, 3, 5, -0.02F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 1.5F, -5.0F);
        this.neck3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.829F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 61, 47, -1.5F, -2.875F, 0.15F, 3, 4, 2, -0.03F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.5F, -4.25F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.7418F, 0.0F, 0.0F);


        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 16, 59, -2.0F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 36, 82, -2.0F, -2.0F, -3.0F, 3, 2, 3, -0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 75, 56, -1.5F, 0.0F, -8.5F, 2, 1, 5, 0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, -8.5F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.096F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 78, 6, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0125F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-1.5F, 0.0F, -8.5F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.096F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 75, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0125F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -8.5F);
        this.lowerjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 47, -2.0F, -0.95F, 4.475F, 3, 1, 4, -0.03F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 71, 49, -1.5F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 71, 31, -2.0F, -3.0F, -4.0F, 3, 3, 4, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 57, 72, -1.5F, -1.0F, -8.5F, 2, 1, 5, 0.015F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, -8.5F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 49, -1.5F, 1.0F, 3.0F, 2, 1, 2, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 72, -1.5F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-1.5F, -1.0F, -8.5F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.096F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 70, 79, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0125F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.5F, -1.0F, -8.5F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.096F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 80, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0125F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-2.0F, -2.0F, -4.0F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.0873F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 41, 0.0F, -1.0F, 0.0F, 1, 3, 4, -0.01F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(1.0F, -2.0F, -4.0F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0873F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 82, -1.0F, -1.0F, 0.0F, 1, 3, 4, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(neck, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.5F, 0.0F, 0.2F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(bodyfront, 0.0F, 0.0F, 0.0F);
        this.neck.offsetY = -0.025F;
        this.neck.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(bodyback, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(bodymiddle, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(bodyfront, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, -0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, -0.05F, -0.3F, 0.0F);
        this.setRotateAngle(tail4, -0.05F, -0.3F, 0.0F);
        this.setRotateAngle(neck, -0.4F, 0.1F, 0.0F);
        this.setRotateAngle(neck2, -0.3F, 0.1F, 0.0F);
        this.setRotateAngle(neck3, -0.2F, 0.1F, 0.0F);
        this.setRotateAngle(head, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(legL2, 1.3F, 0.0F, 0.0F);
        this.setRotateAngle(legL3, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(legL4, -1.5F, 0.0F, 0.0F);
        this.setRotateAngle(legR, -0.6F, 0.0F, 0.0F);
        this.setRotateAngle(legR2, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(legR3, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(legR4, -0.9F, 0.0F, 0.0F);
        this.body.offsetY = -0.0F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.50F;
        this.body.offsetX = 0.3F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(130);
        this.body.rotateAngleX = (float)Math.toRadians(5);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.8F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.2F, 3.8F, -0.2F);
        this.setRotateAngle(bodyback, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(bodymiddle, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(bodyfront, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, -0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, -0.05F, -0.3F, 0.0F);
        this.setRotateAngle(tail4, -0.05F, -0.3F, 0.0F);
        this.setRotateAngle(neck, -0.4F, 0.1F, 0.0F);
        this.setRotateAngle(neck2, -0.3F, 0.1F, 0.0F);
        this.setRotateAngle(neck3, -0.2F, 0.1F, 0.0F);
        this.setRotateAngle(head, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legL, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(legL2, 1.3F, 0.0F, 0.0F);
        this.setRotateAngle(legL3, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(legL4, -1.5F, 0.0F, 0.0F);
        this.setRotateAngle(legR, -0.6F, 0.0F, 0.0F);
        this.setRotateAngle(legR2, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(legR3, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(legR4, -0.9F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        //this.body.offsetY = 0.95F;

        EntityPrehistoricFloraEffigia Effigia = (EntityPrehistoricFloraEffigia) e;
        float masterSpeed = Effigia.getTravelSpeed();

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, neck3);
        this.faceTarget(f3, f4, 10, head);

        //float speed = 0.2F;


        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3};
        Effigia.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] ArmL = {this.ArmL, this.ArmL2};
        AdvancedModelRenderer[] ArmR = {this.ArmR, this.ArmR2};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Effigia.getAnimation() == Effigia.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Effigia.isReallyInWater()) {

            if (f3 == 0.0F || !Effigia.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.2F*0.6F), 0.10F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.2F*0.6F) * 2F, 0.05F, 0.12F, f2, 1F);

                return;
           }

            if (Effigia.getIsFast()) { //Running
                float speed = masterSpeed / 1.1F;
                this.body.offsetY = -0.2F;
                this.legL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
                this.legR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
                this.walk(ArmL2, speed, 0.10F, true, 5, 0F, f2, 1F);
                this.walk(ArmR2, speed, 0.10F, true, 2, 0F, f2, 1F);

                this.walk(legL, speed, 0.60F, true, 8, 0.55F, f2, 1F);
                this.walk(legR, speed, 0.60F, true, 5, 0.55F, f2, 1F);

                this.walk(legL2, speed, 0.60F, true, 6.5F, -0.7F, f2, 1F);
                this.walk(legR2, speed, 0.60F, true, 3.5F, -0.7F, f2, 1F);

                this.walk(legL3, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                this.walk(legR3, speed, 0.25F, true, 1, -0.18F, f2, 1F);

                this.walk(legL4, speed, 1.2F, true, 7.5F, -0.5F, f2, 1F);
                this.walk(legR4, speed, 1.2F, true, 4.5F, -0.5F, f2, 1F);

                this.bobExtended(body, speed * 2F, 1.0F, false, 2.5F, f2, 1F);

                this.flap(bodyback, speed, 0.12F, false, 5.0F, 0.06F, f2, 1.0F);
                this.flap(bodymiddle, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
                this.flap(bodyfront, speed, -0.08F, false, 5.0F, -0.04F, f2, 1.0F);
                this.flap(neck, speed, 0.08F, false, 5.0F, 0.04F, f2, 1.0F);

                this.flap(legL, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
                this.flap(legR, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);

                this.walk(bodymiddle, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(bodyfront, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(neck, speed * 2, -0.25F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(neck2, speed * 2, -0.3F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(neck3, speed * 2, 0.2F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(head, speed * 2, 0.35F, false, 2.5F, 0F, f2, 0.8F);

                this.chainFlap(Tail, (speed * 0.6F), 0.20F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

                this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.7), false, 1.5F, f2, 1) + 0.2F;
            }
            else { //Walking
                float speed = masterSpeed / 1.45F;
                this.body.offsetY = 0.10F;
                this.legL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 3, f2, 1.5F);
                this.legR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
                this.walk(ArmL2, speed, 0.10F, true, 5, 0F, f2, 1F);
                this.walk(ArmR2, speed, 0.10F, true, 2, 0F, f2, 1F);

                this.walk(legL, speed, 0.40F, true, 8, 0.35F, f2, 1F);
                this.walk(legR, speed, 0.40F, true, 5, 0.35F, f2, 1F);

                this.walk(legL2, speed, 0.30F, true, 6.5F, 0F, f2, 1F);
                this.walk(legR2, speed, 0.30F, true, 3.5F, 0F, f2, 1F);

                this.bobExtended(legL2, speed, 1.5F, false, 7.0F, f2, 1F);
                this.bobExtended(legR2, speed, 1.5F, false, 4.0F, f2, 1F);

                this.walk(legL3, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                this.walk(legR3, speed, 0.25F, true, 1, -0.18F, f2, 1F);

                this.walk(legL4, speed, 0.5F, true, 5.0F, -0.45F, f2, 1F);
                this.walk(legR4, speed, 0.5F, true, 2.0F, -0.45F, f2, 1F);

                this.bobExtended(body, speed * 2F, 1.33F, false, 3.5F, f2, 1F);

                this.flap(bodyback, speed, 0.22F, false, 6.0F, 0.06F, f2, 1.0F);
                this.flap(bodymiddle, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
                this.flap(bodyfront, speed, -0.12F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(neck, speed, 0.12F, false, 6.0F, 0.04F, f2, 1.0F);

                this.flap(legL, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
                this.flap(legR, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);

                this.walk(bodymiddle, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(bodyfront, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(neck, speed * 2, -0.25F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(neck2, speed * 2, -0.3F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(neck3, speed * 2, 0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(head, speed * 2, 0.35F * 0.75F, false, 2.5F, 0F, f2, 0.8F);

                this.chainFlap(Tail, (speed * 0.6F), 0.20F * 0.75F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F * 0.75F, 0.12F, f2, 1F);

                this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

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
        EntityPrehistoricFloraEffigia e = (EntityPrehistoricFloraEffigia) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.body, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.body, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
        animator.rotate(this.body, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legL, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.legR, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmL, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.ArmR, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.body, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
        animator.rotate(this.body, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
        animator.rotate(this.body, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
        animator.rotate(this.body, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
