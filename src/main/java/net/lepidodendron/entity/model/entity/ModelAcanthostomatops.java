package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAcanthostomatops;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelAcanthostomatops extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended bone;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended tongue;
    private final AdvancedModelRendererExtended tongue2;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended legL4;
    private final AdvancedModelRendererExtended legL5;
    private final AdvancedModelRendererExtended legspineL2;
    private final AdvancedModelRendererExtended legL6;
    private final AdvancedModelRendererExtended legR4;
    private final AdvancedModelRendererExtended legR5;
    private final AdvancedModelRendererExtended legspineR2;
    private final AdvancedModelRendererExtended legR6;
    private final AdvancedModelRendererExtended legL;
    private final AdvancedModelRendererExtended legL2;
    private final AdvancedModelRendererExtended legspineL;
    private final AdvancedModelRendererExtended legL3;
    private final AdvancedModelRendererExtended legR;
    private final AdvancedModelRendererExtended legR2;
    private final AdvancedModelRendererExtended legspineR;
    private final AdvancedModelRendererExtended legR3;

    private ModelAnimator animator;

    public ModelAcanthostomatops() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(0.0F, 22.775F, -3.0F);


        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -1.225F, 0.5F);
        this.bone.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 16, 10, -2.0F, -1.0F, -3.5F, 4, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-2.0F, 0.25F, -2.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 26, -0.85F, -1.0F, -1.5F, 1, 1, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 22, 0.15F, -1.0F, -1.25F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(2.0F, 0.25F, -2.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5672F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 29, -1.15F, -1.0F, -1.25F, 1, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 36, -0.15F, -1.0F, -1.5F, 1, 1, 3, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.25F, -2.75F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 18, 25, -1.5F, 0.0F, -7.0F, 3, 1, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 32, 6, -2.5F, 0.0F, -2.0F, 5, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-1.5F, 1.0F, -7.0F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3927F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 16, 0.0F, -1.025F, 0.0F, 1, 1, 7, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 26, 1.0F, -1.025F, 2.0F, 1, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(1.5F, 1.0F, -7.0F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 31, -2.0F, -1.025F, 2.0F, 1, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 18, -1.0F, -1.025F, 0.0F, 1, 1, 7, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, -0.5F, -2.75F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.0436F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-4.75F, -0.25F, -3.25F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.8727F, -0.2182F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, -0.645F, 0.2952F, -0.0666F, 2, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-2.0F, -0.5F, -7.25F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.6109F, -0.2182F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 24, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 26, 1.0F, 0.0F, 1.0F, 1, 1, 6, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 9, 2.0F, 0.0F, 2.75F, 1, 1, 4, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 25, 3.0F, 0.0F, 4.25F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(2.0F, -0.5F, -7.25F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.6109F, 0.2182F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 28, -4.0F, 0.0F, 4.25F, 1, 1, 2, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 35, -3.0F, 0.0F, 2.75F, 1, 1, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 10, -2.0F, 0.0F, 1.0F, 1, 1, 6, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 17, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(4.75F, -0.25F, -3.25F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.8727F, 0.2182F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 14, -1.355F, 0.2952F, -0.0666F, 2, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(5.0F, -0.25F, -2.25F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.48F, 0.2182F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 37, -0.6313F, 0.3993F, -0.0257F, 2, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -0.75F, 0.75F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, -0.0436F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 9, -3.0F, 0.0F, -4.1F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -0.75F, 0.75F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 11, 2.0F, 0.0F, -4.1F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, -0.75F, 0.75F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0262F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.99F, -0.125F, -8.1F, 4, 1, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(-5.0F, -0.25F, -2.25F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.48F, -0.2182F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 23, -1.3687F, 0.3993F, -0.0257F, 2, 1, 1, 0.0F, false));

        this.tongue = new AdvancedModelRendererExtended(this);
        this.tongue.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.head.addChild(tongue);
        this.tongue.cubeList.add(new ModelBox(tongue, 0, 41, -0.5F, -0.5F, -2.0F, 1, 1, 11, 0.0F, false));

        this.tongue2 = new AdvancedModelRendererExtended(this);
        this.tongue2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tongue.addChild(tongue2);
        this.tongue2.cubeList.add(new ModelBox(tongue2, 34, 35, -1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -1.25F, 0.5F);
        this.bone.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 9, -1.99F, -1.0F, 0.0F, 4, 2, 7, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 16, 0, -1.5F, -0.99F, -0.5F, 3, 2, 6, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -0.25F, 5.5F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 28, 0, -1.0F, -0.73F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -0.49F, -0.72F, 0.0F, 1, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 3.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 26, -0.5F, -0.46F, 0.0F, 1, 1, 2, 0.0F, false));

        this.legL4 = new AdvancedModelRendererExtended(this);
        this.legL4.setRotationPoint(0.25F, -0.425F, 4.675F);
        this.body2.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.6109F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 33, 17, -0.25F, -0.25F, -1.0F, 4, 1, 2, 0.0F, false));

        this.legL5 = new AdvancedModelRendererExtended(this);
        this.legL5.setRotationPoint(3.25F, 0.25F, 0.0F);
        this.legL4.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, -0.6109F, 0.0F);


        this.legspineL2 = new AdvancedModelRendererExtended(this);
        this.legspineL2.setRotationPoint(-0.25F, 0.25F, 0.0F);
        this.legL5.addChild(legspineL2);
        this.setRotateAngle(legspineL2, 0.0F, 0.0F, -0.5236F);
        this.legspineL2.cubeList.add(new ModelBox(legspineL2, 16, 0, -0.1F, -0.35F, -0.95F, 1, 3, 2, 0.0F, false));

        this.legL6 = new AdvancedModelRendererExtended(this);
        this.legL6.setRotationPoint(1.0F, 2.0F, 0.5F);
        this.legspineL2.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 1.0472F, 0.5236F);
        this.legL6.cubeList.add(new ModelBox(legL6, 11, 32, -0.55F, 0.1F, -2.2F, 3, 1, 3, 0.0F, false));

        this.legR4 = new AdvancedModelRendererExtended(this);
        this.legR4.setRotationPoint(-0.25F, -0.425F, 4.675F);
        this.body2.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, -0.6109F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 27, 32, -3.75F, -0.25F, -1.0F, 4, 1, 2, 0.0F, false));

        this.legR5 = new AdvancedModelRendererExtended(this);
        this.legR5.setRotationPoint(-3.25F, 0.25F, 0.0F);
        this.legR4.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.6109F, 0.0F);


        this.legspineR2 = new AdvancedModelRendererExtended(this);
        this.legspineR2.setRotationPoint(0.25F, 0.25F, 0.0F);
        this.legR5.addChild(legspineR2);
        this.setRotateAngle(legspineR2, 0.0F, 0.0F, 0.5236F);
        this.legspineR2.cubeList.add(new ModelBox(legspineR2, 0, 9, -0.9F, -0.35F, -0.95F, 1, 3, 2, 0.0F, false));

        this.legR6 = new AdvancedModelRendererExtended(this);
        this.legR6.setRotationPoint(-1.0F, 2.0F, 0.5F);
        this.legspineR2.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, -1.0472F, -0.5236F);
        this.legR6.cubeList.add(new ModelBox(legR6, 9, 18, -2.45F, 0.1F, -2.2F, 3, 1, 3, 0.0F, false));

        this.legL = new AdvancedModelRendererExtended(this);
        this.legL.setRotationPoint(2.0F, -0.425F, 1.0F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, -0.3491F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 34, -1.25F, -0.25F, -1.0F, 4, 1, 2, 0.0F, false));

        this.legL2 = new AdvancedModelRendererExtended(this);
        this.legL2.setRotationPoint(2.25F, 0.25F, 0.0F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 1.2217F, 0.0F);


        this.legspineL = new AdvancedModelRendererExtended(this);
        this.legspineL.setRotationPoint(-0.25F, 0.25F, 0.0F);
        this.legL2.addChild(legspineL);
        this.setRotateAngle(legspineL, 0.0F, 0.0F, -0.5236F);
        this.legspineL.cubeList.add(new ModelBox(legspineL, 24, 17, -0.1F, -0.35F, -0.95F, 1, 3, 2, 0.0F, false));

        this.legL3 = new AdvancedModelRendererExtended(this);
        this.legL3.setRotationPoint(1.0F, 2.0F, 0.5F);
        this.legspineL.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.6109F, 0.5236F);
        this.legL3.cubeList.add(new ModelBox(legL3, 14, 36, -0.35F, 0.1F, -1.7F, 2, 1, 2, 0.0F, false));

        this.legR = new AdvancedModelRendererExtended(this);
        this.legR.setRotationPoint(-2.0F, -0.425F, 1.0F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.3491F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 33, 20, -2.75F, -0.25F, -1.0F, 4, 1, 2, 0.0F, false));

        this.legR2 = new AdvancedModelRendererExtended(this);
        this.legR2.setRotationPoint(-2.25F, 0.25F, 0.0F);
        this.legR.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -1.2217F, 0.0F);


        this.legspineR = new AdvancedModelRendererExtended(this);
        this.legspineR.setRotationPoint(0.25F, 0.25F, 0.0F);
        this.legR2.addChild(legspineR);
        this.setRotateAngle(legspineR, 0.0F, 0.0F, 0.5236F);
        this.legspineR.cubeList.add(new ModelBox(legspineR, 0, 18, -0.9F, -0.35F, -0.95F, 1, 3, 2, 0.0F, false));

        this.legR3 = new AdvancedModelRendererExtended(this);
        this.legR3.setRotationPoint(-1.0F, 2.0F, 0.5F);
        this.legspineR.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, -0.6109F, -0.5236F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 5, -1.65F, 0.1F, -1.7F, 2, 1, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bone.render(f5 * 0.283F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.bone.render(0.1F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
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
        this.bone.offsetY = 1.05F; //72

        EntityPrehistoricFloraAcanthostomatops Acanthostomatops = (EntityPrehistoricFloraAcanthostomatops) e;

        this.faceTarget(f3, f4, 6, head);

        float speed = 0.225F;
        if (Acanthostomatops.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.body2, this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Torso = {this.head, this.body};

        if (!Acanthostomatops.isReallyInWater()) {

            if (f3 == 0.0F || !Acanthostomatops.getIsMoving()) { //Not moving
                return;
            }

            this.flap(legL4, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(legL4, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(legspineL2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(legL6, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(legR4, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(legR4, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(legspineR2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(legR6, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(legL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(legL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(legspineL, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(legL3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(legR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(legR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(legspineR, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(legR3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
            this.bob(bone, speed*2, 0.3F, false, f2, 1F);

            this.bone.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 1.5F, f2, 1);

        }
        else {
            speed = speed * 2F;

            //Feet:
            this.legL3.rotateAngleX = (float) Math.toRadians(70);
            this.legR3.rotateAngleX = (float) Math.toRadians(70);
            this.legL6.rotateAngleX = (float) Math.toRadians(50);
            this.legR6.rotateAngleX = (float) Math.toRadians(50);

            this.legspineL.rotateAngleX= (float) Math.toRadians(40);
            this.legspineR.rotateAngleX= (float) Math.toRadians(40);
            this.legspineL2.rotateAngleX= (float) Math.toRadians(50);
            this.legspineR2.rotateAngleX= (float) Math.toRadians(50);

            AdvancedModelRenderer[] BackL = {this.legspineL2, this.legL6};
            AdvancedModelRenderer[] BackR = {this.legspineR2, this.legR6};

            this.flap(legL4, speed, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(legR4, speed, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainWaveExtended(BackL, speed, -0.3F, -1, 0F,  f2, 1);
            this.chainWaveExtended(BackR, speed, -0.3F, -1, 3F, f2, 1);

            this.flap(legL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(legL, speed, -0.4F, true, 8, 0.2F, f2, 0.5F);
            this.walk(legspineL, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(legL3, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);

            this.flap(legR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(legR, speed, -0.4F, true, 5, 0.2F, f2, 0.5F);
            this.walk(legspineR, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(legR3, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.1F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.3F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.upperjaw, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tongue, (float) Math.toRadians(-2), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.move(this.tongue, 0,-0.1F,-6.0F);
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(1);
        animator.move(this.head, 0,0,-0.3F);
        animator.rotate(this.upperjaw, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tongue, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.move(this.tongue, 0,-0.1F,-6.0F);
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(1);
        animator.rotate(this.upperjaw, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tongue, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.move(this.tongue, 0,0,-6.0F);
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.3F);
        animator.rotate(this.upperjaw, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
