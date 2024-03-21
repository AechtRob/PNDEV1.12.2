package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLongisquama;
import net.lepidodendron.entity.EntityPrehistoricFloraSilesaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLongisquama extends AdvancedModelBase {
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer scale6;
    private final AdvancedModelRenderer scale7;
    private final AdvancedModelRenderer scale8;
    private final AdvancedModelRenderer scale9;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer hindlegL1;
    private final AdvancedModelRenderer hindlegL2;
    private final AdvancedModelRenderer hindlegL3;
    private final AdvancedModelRenderer hindlegR1;
    private final AdvancedModelRenderer hindlegR2;
    private final AdvancedModelRenderer hindlegR3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer forelegL1;
    private final AdvancedModelRenderer forelegL2;
    private final AdvancedModelRenderer forelegL3;
    private final AdvancedModelRenderer forelegR1;
    private final AdvancedModelRenderer forelegR2;
    private final AdvancedModelRenderer forelegR3;
    private final AdvancedModelRenderer scale1;
    private final AdvancedModelRenderer scale2;
    private final AdvancedModelRenderer scale3;
    private final AdvancedModelRenderer scale4;
    private final AdvancedModelRenderer scale5;

    private ModelAnimator animator;

    public ModelLongisquama() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 38, 0, -2.0F, -2.0F, -1.0F, 4, 5, 7, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 53, 0, -2.0F, -1.25F, 6.0F, 4, 4, 3, 0.0F, false));

        this.scale6 = new AdvancedModelRenderer(this);
        this.scale6.setRotationPoint(0.0F, -2.0F, 0.65F);
        this.body2.addChild(scale6);
        this.setRotateAngle(scale6, -0.1745F, 0.0F, 0.0F);
        this.scale6.cubeList.add(new ModelBox(scale6, 0, 0, 0.01F, -39.5F, -0.5F, 0, 40, 6, 0.0F, false));

        this.scale7 = new AdvancedModelRenderer(this);
        this.scale7.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.body2.addChild(scale7);
        this.setRotateAngle(scale7, -0.3054F, 0.0F, 0.0F);
        this.scale7.cubeList.add(new ModelBox(scale7, 30, 0, -0.01F, -33.5F, -0.5F, 0, 34, 4, 0.0F, false));

        this.scale8 = new AdvancedModelRenderer(this);
        this.scale8.setRotationPoint(0.0F, -2.0F, 3.5F);
        this.body2.addChild(scale8);
        this.setRotateAngle(scale8, -0.5236F, 0.0F, 0.0F);
        this.scale8.cubeList.add(new ModelBox(scale8, 36, 35, 0.0F, -25.5F, -0.5F, 0, 26, 3, 0.0F, false));

        this.scale9 = new AdvancedModelRenderer(this);
        this.scale9.setRotationPoint(0.0F, -2.0F, 4.75F);
        this.body2.addChild(scale9);
        this.setRotateAngle(scale9, -0.7418F, 0.0F, 0.0F);
        this.scale9.cubeList.add(new ModelBox(scale9, 22, 36, 0.01F, -19.5F, -0.5F, 0, 20, 4, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.0F, 9.0F);
        this.body2.addChild(tail1);
        this.setRotateAngle(tail1, -0.2182F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 52, 33, -1.5F, -1.5F, -1.0F, 3, 3, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 42, 51, -1.0F, -1.0F, -1.0F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1745F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 42, 23, -0.5F, -0.5F, -1.0F, 1, 1, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 42, 42, -0.49F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.2618F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 42, 33, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.hindlegL1 = new AdvancedModelRenderer(this);
        this.hindlegL1.setRotationPoint(1.75F, 1.5F, 7.75F);
        this.body2.addChild(hindlegL1);
        this.setRotateAngle(hindlegL1, 0.0F, 0.48F, 0.3927F);
        this.hindlegL1.cubeList.add(new ModelBox(hindlegL1, 14, 0, -0.5F, -1.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRenderer(this);
        this.hindlegL2.setRotationPoint(4.5F, 0.0F, 0.0F);
        this.hindlegL1.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.8727F, -0.48F, -0.4363F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 42, 33, -0.5F, 0.0F, -0.49F, 1, 6, 1, 0.2F, false));

        this.hindlegL3 = new AdvancedModelRenderer(this);
        this.hindlegL3.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.6109F, 0.0F, 0.0F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 59, 50, -1.0F, 0.0F, -2.39F, 2, 1, 3, 0.0F, false));

        this.hindlegR1 = new AdvancedModelRenderer(this);
        this.hindlegR1.setRotationPoint(-1.75F, 1.5F, 7.75F);
        this.body2.addChild(hindlegR1);
        this.setRotateAngle(hindlegR1, 0.0F, -0.48F, -0.3927F);
        this.hindlegR1.cubeList.add(new ModelBox(hindlegR1, 0, 0, -4.5F, -1.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.hindlegR2 = new AdvancedModelRenderer(this);
        this.hindlegR2.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.hindlegR1.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.8727F, 0.48F, 0.4363F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 40, 0, -0.5F, 0.0F, -0.49F, 1, 6, 1, 0.2F, false));

        this.hindlegR3 = new AdvancedModelRenderer(this);
        this.hindlegR3.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, -0.6109F, 0.0F, 0.0F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 57, 13, -1.0F, 0.0F, -2.39F, 2, 1, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.15F, 0.0F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 42, 12, -2.5F, -2.5F, -5.0F, 5, 6, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 52, 42, -2.0F, -2.0F, -8.0F, 4, 5, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.3491F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 53, 23, -1.0F, -1.5F, -4.25F, 2, 3, 5, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 42, 54, 0.0F, 1.5F, -4.0F, 0, 2, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 42, 12, 1.25F, -1.25F, -2.1F, 0, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 42, 10, -1.25F, -1.25F, -2.1F, 0, 2, 2, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.0436F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 42, 23, -0.5F, -1.1F, -6.0F, 1, 1, 3, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 55, 57, -1.5F, -3.0F, -3.0F, 3, 3, 3, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 12, 0, -0.49F, -1.25F, -8.0F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.upperjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1833F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 59, -0.5F, 0.61F, -5.15F, 1, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.upperjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 27, -1.0F, 0.2F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -0.125F, -3.0F);
        this.upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1833F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 56, 0.0F, -0.999F, -5.0F, 1, 1, 5, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 42, 0.25F, -0.7F, -5.0F, 0, 1, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -0.125F, -3.0F);
        this.upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1833F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 43, -0.25F, -0.7F, -5.0F, 0, 1, 6, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 7, -1.0F, -1.0F, -5.0F, 1, 1, 5, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 28, 0, -1.49F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 50, -0.5F, 0.0F, -8.0F, 1, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, 1.0F, -3.0F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1833F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 55, 0.0F, -0.999F, -5.0F, 1, 1, 5, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 41, 0.25F, -1.2F, -5.0F, 0, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, 1.0F, -3.0F);
        this.lowerjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1833F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 51, -1.0F, -0.998F, -5.0F, 1, 1, 5, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 40, -0.25F, -1.2F, -5.0F, 0, 1, 6, 0.0F, false));

        this.forelegL1 = new AdvancedModelRenderer(this);
        this.forelegL1.setRotationPoint(2.0F, 2.0F, -5.0F);
        this.body.addChild(forelegL1);
        this.setRotateAngle(forelegL1, -0.4363F, -0.6109F, 0.5236F);
        this.forelegL1.cubeList.add(new ModelBox(forelegL1, 59, 54, -1.0F, -0.5F, -0.5F, 5, 1, 1, 0.3F, false));

        this.forelegL2 = new AdvancedModelRenderer(this);
        this.forelegL2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.forelegL1.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.4363F, -0.3491F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 14, 45, -0.5F, 0.0F, -0.49F, 1, 5, 1, 0.2F, false));

        this.forelegL3 = new AdvancedModelRenderer(this);
        this.forelegL3.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0873F, 0.0F, 0.0F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 39, 61, -1.0F, 0.0F, -2.39F, 2, 1, 3, 0.0F, false));

        this.forelegR1 = new AdvancedModelRenderer(this);
        this.forelegR1.setRotationPoint(-2.0F, 2.0F, -5.0F);
        this.body.addChild(forelegR1);
        this.setRotateAngle(forelegR1, -0.4363F, 0.6109F, -0.5236F);
        this.forelegR1.cubeList.add(new ModelBox(forelegR1, 0, 4, -4.0F, -0.5F, -0.5F, 5, 1, 1, 0.3F, false));

        this.forelegR2 = new AdvancedModelRenderer(this);
        this.forelegR2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.forelegR1.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0F, -0.3927F, 0.3491F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 42, 42, -0.5F, 0.0F, -0.49F, 1, 5, 1, 0.2F, false));

        this.forelegR3 = new AdvancedModelRenderer(this);
        this.forelegR3.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, 0.0873F, 0.0F, 0.0F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 14, 61, -1.0F, 0.0F, -2.39F, 2, 1, 3, 0.0F, false));

        this.scale1 = new AdvancedModelRenderer(this);
        this.scale1.setRotationPoint(0.0F, -2.0F, -6.5F);
        this.body.addChild(scale1);
        this.setRotateAngle(scale1, 0.0873F, 0.0F, 0.0F);
        this.scale1.cubeList.add(new ModelBox(scale1, 0, 62, 0.0F, -21.5F, -0.5F, 0, 22, 2, 0.0F, false));

        this.scale2 = new AdvancedModelRenderer(this);
        this.scale2.setRotationPoint(0.0F, -2.0F, -5.05F);
        this.body.addChild(scale2);
        this.setRotateAngle(scale2, 0.0436F, 0.0F, 0.0F);
        this.scale2.cubeList.add(new ModelBox(scale2, 38, 10, -0.01F, -25.5F, -0.5F, 0, 26, 2, 0.0F, false));

        this.scale3 = new AdvancedModelRenderer(this);
        this.scale3.setRotationPoint(0.0F, -2.0F, -3.6F);
        this.body.addChild(scale3);
        this.scale3.cubeList.add(new ModelBox(scale3, 30, 35, 0.01F, -32.5F, -0.5F, 0, 33, 3, 0.0F, false));

        this.scale4 = new AdvancedModelRenderer(this);
        this.scale4.setRotationPoint(0.0F, -2.0F, -2.3F);
        this.body.addChild(scale4);
        this.setRotateAngle(scale4, -0.0873F, 0.0F, 0.0F);
        this.scale4.cubeList.add(new ModelBox(scale4, 22, 0, 0.0F, -35.5F, -0.5F, 0, 36, 4, 0.0F, false));

        this.scale5 = new AdvancedModelRenderer(this);
        this.scale5.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.body.addChild(scale5);
        this.setRotateAngle(scale5, -0.1833F, 0.0F, 0.0F);
        this.scale5.cubeList.add(new ModelBox(scale5, 12, 0, -0.01F, -39.5F, -0.5F, 0, 40, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body2.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body2.offsetZ = -0.71F;
        this.body2.render(0.1F);
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
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLongisquama ee = (EntityPrehistoricFloraLongisquama) entitylivingbaseIn;

        if (ee.getIsMoving()) {
            if(ee.getIsFast()) {
                animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {

        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLongisquama entity = (EntityPrehistoricFloraLongisquama) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (12.75-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (2.16293-(0)));
            yy = 12.75 + (((tickAnim - 8) / 10) * (10.36265-(12.75)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 2.16293 + (((tickAnim - 18) / 12) * (0-(2.16293)));
            yy = 10.36265 + (((tickAnim - 18) / 12) * (0-(10.36265)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -9.5 + (((tickAnim - 8) / 10) * (1.75-(-9.5)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 1.75 + (((tickAnim - 18) / 12) * (0-(1.75)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-4.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -4.25 + (((tickAnim - 8) / 10) * (10-(-4.25)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 10 + (((tickAnim - 18) / 12) * (0-(10)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-13.50922-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-7.74881-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.13609-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -13.50922 + (((tickAnim - 8) / 6) * (-15.50945-(-13.50922)));
            yy = -7.74881 + (((tickAnim - 8) / 6) * (-3.75491-(-7.74881)));
            zz = 0.13609 + (((tickAnim - 8) / 6) * (0.0662-(0.13609)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -15.50945 + (((tickAnim - 14) / 9) * (-2.47468-(-15.50945)));
            yy = -3.75491 + (((tickAnim - 14) / 9) * (18.06665-(-3.75491)));
            zz = 0.0662 + (((tickAnim - 14) / 9) * (0.97248-(0.0662)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -2.47468 + (((tickAnim - 23) / 7) * (0-(-2.47468)));
            yy = 18.06665 + (((tickAnim - 23) / 7) * (0-(18.06665)));
            zz = 0.97248 + (((tickAnim - 23) / 7) * (0-(0.97248)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-16.26007-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-7.24827-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.15901-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -16.26007 + (((tickAnim - 8) / 6) * (-18.76572-(-16.26007)));
            yy = -7.24827 + (((tickAnim - 8) / 6) * (-4.75192-(-7.24827)));
            zz = 0.15901 + (((tickAnim - 8) / 6) * (0.10437-(0.15901)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -18.76572 + (((tickAnim - 14) / 9) * (-20.34857-(-18.76572)));
            yy = -4.75192 + (((tickAnim - 14) / 9) * (23.50128-(-4.75192)));
            zz = 0.10437 + (((tickAnim - 14) / 9) * (-0.93173-(0.10437)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -20.34857 + (((tickAnim - 23) / 7) * (0-(-20.34857)));
            yy = 23.50128 + (((tickAnim - 23) / 7) * (0-(23.50128)));
            zz = -0.93173 + (((tickAnim - 23) / 7) * (0-(-0.93173)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11.25 + (((tickAnim - 8) / 7) * (4.75-(11.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 4.75 + (((tickAnim - 15) / 8) * (-4.75-(4.75)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4.75 + (((tickAnim - 23) / 7) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-8.47-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -8.47 + (((tickAnim - 8) / 10) * (7.25-(-8.47)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 18) / 12) * (0-(7.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 5.75 + (((tickAnim - 8) / 7) * (15-(5.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 15 + (((tickAnim - 15) / 8) * (21.75-(15)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 21.75 + (((tickAnim - 23) / 7) * (0-(21.75)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.25-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 4) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 5) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 7) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 2.25 + (((tickAnim - 8) / 0) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 8) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 9) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 11) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 12) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = -1.25 + (((tickAnim - 13) / 0) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 13) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 15) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 16) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 17) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = -2.25 + (((tickAnim - 18) / 0) * (0-(-2.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 19) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 20) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 21) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 22) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (1.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 23) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 24) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 25) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 26) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            zz = 1.25 + (((tickAnim - 28) / 0) * (2.25-(1.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 2.25 + (((tickAnim - 28) / 2) * (0-(2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale6, scale6.rotateAngleX + (float) Math.toRadians(xx), scale6.rotateAngleY + (float) Math.toRadians(yy), scale6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = -1.25 + (((tickAnim - 3) / 0) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 3) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 5) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 6) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 7) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -2.25 + (((tickAnim - 8) / 0) * (0-(-2.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 9) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 10) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 11) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 12) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (1.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 13) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 14) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 15) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 16) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 1.25 + (((tickAnim - 18) / 0) * (2.25-(1.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 18) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 19) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 20) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 22) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 2.25 + (((tickAnim - 23) / 0) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 23) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 24) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 26) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 27) / 1) * (0-(2.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale7, scale7.rotateAngleX + (float) Math.toRadians(xx), scale7.rotateAngleY + (float) Math.toRadians(yy), scale7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.25-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 4) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 5) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 7) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 2.25 + (((tickAnim - 8) / 0) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 8) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 9) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 11) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 12) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = -1.25 + (((tickAnim - 13) / 0) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 13) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 15) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 16) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 17) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = -2.25 + (((tickAnim - 18) / 0) * (0-(-2.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 19) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 20) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 21) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 22) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (1.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 23) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 24) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 25) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 26) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            zz = 1.25 + (((tickAnim - 28) / 0) * (2.25-(1.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 2.25 + (((tickAnim - 28) / 2) * (0-(2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale8, scale8.rotateAngleX + (float) Math.toRadians(xx), scale8.rotateAngleY + (float) Math.toRadians(yy), scale8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = -1.25 + (((tickAnim - 3) / 0) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 3) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 5) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 6) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 7) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -2.25 + (((tickAnim - 8) / 0) * (0-(-2.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 9) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 10) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 11) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 12) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (1.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 13) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 14) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 15) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 16) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 1.25 + (((tickAnim - 18) / 0) * (2.25-(1.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 18) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 19) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 20) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 22) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 2.25 + (((tickAnim - 23) / 0) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 23) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 24) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 26) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 27) / 1) * (0-(2.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale9, scale9.rotateAngleX + (float) Math.toRadians(xx), scale9.rotateAngleY + (float) Math.toRadians(yy), scale9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = -1.25 + (((tickAnim - 3) / 0) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 3) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 5) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 6) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 7) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -2.25 + (((tickAnim - 8) / 0) * (0-(-2.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 9) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 10) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 11) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 12) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (1.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 13) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 14) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 15) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 16) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 1.25 + (((tickAnim - 18) / 0) * (2.25-(1.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 18) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 19) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 20) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 22) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 2.25 + (((tickAnim - 23) / 0) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 23) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 24) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 26) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 27) / 1) * (0-(2.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale1, scale1.rotateAngleX + (float) Math.toRadians(xx), scale1.rotateAngleY + (float) Math.toRadians(yy), scale1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.25-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 4) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 5) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 7) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 2.25 + (((tickAnim - 8) / 0) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 8) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 9) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 11) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 12) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = -1.25 + (((tickAnim - 13) / 0) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 13) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 15) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 16) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 17) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = -2.25 + (((tickAnim - 18) / 0) * (0-(-2.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 19) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 20) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 21) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 22) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (1.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 23) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 24) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 25) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 26) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            zz = 1.25 + (((tickAnim - 28) / 0) * (2.25-(1.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 2.25 + (((tickAnim - 28) / 2) * (0-(2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale2, scale2.rotateAngleX + (float) Math.toRadians(xx), scale2.rotateAngleY + (float) Math.toRadians(yy), scale2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = -1.25 + (((tickAnim - 3) / 0) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 3) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 5) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 6) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 7) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -2.25 + (((tickAnim - 8) / 0) * (0-(-2.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 9) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 10) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 11) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 12) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (1.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 13) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 14) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 15) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 16) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 1.25 + (((tickAnim - 18) / 0) * (2.25-(1.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 18) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 19) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 20) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 22) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 2.25 + (((tickAnim - 23) / 0) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 23) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 24) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 26) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 27) / 1) * (0-(2.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale3, scale3.rotateAngleX + (float) Math.toRadians(xx), scale3.rotateAngleY + (float) Math.toRadians(yy), scale3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.25-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 4) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 5) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 7) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 2.25 + (((tickAnim - 8) / 0) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 8) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 9) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 11) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 12) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = -1.25 + (((tickAnim - 13) / 0) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 13) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 15) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 16) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 17) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = -2.25 + (((tickAnim - 18) / 0) * (0-(-2.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 19) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 20) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 21) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 22) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (1.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 23) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 24) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 25) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 26) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 0) * (0-(0)));
            zz = 1.25 + (((tickAnim - 28) / 0) * (2.25-(1.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 2.25 + (((tickAnim - 28) / 2) * (0-(2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale4, scale4.rotateAngleX + (float) Math.toRadians(xx), scale4.rotateAngleY + (float) Math.toRadians(yy), scale4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = -1.25 + (((tickAnim - 3) / 0) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 3) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 5) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 6) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 7) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -2.25 + (((tickAnim - 8) / 0) * (0-(-2.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 9) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 10) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 11) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 12) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (1.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 13) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 14) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 15) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 16) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 1.25 + (((tickAnim - 18) / 0) * (2.25-(1.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 18) / 1) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 19) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 20) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 22) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 2.25 + (((tickAnim - 23) / 0) * (-1.25-(2.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = -1.25 + (((tickAnim - 23) / 1) * (-2.25-(-1.25)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = -2.25 + (((tickAnim - 24) / 1) * (0-(-2.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (1.25-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            zz = 1.25 + (((tickAnim - 26) / 1) * (2.25-(1.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 2.25 + (((tickAnim - 27) / 1) * (0-(2.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale5, scale5.rotateAngleX + (float) Math.toRadians(xx), scale5.rotateAngleY + (float) Math.toRadians(yy), scale5.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLongisquama entity = (EntityPrehistoricFloraLongisquama) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 39.75 + (((tickAnim - 10) / 3) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 39.75 + (((tickAnim - 13) / 10) * (0-(39.75)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 16 + (((tickAnim - 10) / 3) * (0-(16)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-12.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = -12.5 + (((tickAnim - 10) / 13) * (0-(-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLongisquama entity = (EntityPrehistoricFloraLongisquama) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -8.25 + (((tickAnim - 23) / 7) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.25 + (((tickAnim - 30) / 20) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (18.75-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 23) / 27) * (0-(-3.25)));
            yy = 18.75 + (((tickAnim - 23) / 27) * (0-(18.75)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (17.5-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 17.5 + (((tickAnim - 23) / 7) * (11.75-(17.5)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 11.75 + (((tickAnim - 30) / 20) * (0-(11.75)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-7.50439-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (15.04938-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.08398-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -7.50439 + (((tickAnim - 23) / 7) * (-7.87404-(-7.50439)));
            yy = 15.04938 + (((tickAnim - 23) / 7) * (10.52086-(15.04938)));
            zz = -0.08398 + (((tickAnim - 23) / 7) * (-0.52536-(-0.08398)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.87404 + (((tickAnim - 30) / 20) * (0-(-7.87404)));
            yy = 10.52086 + (((tickAnim - 30) / 20) * (0-(10.52086)));
            zz = -0.52536 + (((tickAnim - 30) / 20) * (0-(-0.52536)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-10.08527-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (18.34077-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (1.44243-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -10.08527 + (((tickAnim - 23) / 7) * (-10.65541-(-10.08527)));
            yy = 18.34077 + (((tickAnim - 23) / 7) * (11.96651-(18.34077)));
            zz = 1.44243 + (((tickAnim - 23) / 7) * (0.90246-(1.44243)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10.65541 + (((tickAnim - 30) / 20) * (0-(-10.65541)));
            yy = 11.96651 + (((tickAnim - 30) / 20) * (0-(11.96651)));
            zz = 0.90246 + (((tickAnim - 30) / 20) * (0-(0.90246)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-14-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -14 + (((tickAnim - 23) / 7) * (-14-(-14)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -14 + (((tickAnim - 30) / 20) * (0-(-14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegL1, hindlegL1.rotateAngleX + (float) Math.toRadians(xx), hindlegL1.rotateAngleY + (float) Math.toRadians(yy), hindlegL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (16.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 16.25 + (((tickAnim - 23) / 7) * (16.25-(16.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 16.25 + (((tickAnim - 30) / 20) * (0-(16.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegL2, hindlegL2.rotateAngleX + (float) Math.toRadians(xx), hindlegL2.rotateAngleY + (float) Math.toRadians(yy), hindlegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 23) / 7) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.25 + (((tickAnim - 30) / 20) * (0-(2.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegL3, hindlegL3.rotateAngleX + (float) Math.toRadians(xx), hindlegL3.rotateAngleY + (float) Math.toRadians(yy), hindlegL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (14-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 14 + (((tickAnim - 23) / 7) * (14-(14)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 14 + (((tickAnim - 30) / 20) * (0-(14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegR1, hindlegR1.rotateAngleX + (float) Math.toRadians(xx), hindlegR1.rotateAngleY + (float) Math.toRadians(yy), hindlegR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-16.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -16.25 + (((tickAnim - 23) / 7) * (-16.25-(-16.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -16.25 + (((tickAnim - 30) / 20) * (0-(-16.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegR2, hindlegR2.rotateAngleX + (float) Math.toRadians(xx), hindlegR2.rotateAngleY + (float) Math.toRadians(yy), hindlegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 23) / 7) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2.25 + (((tickAnim - 30) / 20) * (0-(2.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegR3, hindlegR3.rotateAngleX + (float) Math.toRadians(xx), hindlegR3.rotateAngleY + (float) Math.toRadians(yy), hindlegR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 11.5 + (((tickAnim - 23) / 7) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 11.5 + (((tickAnim - 30) / 20) * (0-(11.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (7.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 7.25 + (((tickAnim - 23) / 7) * (7.25-(7.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 7.25 + (((tickAnim - 30) / 20) * (0-(7.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegL1, forelegL1.rotateAngleX + (float) Math.toRadians(xx), forelegL1.rotateAngleY + (float) Math.toRadians(yy), forelegL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-11.5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -11.5 + (((tickAnim - 23) / 7) * (-11.5-(-11.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -11.5 + (((tickAnim - 30) / 20) * (0-(-11.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegL2, forelegL2.rotateAngleX + (float) Math.toRadians(xx), forelegL2.rotateAngleY + (float) Math.toRadians(yy), forelegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-7.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -7.25 + (((tickAnim - 23) / 7) * (-7.25-(-7.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -7.25 + (((tickAnim - 30) / 20) * (0-(-7.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegR1, forelegR1.rotateAngleX + (float) Math.toRadians(xx), forelegR1.rotateAngleY + (float) Math.toRadians(yy), forelegR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (11.5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 11.5 + (((tickAnim - 23) / 7) * (11.5-(11.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 11.5 + (((tickAnim - 30) / 20) * (0-(11.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegR2, forelegR2.rotateAngleX + (float) Math.toRadians(xx), forelegR2.rotateAngleY + (float) Math.toRadians(yy), forelegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4 + (((tickAnim - 23) / 7) * (-4-(-4)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale6, scale6.rotateAngleX + (float) Math.toRadians(xx), scale6.rotateAngleY + (float) Math.toRadians(yy), scale6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4 + (((tickAnim - 23) / 7) * (-4-(-4)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale7, scale7.rotateAngleX + (float) Math.toRadians(xx), scale7.rotateAngleY + (float) Math.toRadians(yy), scale7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4 + (((tickAnim - 23) / 7) * (-4-(-4)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale8, scale8.rotateAngleX + (float) Math.toRadians(xx), scale8.rotateAngleY + (float) Math.toRadians(yy), scale8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4 + (((tickAnim - 23) / 7) * (-4-(-4)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale9, scale9.rotateAngleX + (float) Math.toRadians(xx), scale9.rotateAngleY + (float) Math.toRadians(yy), scale9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4 + (((tickAnim - 23) / 7) * (-4-(-4)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale1, scale1.rotateAngleX + (float) Math.toRadians(xx), scale1.rotateAngleY + (float) Math.toRadians(yy), scale1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4 + (((tickAnim - 23) / 7) * (-4-(-4)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale2, scale2.rotateAngleX + (float) Math.toRadians(xx), scale2.rotateAngleY + (float) Math.toRadians(yy), scale2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4 + (((tickAnim - 23) / 7) * (-4-(-4)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale3, scale3.rotateAngleX + (float) Math.toRadians(xx), scale3.rotateAngleY + (float) Math.toRadians(yy), scale3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4 + (((tickAnim - 23) / 7) * (-4-(-4)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale4, scale4.rotateAngleX + (float) Math.toRadians(xx), scale4.rotateAngleY + (float) Math.toRadians(yy), scale4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4 + (((tickAnim - 23) / 7) * (-4-(-4)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale5, scale5.rotateAngleX + (float) Math.toRadians(xx), scale5.rotateAngleY + (float) Math.toRadians(yy), scale5.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLongisquama entity = (EntityPrehistoricFloraLongisquama) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -36.75 + (((tickAnim - 0) / 5) * (-41-(-36.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (-15.21114-(0)));
            yy = -41 + (((tickAnim - 5) / 10) * (-5.75684-(-41)));
            zz = 0 + (((tickAnim - 5) / 10) * (-18.73783-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -15.21114 + (((tickAnim - 15) / 6) * (0-(-15.21114)));
            yy = -5.75684 + (((tickAnim - 15) / 6) * (13-(-5.75684)));
            zz = -18.73783 + (((tickAnim - 15) / 6) * (0-(-18.73783)));
        }
        else if (tickAnim >= 21 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 21) / 17) * (0-(0)));
            yy = 13 + (((tickAnim - 21) / 17) * (-36.75-(13)));
            zz = 0 + (((tickAnim - 21) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegL1, hindlegL1.rotateAngleX + (float) Math.toRadians(xx), hindlegL1.rotateAngleY + (float) Math.toRadians(yy), hindlegL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -6.75 + (((tickAnim - 0) / 5) * (4.5-(-6.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 4.5 + (((tickAnim - 5) / 7) * (2-(4.5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 2 + (((tickAnim - 12) / 5) * (-27.5-(2)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -27.5 + (((tickAnim - 17) / 4) * (-27.58-(-27.5)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 38) {
            xx = -27.58 + (((tickAnim - 21) / 17) * (-6.75-(-27.58)));
            yy = 0 + (((tickAnim - 21) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegL2, hindlegL2.rotateAngleX + (float) Math.toRadians(xx), hindlegL2.rotateAngleY + (float) Math.toRadians(yy), hindlegL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (-0.325-(0)));
            yy = 0.425 + (((tickAnim - 21) / 5) * (0.605-(0.425)));
            zz = 0 + (((tickAnim - 21) / 5) * (-0.3-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = -0.325 + (((tickAnim - 26) / 12) * (0-(-0.325)));
            yy = 0.605 + (((tickAnim - 26) / 12) * (0-(0.605)));
            zz = -0.3 + (((tickAnim - 26) / 12) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindlegL2.rotationPointX = this.hindlegL2.rotationPointX + (float)(xx);
        this.hindlegL2.rotationPointY = this.hindlegL2.rotationPointY - (float)(yy);
        this.hindlegL2.rotationPointZ = this.hindlegL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -8 + (((tickAnim - 0) / 5) * (3.5-(-8)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 3.5 + (((tickAnim - 5) / 3) * (8.72-(3.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 8.72 + (((tickAnim - 8) / 4) * (23.40395-(8.72)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.38497-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (1.50118-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 23.40395 + (((tickAnim - 12) / 5) * (21.49039-(23.40395)));
            yy = 0.38497 + (((tickAnim - 12) / 5) * (-0.02379-(0.38497)));
            zz = 1.50118 + (((tickAnim - 12) / 5) * (1.36343-(1.50118)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 21.49039 + (((tickAnim - 17) / 4) * (33.74966-(21.49039)));
            yy = -0.02379 + (((tickAnim - 17) / 4) * (0.02618-(-0.02379)));
            zz = 1.36343 + (((tickAnim - 17) / 4) * (-1.49977-(1.36343)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 33.74966 + (((tickAnim - 21) / 5) * (22.17833-(33.74966)));
            yy = 0.02618 + (((tickAnim - 21) / 5) * (0.0187-(0.02618)));
            zz = -1.49977 + (((tickAnim - 21) / 5) * (-1.07127-(-1.49977)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = 22.17833 + (((tickAnim - 26) / 12) * (-8-(22.17833)));
            yy = 0.0187 + (((tickAnim - 26) / 12) * (0-(0.0187)));
            zz = -1.07127 + (((tickAnim - 26) / 12) * (0-(-1.07127)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegL3, hindlegL3.rotateAngleX + (float) Math.toRadians(xx), hindlegL3.rotateAngleY + (float) Math.toRadians(yy), hindlegL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (0.575-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 21) / 5) * (0.445-(0.575)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = 0.445 + (((tickAnim - 26) / 7) * (0.345-(0.445)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0.345 + (((tickAnim - 33) / 5) * (0-(0.345)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindlegL3.rotationPointX = this.hindlegL3.rotationPointX + (float)(xx);
        this.hindlegL3.rotationPointY = this.hindlegL3.rotationPointY - (float)(yy);
        this.hindlegL3.rotationPointZ = this.hindlegL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -7.25 + (((tickAnim - 0) / 18) * (36.75-(-7.25)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (-11.46091-(0)));
            yy = 36.75 + (((tickAnim - 18) / 10) * (3.41496-(36.75)));
            zz = 0 + (((tickAnim - 18) / 10) * (27.03405-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -11.46091 + (((tickAnim - 28) / 10) * (0-(-11.46091)));
            yy = 3.41496 + (((tickAnim - 28) / 10) * (-7.25-(3.41496)));
            zz = 27.03405 + (((tickAnim - 28) / 10) * (0-(27.03405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegR1, hindlegR1.rotateAngleX + (float) Math.toRadians(xx), hindlegR1.rotateAngleY + (float) Math.toRadians(yy), hindlegR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -27.5 + (((tickAnim - 0) / 18) * (12-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 12 + (((tickAnim - 18) / 10) * (2-(12)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 2 + (((tickAnim - 28) / 10) * (-27.5-(2)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegR2, hindlegR2.rotateAngleX + (float) Math.toRadians(xx), hindlegR2.rotateAngleY + (float) Math.toRadians(yy), hindlegR2.rotateAngleZ + (float) Math.toRadians(zz));

        this.hindlegR2.rotationPointX = this.hindlegR2.rotationPointX + (float)(0);
        this.hindlegR2.rotationPointY = this.hindlegR2.rotationPointY - (float)(0.425);
        this.hindlegR2.rotationPointZ = this.hindlegR2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 31.74966 + (((tickAnim - 0) / 8) * (7.64-(31.74966)));
            yy = 0.02618 + (((tickAnim - 0) / 8) * (0-(0.02618)));
            zz = -1.49977 + (((tickAnim - 0) / 8) * (0-(-1.49977)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 7.64 + (((tickAnim - 8) / 5) * (8.18-(7.64)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 8.18 + (((tickAnim - 13) / 5) * (25.25-(8.18)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 25.25 + (((tickAnim - 18) / 10) * (25.5-(25.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 25.5 + (((tickAnim - 28) / 5) * (5-(25.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 5 + (((tickAnim - 33) / 5) * (31.74966-(5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0.02618-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (-1.49977-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegR3, hindlegR3.rotateAngleX + (float) Math.toRadians(xx), hindlegR3.rotateAngleY + (float) Math.toRadians(yy), hindlegR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 3) * (0.805-(0.75)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.805 + (((tickAnim - 3) / 5) * (0.465-(0.805)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.465 + (((tickAnim - 8) / 10) * (0-(0.465)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0.185-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0.185 + (((tickAnim - 28) / 5) * (0.06-(0.185)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0.06 + (((tickAnim - 33) / 5) * (0.75-(0.06)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindlegR3.rotationPointX = this.hindlegR3.rotationPointX + (float)(xx);
        this.hindlegR3.rotationPointY = this.hindlegR3.rotationPointY - (float)(yy);
        this.hindlegR3.rotationPointZ = this.hindlegR3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 34.25 + (((tickAnim - 0) / 18) * (8.5-(34.25)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (-0.6722-(0)));
            yy = 8.5 + (((tickAnim - 18) / 10) * (27.2399-(8.5)));
            zz = 0 + (((tickAnim - 18) / 10) * (-27.2157-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -0.6722 + (((tickAnim - 28) / 10) * (0-(-0.6722)));
            yy = 27.2399 + (((tickAnim - 28) / 10) * (34.25-(27.2399)));
            zz = -27.2157 + (((tickAnim - 28) / 10) * (0-(-27.2157)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegL1, forelegL1.rotateAngleX + (float) Math.toRadians(xx), forelegL1.rotateAngleY + (float) Math.toRadians(yy), forelegL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 0) / 18) * (29-(-10)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 29 + (((tickAnim - 18) / 10) * (46.90574-(29)));
            yy = 0 + (((tickAnim - 18) / 10) * (2.6316-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (8.4208-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 46.90574 + (((tickAnim - 28) / 10) * (-10-(46.90574)));
            yy = 2.6316 + (((tickAnim - 28) / 10) * (0-(2.6316)));
            zz = 8.4208 + (((tickAnim - 28) / 10) * (0-(8.4208)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegL2, forelegL2.rotateAngleX + (float) Math.toRadians(xx), forelegL2.rotateAngleY + (float) Math.toRadians(yy), forelegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 27.75 + (((tickAnim - 0) / 8) * (7.66972-(27.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.40563-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.89803-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 7.66972 + (((tickAnim - 8) / 10) * (-25.75-(7.66972)));
            yy = 0.40563 + (((tickAnim - 8) / 10) * (0-(0.40563)));
            zz = -1.89803 + (((tickAnim - 8) / 10) * (0-(-1.89803)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -25.75 + (((tickAnim - 18) / 10) * (6.75-(-25.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 6.75 + (((tickAnim - 28) / 8) * (-17.0355-(6.75)));
            yy = 0 + (((tickAnim - 28) / 8) * (0.44571-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (-15.54146-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -17.0355 + (((tickAnim - 36) / 2) * (27.75-(-17.0355)));
            yy = 0.44571 + (((tickAnim - 36) / 2) * (0-(0.44571)));
            zz = -15.54146 + (((tickAnim - 36) / 2) * (0-(-15.54146)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegL3, forelegL3.rotateAngleX + (float) Math.toRadians(xx), forelegL3.rotateAngleY + (float) Math.toRadians(yy), forelegL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.32-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.32 + (((tickAnim - 3) / 5) * (0.5-(0.32)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 5) * (0.435-(0.5)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.435 + (((tickAnim - 13) / 5) * (0-(0.435)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.forelegL3.rotationPointX = this.forelegL3.rotationPointX + (float)(xx);
        this.forelegL3.rotationPointY = this.forelegL3.rotationPointY - (float)(yy);
        this.forelegL3.rotationPointZ = this.forelegL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.67224-(0)));
            yy = 8.5 + (((tickAnim - 0) / 9) * (-27.23988-(8.5)));
            zz = 0 + (((tickAnim - 0) / 9) * (27.21574-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0.67224 + (((tickAnim - 9) / 9) * (0-(0.67224)));
            yy = -27.23988 + (((tickAnim - 9) / 9) * (-34.25-(-27.23988)));
            zz = 27.21574 + (((tickAnim - 9) / 9) * (0-(27.21574)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            yy = -34.25 + (((tickAnim - 18) / 20) * (8.5-(-34.25)));
            zz = 0 + (((tickAnim - 18) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegR1, forelegR1.rotateAngleX + (float) Math.toRadians(xx), forelegR1.rotateAngleY + (float) Math.toRadians(yy), forelegR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 29 + (((tickAnim - 0) / 8) * (46.90574-(29)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.63165-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-8.42077-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 46.90574 + (((tickAnim - 8) / 10) * (-10-(46.90574)));
            yy = -2.63165 + (((tickAnim - 8) / 10) * (0-(-2.63165)));
            zz = -8.42077 + (((tickAnim - 8) / 10) * (0-(-8.42077)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = -10 + (((tickAnim - 18) / 20) * (29-(-10)));
            yy = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegR2, forelegR2.rotateAngleX + (float) Math.toRadians(xx), forelegR2.rotateAngleY + (float) Math.toRadians(yy), forelegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -17 + (((tickAnim - 0) / 8) * (6.75-(-17)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 6.75 + (((tickAnim - 8) / 8) * (-17.0355-(6.75)));
            yy = 0 + (((tickAnim - 8) / 8) * (0.44571-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (-15.54146-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -17.0355 + (((tickAnim - 16) / 2) * (27.75-(-17.0355)));
            yy = 0.44571 + (((tickAnim - 16) / 2) * (0-(0.44571)));
            zz = -15.54146 + (((tickAnim - 16) / 2) * (0-(-15.54146)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 27.75 + (((tickAnim - 18) / 9) * (1.10813-(27.75)));
            yy = 0 + (((tickAnim - 18) / 9) * (-5.40502-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (2.98457-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 1.10813 + (((tickAnim - 27) / 5) * (-10.1525-(1.10813)));
            yy = -5.40502 + (((tickAnim - 27) / 5) * (-3.08858-(-5.40502)));
            zz = 2.98457 + (((tickAnim - 27) / 5) * (1.70547-(2.98457)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -10.1525 + (((tickAnim - 32) / 6) * (-17-(-10.1525)));
            yy = -3.08858 + (((tickAnim - 32) / 6) * (0-(-3.08858)));
            zz = 1.70547 + (((tickAnim - 32) / 6) * (0-(1.70547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegR3, forelegR3.rotateAngleX + (float) Math.toRadians(xx), forelegR3.rotateAngleY + (float) Math.toRadians(yy), forelegR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.305-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.305 + (((tickAnim - 23) / 4) * (0.35-(0.305)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 27) / 5) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 32) / 3) * (0.23-(0.35)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            yy = 0.23 + (((tickAnim - 35) / 2) * (0.185-(0.23)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = 0.185 + (((tickAnim - 37) / 1) * (0-(0.185)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.forelegR3.rotationPointX = this.forelegR3.rotationPointX + (float)(xx);
        this.forelegR3.rotationPointY = this.forelegR3.rotationPointY - (float)(yy);
        this.forelegR3.rotationPointZ = this.forelegR3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75+150))*2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75+250))*3));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75-150))*1), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75-150))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75+150))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75+150))*5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75+15))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-11.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75+20))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75+20))*5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-11.5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75+20))*10), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75-150))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75-250))*3.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75-20))*10), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*140/0.75+120))*10), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale6, scale6.rotateAngleX + (float) Math.toRadians(xx), scale6.rotateAngleY + (float) Math.toRadians(yy), scale6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(scale7, scale7.rotateAngleX + (float) Math.toRadians(0), scale7.rotateAngleY + (float) Math.toRadians(0), scale7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(scale8, scale8.rotateAngleX + (float) Math.toRadians(0), scale8.rotateAngleY + (float) Math.toRadians(0), scale8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(scale9, scale9.rotateAngleX + (float) Math.toRadians(0), scale9.rotateAngleY + (float) Math.toRadians(0), scale9.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale1, scale1.rotateAngleX + (float) Math.toRadians(xx), scale1.rotateAngleY + (float) Math.toRadians(yy), scale1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale2, scale2.rotateAngleX + (float) Math.toRadians(xx), scale2.rotateAngleY + (float) Math.toRadians(yy), scale2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale3, scale3.rotateAngleX + (float) Math.toRadians(xx), scale3.rotateAngleY + (float) Math.toRadians(yy), scale3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale4, scale4.rotateAngleX + (float) Math.toRadians(xx), scale4.rotateAngleY + (float) Math.toRadians(yy), scale4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(scale5, scale5.rotateAngleX + (float) Math.toRadians(xx), scale5.rotateAngleY + (float) Math.toRadians(yy), scale5.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLongisquama entity = (EntityPrehistoricFloraLongisquama) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-15.58032-(0)));
            yy = -36.75 + (((tickAnim - 0) / 3) * (-13.6756-(-36.75)));
            zz = 0 + (((tickAnim - 0) / 3) * (-20.25414-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -15.58032 + (((tickAnim - 3) / 1) * (-15.21114-(-15.58032)));
            yy = -13.6756 + (((tickAnim - 3) / 1) * (-5.75684-(-13.6756)));
            zz = -20.25414 + (((tickAnim - 3) / 1) * (-18.73783-(-20.25414)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -15.21114 + (((tickAnim - 4) / 1) * (0-(-15.21114)));
            yy = -5.75684 + (((tickAnim - 4) / 1) * (13-(-5.75684)));
            zz = -18.73783 + (((tickAnim - 4) / 1) * (0-(-18.73783)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 13 + (((tickAnim - 5) / 5) * (-36.75-(13)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegL1, hindlegL1.rotateAngleX + (float) Math.toRadians(xx), hindlegL1.rotateAngleY + (float) Math.toRadians(yy), hindlegL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6.75 + (((tickAnim - 0) / 3) * (2-(-6.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2 + (((tickAnim - 3) / 1) * (-27.5-(2)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -27.5 + (((tickAnim - 4) / 1) * (-27.58-(-27.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -27.58 + (((tickAnim - 5) / 5) * (-6.75-(-27.58)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegL2, hindlegL2.rotateAngleX + (float) Math.toRadians(xx), hindlegL2.rotateAngleY + (float) Math.toRadians(yy), hindlegL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-0.325-(0)));
            yy = 0.425 + (((tickAnim - 5) / 1) * (0.605-(0.425)));
            zz = 0 + (((tickAnim - 5) / 1) * (-0.3-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.325 + (((tickAnim - 6) / 4) * (0-(-0.325)));
            yy = 0.605 + (((tickAnim - 6) / 4) * (0-(0.605)));
            zz = -0.3 + (((tickAnim - 6) / 4) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindlegL2.rotationPointX = this.hindlegL2.rotationPointX + (float)(xx);
        this.hindlegL2.rotationPointY = this.hindlegL2.rotationPointY - (float)(yy);
        this.hindlegL2.rotationPointZ = this.hindlegL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.2367 + (((tickAnim - 0) / 3) * (25.5-(-7.2367)));
            yy = 1.17654 + (((tickAnim - 0) / 3) * (0-(1.17654)));
            zz = 1.29556 + (((tickAnim - 0) / 3) * (0-(1.29556)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 25.5 + (((tickAnim - 3) / 1) * (21.49039-(25.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.02379-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (1.36343-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 21.49039 + (((tickAnim - 4) / 2) * (28.17833-(21.49039)));
            yy = -0.02379 + (((tickAnim - 4) / 2) * (0.0187-(-0.02379)));
            zz = 1.36343 + (((tickAnim - 4) / 2) * (-1.07127-(1.36343)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 28.17833 + (((tickAnim - 6) / 4) * (-7.2367-(28.17833)));
            yy = 0.0187 + (((tickAnim - 6) / 4) * (1.17654-(0.0187)));
            zz = -1.07127 + (((tickAnim - 6) / 4) * (1.29556-(-1.07127)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegL3, hindlegL3.rotateAngleX + (float) Math.toRadians(xx), hindlegL3.rotateAngleY + (float) Math.toRadians(yy), hindlegL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0.425-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 5) / 1) * (0.295-(0.425)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.295 + (((tickAnim - 6) / 2) * (0.845-(0.295)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.845 + (((tickAnim - 8) / 2) * (0.05-(0.845)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindlegL3.rotationPointX = this.hindlegL3.rotationPointX + (float)(xx);
        this.hindlegL3.rotationPointY = this.hindlegL3.rotationPointY - (float)(yy);
        this.hindlegL3.rotationPointZ = this.hindlegL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -7.25 + (((tickAnim - 0) / 5) * (36.75-(-7.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-11.46091-(0)));
            yy = 36.75 + (((tickAnim - 5) / 2) * (3.41496-(36.75)));
            zz = 0 + (((tickAnim - 5) / 2) * (27.03405-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -11.46091 + (((tickAnim - 7) / 3) * (0-(-11.46091)));
            yy = 3.41496 + (((tickAnim - 7) / 3) * (-7.25-(3.41496)));
            zz = 27.03405 + (((tickAnim - 7) / 3) * (0-(27.03405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegR1, hindlegR1.rotateAngleX + (float) Math.toRadians(xx), hindlegR1.rotateAngleY + (float) Math.toRadians(yy), hindlegR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -27.5 + (((tickAnim - 0) / 5) * (12-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 12 + (((tickAnim - 5) / 2) * (2-(12)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 2 + (((tickAnim - 7) / 3) * (-27.5-(2)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegR2, hindlegR2.rotateAngleX + (float) Math.toRadians(xx), hindlegR2.rotateAngleY + (float) Math.toRadians(yy), hindlegR2.rotateAngleZ + (float) Math.toRadians(zz));

        this.hindlegR2.rotationPointX = this.hindlegR2.rotationPointX + (float)(0);
        this.hindlegR2.rotationPointY = this.hindlegR2.rotationPointY - (float)(0.425);
        this.hindlegR2.rotationPointZ = this.hindlegR2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 31.75145 + (((tickAnim - 0) / 2) * (13.23237-(31.75145)));
            yy = 0.11121 + (((tickAnim - 0) / 2) * (1.49639-(0.11121)));
            zz = -0.00218 + (((tickAnim - 0) / 2) * (3.74754-(-0.00218)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 13.23237 + (((tickAnim - 2) / 1) * (3.4272-(13.23237)));
            yy = 1.49639 + (((tickAnim - 2) / 1) * (1.23298-(1.49639)));
            zz = 3.74754 + (((tickAnim - 2) / 1) * (2.74696-(3.74754)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 3.4272 + (((tickAnim - 3) / 0) * (8.18-(3.4272)));
            yy = 1.23298 + (((tickAnim - 3) / 0) * (0-(1.23298)));
            zz = 2.74696 + (((tickAnim - 3) / 0) * (0-(2.74696)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 8.18 + (((tickAnim - 3) / 2) * (25.25-(8.18)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 25.25 + (((tickAnim - 5) / 2) * (25.5-(25.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 25.5 + (((tickAnim - 7) / 1) * (5-(25.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 8) / 2) * (31.75145-(5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.11121-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.00218-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindlegR3, hindlegR3.rotateAngleX + (float) Math.toRadians(xx), hindlegR3.rotateAngleY + (float) Math.toRadians(yy), hindlegR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 0) / 2) * (0.605-(0.475)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.075-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.605 + (((tickAnim - 2) / 1) * (0.315-(0.605)));
            zz = 0.075 + (((tickAnim - 2) / 1) * (0.05-(0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.315 + (((tickAnim - 3) / 2) * (0-(0.315)));
            zz = 0.05 + (((tickAnim - 3) / 2) * (0-(0.05)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.185-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.185 + (((tickAnim - 7) / 1) * (0.06-(0.185)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.06 + (((tickAnim - 8) / 2) * (0.475-(0.06)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hindlegR3.rotationPointX = this.hindlegR3.rotationPointX + (float)(xx);
        this.hindlegR3.rotationPointY = this.hindlegR3.rotationPointY - (float)(yy);
        this.hindlegR3.rotationPointZ = this.hindlegR3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.08079 + (((tickAnim - 0) / 5) * (0-(0.08079)));
            yy = 37.20688 + (((tickAnim - 0) / 5) * (8.5-(37.20688)));
            zz = 6.34605 + (((tickAnim - 0) / 5) * (0-(6.34605)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-0.51315-(0)));
            yy = 8.5 + (((tickAnim - 5) / 3) * (26.69992-(8.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (-28.35422-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.51315 + (((tickAnim - 8) / 2) * (0.08079-(-0.51315)));
            yy = 26.69992 + (((tickAnim - 8) / 2) * (37.20688-(26.69992)));
            zz = -28.35422 + (((tickAnim - 8) / 2) * (6.34605-(-28.35422)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegL1, forelegL1.rotateAngleX + (float) Math.toRadians(xx), forelegL1.rotateAngleY + (float) Math.toRadians(yy), forelegL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -12.99405 + (((tickAnim - 0) / 4) * (29-(-12.99405)));
            yy = -1.34735 + (((tickAnim - 0) / 4) * (0-(-1.34735)));
            zz = -7.25972 + (((tickAnim - 0) / 4) * (0-(-7.25972)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 29 + (((tickAnim - 4) / 3) * (46.90574-(29)));
            yy = 0 + (((tickAnim - 4) / 3) * (2.6316-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (8.4208-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 46.90574 + (((tickAnim - 7) / 3) * (-12.99405-(46.90574)));
            yy = 2.6316 + (((tickAnim - 7) / 3) * (-1.34735-(2.6316)));
            zz = 8.4208 + (((tickAnim - 7) / 3) * (-7.25972-(8.4208)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegL2, forelegL2.rotateAngleX + (float) Math.toRadians(xx), forelegL2.rotateAngleY + (float) Math.toRadians(yy), forelegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 27.75 + (((tickAnim - 0) / 2) * (2.86315-(27.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.27042-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.26535-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 2.86315 + (((tickAnim - 2) / 3) * (-29.86831-(2.86315)));
            yy = 0.27042 + (((tickAnim - 2) / 3) * (-2.38663-(0.27042)));
            zz = -1.26535 + (((tickAnim - 2) / 3) * (-6.31582-(-1.26535)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -29.86831 + (((tickAnim - 5) / 2) * (6.75-(-29.86831)));
            yy = -2.38663 + (((tickAnim - 5) / 2) * (0-(-2.38663)));
            zz = -6.31582 + (((tickAnim - 5) / 2) * (0-(-6.31582)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 6.75 + (((tickAnim - 7) / 1) * (-17.0355-(6.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.44571-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-15.54146-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.0355 + (((tickAnim - 8) / 2) * (27.75-(-17.0355)));
            yy = 0.44571 + (((tickAnim - 8) / 2) * (0-(0.44571)));
            zz = -15.54146 + (((tickAnim - 8) / 2) * (0-(-15.54146)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegL3, forelegL3.rotateAngleX + (float) Math.toRadians(xx), forelegL3.rotateAngleY + (float) Math.toRadians(yy), forelegL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.52-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.52 + (((tickAnim - 2) / 1) * (0.575-(0.52)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.575 + (((tickAnim - 3) / 0) * (0.585-(0.575)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.585 + (((tickAnim - 3) / 2) * (0.05-(0.585)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.05 + (((tickAnim - 5) / 5) * (0-(0.05)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.forelegL3.rotationPointX = this.forelegL3.rotationPointX + (float)(xx);
        this.forelegL3.rotationPointY = this.forelegL3.rotationPointY - (float)(yy);
        this.forelegL3.rotationPointZ = this.forelegL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.62288-(0)));
            yy = 8.5 + (((tickAnim - 0) / 3) * (-24.60894-(8.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (33.23548-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.62288 + (((tickAnim - 3) / 2) * (0.02987-(1.62288)));
            yy = -24.60894 + (((tickAnim - 3) / 2) * (-36.46878-(-24.60894)));
            zz = 33.23548 + (((tickAnim - 3) / 2) * (-4.75849-(33.23548)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.02987 + (((tickAnim - 5) / 5) * (0-(0.02987)));
            yy = -36.46878 + (((tickAnim - 5) / 5) * (8.5-(-36.46878)));
            zz = -4.75849 + (((tickAnim - 5) / 5) * (0-(-4.75849)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegR1, forelegR1.rotateAngleX + (float) Math.toRadians(xx), forelegR1.rotateAngleY + (float) Math.toRadians(yy), forelegR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29 + (((tickAnim - 0) / 3) * (46.90574-(29)));
            yy = 0 + (((tickAnim - 0) / 3) * (-2.63165-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-8.42077-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 46.90574 + (((tickAnim - 3) / 2) * (-12.84372-(46.90574)));
            yy = -2.63165 + (((tickAnim - 3) / 2) * (1.43801-(-2.63165)));
            zz = -8.42077 + (((tickAnim - 3) / 2) * (7.65334-(-8.42077)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.84372 + (((tickAnim - 5) / 5) * (29-(-12.84372)));
            yy = 1.43801 + (((tickAnim - 5) / 5) * (0-(1.43801)));
            zz = 7.65334 + (((tickAnim - 5) / 5) * (0-(7.65334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegR2, forelegR2.rotateAngleX + (float) Math.toRadians(xx), forelegR2.rotateAngleY + (float) Math.toRadians(yy), forelegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -21.25 + (((tickAnim - 0) / 3) * (-2-(-21.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -2 + (((tickAnim - 3) / 1) * (-17.0355-(-2)));
            yy = 0 + (((tickAnim - 3) / 1) * (0.44571-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-15.54146-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -17.0355 + (((tickAnim - 4) / 1) * (27.75-(-17.0355)));
            yy = 0.44571 + (((tickAnim - 4) / 1) * (0-(0.44571)));
            zz = -15.54146 + (((tickAnim - 4) / 1) * (0-(-15.54146)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 27.75 + (((tickAnim - 5) / 2) * (7.90381-(27.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (-5.05077-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.25957-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 7.90381 + (((tickAnim - 7) / 1) * (-2.91233-(7.90381)));
            yy = -5.05077 + (((tickAnim - 7) / 1) * (-2.29884-(-5.05077)));
            zz = -0.25957 + (((tickAnim - 7) / 1) * (1.26939-(-0.25957)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.91233 + (((tickAnim - 8) / 2) * (-21.25-(-2.91233)));
            yy = -2.29884 + (((tickAnim - 8) / 2) * (0-(-2.29884)));
            zz = 1.26939 + (((tickAnim - 8) / 2) * (0-(1.26939)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forelegR3, forelegR3.rotateAngleX + (float) Math.toRadians(xx), forelegR3.rotateAngleY + (float) Math.toRadians(yy), forelegR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.525-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.525 + (((tickAnim - 7) / 1) * (0.35-(0.525)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 8) / 2) * (0-(0.35)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.forelegR3.rotationPointX = this.forelegR3.rotationPointX + (float)(xx);
        this.forelegR3.rotationPointY = this.forelegR3.rotationPointY - (float)(yy);
        this.forelegR3.rotationPointZ = this.forelegR3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75+150))*2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75-180))*3));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75-150))*1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75+180))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75-175))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75+150))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75+175))*10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75+45))*4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-11.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75+50))*15), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75+35))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-11.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75+175))*5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75+65))*20), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75+35))*4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75+150))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75-50))*2.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(12), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75-20))*10), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-11.5), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*520/0.75+120))*10), head.rotateAngleZ + (float) Math.toRadians(0));


    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.casineria.offsetY = 1.20F;

        EntityPrehistoricFloraLongisquama entityLongisquama = (EntityPrehistoricFloraLongisquama) e;

        float speed = 0.1f;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);
        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        if(entityLongisquama.getIsMoving()) {

        } else {
            this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.05F, 0.12F, f2, 1F);
            this.chainWave(Tail, (speed * 0.35F), 0.125F * 0.1F, 0.2F, f2, 1F);
        }


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLongisquama e = (EntityPrehistoricFloraLongisquama) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);
    }
}
