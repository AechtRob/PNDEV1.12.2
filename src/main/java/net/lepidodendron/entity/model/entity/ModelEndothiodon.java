package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEndothiodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEndothiodon extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended endothiodon;
    private final AdvancedModelRendererExtended bodycentre;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended bodyback;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended legBL1;
    private final AdvancedModelRendererExtended legBL2;
    private final AdvancedModelRendererExtended legBL3;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended legBL4;
    private final AdvancedModelRendererExtended legBL5;
    private final AdvancedModelRendererExtended legBL6;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended bodyfront;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended legRL1;
    private final AdvancedModelRendererExtended legRL2;
    private final AdvancedModelRendererExtended legRL3;
    private final AdvancedModelRendererExtended legRL4;
    private final AdvancedModelRendererExtended legRL5;
    private final AdvancedModelRendererExtended legRL6;

    private ModelAnimator animator;

    public ModelEndothiodon() {
        this.textureWidth = 96;
        this.textureHeight = 92;

        this.endothiodon = new AdvancedModelRendererExtended(this);
        this.endothiodon.setRotationPoint(5.0F, 24.0F, -5.0F);


        this.bodycentre = new AdvancedModelRendererExtended(this);
        this.bodycentre.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.endothiodon.addChild(bodycentre);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodycentre.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0262F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -12.0F, -21.0F, -4.0F, 14, 15, 17, 0.0F, false));

        this.bodyback = new AdvancedModelRendererExtended(this);
        this.bodyback.setRotationPoint(-5.0F, -17.0F, 11.0F);
        this.bodycentre.addChild(bodyback);
        this.setRotateAngle(bodyback, -0.0873F, 0.0F, 0.0F);
        this.bodyback.cubeList.add(new ModelBox(bodyback, 40, 32, -5.5F, -3.0F, 0.0F, 11, 11, 7, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 1.0F, 7.0F);
        this.bodyback.addChild(tail1);
        this.setRotateAngle(tail1, -0.4363F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 42, 80, -2.5F, -2.0F, -1.0F, 5, 4, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -1.5F, 2.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.3927F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 50, -1.0F, -0.5F, 0.0F, 2, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 3.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2618F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 37, -0.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F, false));

        this.legBL1 = new AdvancedModelRendererExtended(this);
        this.legBL1.setRotationPoint(6.0F, 3.5F, 6.0F);
        this.bodyback.addChild(legBL1);
        this.setRotateAngle(legBL1, -0.1745F, -0.3491F, -0.1745F);
        this.legBL1.cubeList.add(new ModelBox(legBL1, 73, 68, -4.5F, -1.0F, -2.5F, 5, 8, 6, 0.0F, false));

        this.legBL2 = new AdvancedModelRendererExtended(this);
        this.legBL2.setRotationPoint(0.0F, 7.0F, -0.5F);
        this.legBL1.addChild(legBL2);
        this.setRotateAngle(legBL2, 0.6981F, 0.0873F, 0.1309F);
        this.legBL2.cubeList.add(new ModelBox(legBL2, 0, 0, -4.0F, -1.0F, -1.0F, 4, 7, 4, -0.01F, false));

        this.legBL3 = new AdvancedModelRendererExtended(this);
        this.legBL3.setRotationPoint(0.0F, 6.0F, 0.25F);
        this.legBL2.addChild(legBL3);
        this.setRotateAngle(legBL3, -0.3927F, 0.0436F, 0.0436F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0F, -0.25F);
        this.legBL3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.5708F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 79, 10, -4.0F, -1.25F, -2.0F, 4, 5, 2, 0.0F, false));

        this.legBL4 = new AdvancedModelRendererExtended(this);
        this.legBL4.setRotationPoint(-6.0F, 3.5F, 6.0F);
        this.bodyback.addChild(legBL4);
        this.setRotateAngle(legBL4, -0.1745F, 0.3491F, 0.1745F);
        this.legBL4.cubeList.add(new ModelBox(legBL4, 73, 68, -0.5F, -1.0F, -2.5F, 5, 8, 6, 0.0F, true));

        this.legBL5 = new AdvancedModelRendererExtended(this);
        this.legBL5.setRotationPoint(0.0F, 7.0F, -0.5F);
        this.legBL4.addChild(legBL5);
        this.setRotateAngle(legBL5, 0.6981F, -0.0873F, -0.1309F);
        this.legBL5.cubeList.add(new ModelBox(legBL5, 0, 0, 0.0F, -1.0F, -1.0F, 4, 7, 4, -0.01F, true));

        this.legBL6 = new AdvancedModelRendererExtended(this);
        this.legBL6.setRotationPoint(0.0F, 6.0F, 0.25F);
        this.legBL5.addChild(legBL6);
        this.setRotateAngle(legBL6, -0.3927F, -0.0436F, -0.0436F);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, -0.25F);
        this.legBL6.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.5708F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 79, 10, 0.0F, -1.25F, -2.0F, 4, 5, 2, 0.0F, true));

        this.bodyfront = new AdvancedModelRendererExtended(this);
        this.bodyfront.setRotationPoint(-5.0F, -18.0F, -3.5F);
        this.bodycentre.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 45, 0, -6.0F, -2.5F, -4.5F, 12, 12, 5, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, -1.0F, -2.5F);
        this.bodyfront.addChild(neck1);
        this.setRotateAngle(neck1, -0.3054F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 50, -5.0F, -1.0F, -3.0F, 10, 11, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.neck1.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 62, 17, -4.5F, -1.5F, -2.0F, 9, 7, 5, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.5672F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 4.611F, -3.045F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2705F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 50, -4.0F, -3.0F, -4.5F, 8, 5, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.1274F, 1.2548F, -15.9046F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.6274F, -0.5F, -0.5954F, 1, 1, 1, -0.01F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -0.1882F, -15.2747F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.5272F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 67, -1.5F, -1.2544F, -1.3547F, 3, 9, 1, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 32, -1.5F, -1.2618F, -0.8753F, 3, 4, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -0.1882F, -15.2747F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.0908F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 64, -2.0F, -1.2118F, -0.5253F, 4, 3, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-3.78F, 0.0F, -5.67F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 32, -1.8874F, 0.7774F, -4.4074F, 4, 3, 4, -0.01F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 49, 68, -1.8874F, -2.7426F, -8.1874F, 4, 4, 8, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(3.78F, 0.0F, -5.67F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.3491F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 32, -2.1126F, 0.7774F, -4.4074F, 4, 3, 4, -0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 49, 68, -2.1126F, -2.7426F, -8.1874F, 4, 4, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -3.15F, -6.3F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 77, -4.0F, 1.796F, -5.67F, 8, 4, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -3.15F, -6.3F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 57, -4.0F, -1.984F, -8.19F, 8, 4, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, -5.2951F, -2.8731F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 13, -1.0F, 0.1451F, -1.2269F, 2, 1, 3, -0.01F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, -5.28F, -3.8601F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 67, -1.0F, -0.22F, -3.1399F, 2, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, -0.0471F, -4.3179F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 32, -5.5F, -4.7529F, -4.5F, 11, 9, 9, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 1.1039F, -6.8097F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 23, 64, -2.0F, -0.3365F, -8.3103F, 4, 4, 9, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, 3.55F, -7.85F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 68, 42, -2.5F, -3.9999F, 0.63F, 5, 4, 8, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, 1.5536F, -8.9185F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 11, -1.5F, -1.74F, 0.1043F, 3, 3, 2, -0.02F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(-3.78F, 2.4161F, 1.1397F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.4102F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 69, -1.89F, -2.74F, -8.82F, 4, 4, 8, 0.0F, true));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(3.78F, 2.4161F, 1.1397F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.4102F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 69, -2.11F, -2.74F, -8.82F, 4, 4, 8, 0.0F, false));

        this.legRL1 = new AdvancedModelRendererExtended(this);
        this.legRL1.setRotationPoint(7.0F, 8.5F, -1.5F);
        this.bodyfront.addChild(legRL1);
        this.setRotateAngle(legRL1, 0.9163F, 0.5236F, 0.0F);
        this.legRL1.cubeList.add(new ModelBox(legRL1, 76, 29, -4.0F, -2.0F, -2.0F, 5, 7, 5, 0.0F, false));

        this.legRL2 = new AdvancedModelRendererExtended(this);
        this.legRL2.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.legRL1.addChild(legRL2);
        this.setRotateAngle(legRL2, -1.4835F, -0.4363F, 0.5672F);
        this.legRL2.cubeList.add(new ModelBox(legRL2, 79, 0, -3.5F, -0.5F, -1.0F, 4, 6, 4, -0.01F, false));

        this.legRL3 = new AdvancedModelRendererExtended(this);
        this.legRL3.setRotationPoint(0.5F, 5.5F, 0.5F);
        this.legRL2.addChild(legRL3);
        this.setRotateAngle(legRL3, 0.4363F, 0.0F, 0.0436F);
        this.legRL3.cubeList.add(new ModelBox(legRL3, 57, 50, -3.5F, -0.5F, -3.5F, 3, 2, 5, 0.0F, false));

        this.legRL4 = new AdvancedModelRendererExtended(this);
        this.legRL4.setRotationPoint(-7.0F, 8.5F, -1.5F);
        this.bodyfront.addChild(legRL4);
        this.setRotateAngle(legRL4, 0.9163F, -0.5236F, 0.0F);
        this.legRL4.cubeList.add(new ModelBox(legRL4, 76, 29, -1.0F, -2.0F, -2.0F, 5, 7, 5, 0.0F, true));

        this.legRL5 = new AdvancedModelRendererExtended(this);
        this.legRL5.setRotationPoint(0.0F, 4.0F, -0.5F);
        this.legRL4.addChild(legRL5);
        this.setRotateAngle(legRL5, -1.4835F, 0.4363F, -0.5672F);
        this.legRL5.cubeList.add(new ModelBox(legRL5, 79, 0, -0.5F, -0.5F, -1.0F, 4, 6, 4, -0.01F, true));

        this.legRL6 = new AdvancedModelRendererExtended(this);
        this.legRL6.setRotationPoint(-0.5F, 5.5F, 0.5F);
        this.legRL5.addChild(legRL6);
        this.setRotateAngle(legRL6, 0.4363F, 0.0F, -0.0436F);
        this.legRL6.cubeList.add(new ModelBox(legRL6, 57, 50, 0.5F, -0.5F, -3.5F, 3, 2, 5, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.endothiodon.render(f5);
    }
    public void renderStaticWall(float f) {
        this.jaw.rotateAngleX = (float) Math.toRadians(20);
        this.neck1.offsetY = -0.04F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(bodyback, -0.0873F, 0.3927F, 0.0F);
        this.setRotateAngle(tail1, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(legBL1, -0.1745F, -0.3491F, -0.1745F);
        this.setRotateAngle(legBL2, 0.6981F, 0.0873F, 0.1309F);
        this.setRotateAngle(legBL3, -0.3927F, 0.0436F, 0.0436F);
        this.setRotateAngle(legBL4, -0.1745F, 0.3491F, 0.1745F);
        this.setRotateAngle(legBL5, 0.6981F, -0.0873F, -0.1309F);
        this.setRotateAngle(legBL6, -0.3927F, -0.0436F, -0.0436F);
        this.setRotateAngle(bodyfront, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(neck1, -0.3054F, -0.2182F, 0.0F);
        this.setRotateAngle(neck2, 0.0873F, -0.2618F, 0.0F);
        this.setRotateAngle(head, 0.3927F, -0.0436F, -0.2182F);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(legRL1, 0.9163F, 0.5236F, 0.0F);
        this.setRotateAngle(legRL2, -1.4835F, -0.4363F, 0.5672F);
        this.setRotateAngle(legRL3, 0.4363F, 0.0F, 0.0436F);
        this.setRotateAngle(legRL4, 0.9163F, -0.5236F, 0.0F);
        this.setRotateAngle(legRL5, -1.4835F, 0.4363F, -0.5672F);
        this.setRotateAngle(legRL6, 0.4363F, 0.0F, -0.0436F);
        this.endothiodon.rotateAngleY = (float) Math.toRadians(90);
        this.endothiodon.offsetY = -0.12F;
        this.endothiodon.offsetX = -0.08F;
        this.endothiodon.render(0.01F);
        resetToDefaultPose();
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

        EntityPrehistoricFloraEndothiodon Endothiodon = (EntityPrehistoricFloraEndothiodon) e;
        float masterSpeed = Endothiodon.getTravelSpeed();

        this.faceTarget(f3, f4, 6, neck1);
        this.faceTarget(f3, f4, 6, neck2);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRendererExtended[] Tail = {this.tail1, this.tail2, this.tail3};

        // || (Endothiodon.moveStrafing == 0 && Endothiodon.moveVertical == 0 && Endothiodon.moveForward == 0)

        if (Endothiodon.getAnimation() == Endothiodon.LAY_ANIMATION) {
            this.swing(neck1, 0.5F, 0.05F, false, 0.5F,-0.025F, f2, 0.8F);
            this.walk(neck1, 0.5F * 2, -0.01F, false, 0.5F,0.005F, f2, 0.8F);
            this.swing(neck2, 0.5F, 0.05F, false, 0.5F,-0.025F, f2, 0.8F);
            this.walk(neck2, 0.5F * 2, -0.01F, false, 0.5F,0.005F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F) * 3, 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F * 3, 0.05F, 0.06F, f2, 1F);
            return;
        }

        if (f3 == 0.0F || !Endothiodon.getIsMoving()) { //Not moving
            this.swing(neck1, 0.06F, 0.05F, false, 0.5F,-0.025F, f2, 0.8F);
            this.walk(neck1, 0.06F * 2F, -0.01F, false, 0.5F,0.005F, f2, 0.8F);
            this.swing(neck2, 0.06F, 0.05F, false, 0.5F,-0.025F, f2, 0.8F);
            this.walk(neck2, 0.06F * 2F, -0.01F, false, 0.5F,0.005F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 1.225F;
        if (Endothiodon.getIsFast()) {
            speed = speed * 1.725F;
        }

        this.legRL1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.legRL4.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.legBL1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.legBL4.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(legRL1, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(legRL4, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(legBL1, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(legBL4, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(legRL1, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(legRL4, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(legBL1, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(legBL4, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(legRL2, speed, 0.25F, true, 6, -0.25F, f2, 1F);
        this.walk(legRL5, speed, 0.25F, true, 9, -0.25F, f2, 1F);
        this.walk(legBL2, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(legBL5, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(legRL2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(legRL5, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(legBL2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(legBL5, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(legRL3, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(legRL6, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(legBL3, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(legBL6, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(endothiodon, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(endothiodon, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(bodyback, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck1, speed, 0.05F, false, 0.5F,-0.025F, f2, 0.8F);
        this.walk(neck1, speed * 2, -0.01F, false, 0.5F,0.005F, f2, 0.8F);
        this.swing(neck2, speed, 0.05F, false, 0.5F,-0.025F, f2, 0.8F);
        this.walk(neck2, speed * 2, -0.01F, false, 0.5F,0.005F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.endothiodon.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEndothiodon e = (EntityPrehistoricFloraEndothiodon) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION); //80 ticks
        animator.startKeyframe(9);
        animator.rotate(this.neck1, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(2);
        animator.rotate(this.neck1, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(9);
        animator.rotate(this.neck1, (float) Math.toRadians(17.5), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(2);
        animator.rotate(this.neck1, (float) Math.toRadians(17.5), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(9);
        animator.rotate(this.neck1, (float) Math.toRadians(17.5), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(2);
        animator.rotate(this.neck1, (float) Math.toRadians(17.5), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.head, (float) Math.toRadians(-32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
