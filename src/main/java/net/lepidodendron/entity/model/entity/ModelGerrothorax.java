package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGerrothorax;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGerrothorax extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer gillR;
    private final AdvancedModelRenderer gillL;
    private final AdvancedModelRenderer gillR2;
    private final AdvancedModelRenderer gillL2;
    private final AdvancedModelRenderer gillR3;
    private final AdvancedModelRenderer gillL3;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer forelegR;
    private final AdvancedModelRenderer forelegR2;
    private final AdvancedModelRenderer forelegR3;
    private final AdvancedModelRenderer forelegL;
    private final AdvancedModelRenderer forelegL2;
    private final AdvancedModelRenderer forelegL3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer hindlegR;
    private final AdvancedModelRenderer hindlegR2;
    private final AdvancedModelRenderer hindlegR3;
    private final AdvancedModelRenderer hindlegL;
    private final AdvancedModelRenderer hindlegL2;
    private final AdvancedModelRenderer hindlegL3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;

    private ModelAnimator animator;

    public ModelGerrothorax() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.75F, -4.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 34, -6.0F, -2.35F, -0.249F, 12, 1, 15, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 17, -6.0F, -0.9F, -0.251F, 12, 1, 15, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.5F, -2.01F, -0.25F, 13, 2, 15, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 39, 17, -6.0F, -1.0F, -3.25F, 12, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0785F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 34, -5.5F, 0.0F, 0.25F, 11, 1, 4, 0.0F, false));

        this.gillR = new AdvancedModelRenderer(this);
        this.gillR.setRotationPoint(-6.0F, -0.5F, -3.15F);
        this.neck.addChild(gillR);
        this.setRotateAngle(gillR, 0.1745F, 0.0873F, 0.1745F);
        this.gillR.cubeList.add(new ModelBox(gillR, 0, 19, -4.0F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.gillL = new AdvancedModelRenderer(this);
        this.gillL.setRotationPoint(6.0F, -0.5F, -3.15F);
        this.neck.addChild(gillL);
        this.setRotateAngle(gillL, 0.1745F, -0.0873F, -0.1745F);
        this.gillL.cubeList.add(new ModelBox(gillL, 0, 17, 0.0F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.gillR2 = new AdvancedModelRenderer(this);
        this.gillR2.setRotationPoint(-6.0F, -0.25F, -2.4F);
        this.neck.addChild(gillR2);
        this.setRotateAngle(gillR2, 0.1309F, 0.1309F, 0.1309F);
        this.gillR2.cubeList.add(new ModelBox(gillR2, 7, 10, -3.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.gillL2 = new AdvancedModelRenderer(this);
        this.gillL2.setRotationPoint(6.0F, -0.25F, -2.4F);
        this.neck.addChild(gillL2);
        this.setRotateAngle(gillL2, 0.1309F, -0.1309F, -0.1309F);
        this.gillL2.cubeList.add(new ModelBox(gillL2, 6, 2, 0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.gillR3 = new AdvancedModelRenderer(this);
        this.gillR3.setRotationPoint(-6.0F, 0.0F, -1.65F);
        this.neck.addChild(gillR3);
        this.setRotateAngle(gillR3, 0.0873F, 0.2618F, 0.0873F);
        this.gillR3.cubeList.add(new ModelBox(gillR3, 7, 6, -2.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.gillL3 = new AdvancedModelRenderer(this);
        this.gillL3.setRotationPoint(6.0F, 0.0F, -1.65F);
        this.neck.addChild(gillL3);
        this.setRotateAngle(gillL3, 0.0873F, -0.2618F, -0.0873F);
        this.gillL3.cubeList.add(new ModelBox(gillL3, 6, 0, -0.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.025F, -3.0F);
        this.neck.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 41, 5, -3.0F, -0.985F, -4.0F, 6, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 29, -2.5F, -0.985F, -5.0F, 5, 1, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 8, 14, -1.5F, -1.485F, -4.75F, 3, 1, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5F, 0.025F, -5.0F);
        this.lowerjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.8639F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 51, -6.0F, -1.0F, 0.0F, 6, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.5F, 0.275F, -5.0F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.8727F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 14, -4.5F, -1.75F, 0.35F, 4, 1, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.5F, 0.275F, -5.0F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.8727F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 23, 0.5F, -1.75F, 0.35F, 4, 1, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.5F, 0.025F, -5.0F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.8639F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 51, 0.0F, -1.0F, 0.0F, 6, 1, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.025F, -3.0F);
        this.neck.addChild(upperjaw);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.025F, -3.0F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, -0.0873F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 6, -1.5F, -0.36F, -0.5F, 1, 0, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 54, 44, -2.0F, -0.35F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -1.025F, -3.0F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0873F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 7, 0.5F, -0.36F, -0.5F, 1, 0, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 55, 0.0F, -0.35F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 31, -1.5F, -0.5468F, 0.1346F, 3, 1, 0, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 34, -2.5F, -1.075F, 0.0F, 5, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 10, -3.0F, -1.075F, 1.0F, 6, 1, 4, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.025F, -5.0F);
        this.upperjaw.addChild(bone);
        this.setRotateAngle(bone, 0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.bone.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.8639F, -0.0436F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 52, -6.0F, -1.0F, 0.0F, 6, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.5F, -0.35F, 0.0F);
        this.bone.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.8727F, -0.0436F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 31, -4.4054F, -0.2215F, 0.1832F, 4, 1, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.5F, -0.35F, 0.0F);
        this.bone.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.8727F, 0.0436F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 6, 45, 0.4054F, -0.2215F, 0.1832F, 4, 1, 0, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.bone.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.8639F, 0.0436F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 54, 29, 0.0F, -1.0F, 0.0F, 6, 1, 3, 0.0F, false));

        this.forelegR = new AdvancedModelRenderer(this);
        this.forelegR.setRotationPoint(-6.5F, -0.75F, 0.1F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.6981F, -0.1745F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 0, 42, -2.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.forelegR2 = new AdvancedModelRenderer(this);
        this.forelegR2.setRotationPoint(-2.5F, -0.25F, 2.0F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0F, -0.7854F, 0.0F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 49, 29, -2.0F, -0.24F, -1.99F, 2, 1, 2, 0.0F, false));

        this.forelegR3 = new AdvancedModelRenderer(this);
        this.forelegR3.setRotationPoint(-2.0F, 0.0F, -1.0F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, 0.0F, -0.3491F, 0.1745F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 0, 25, -2.0F, -0.23F, -1.5F, 2, 1, 3, 0.0F, false));

        this.forelegL = new AdvancedModelRenderer(this);
        this.forelegL.setRotationPoint(6.5F, -0.75F, 0.1F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.6981F, 0.1745F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 0, 39, -0.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.forelegL2 = new AdvancedModelRenderer(this);
        this.forelegL2.setRotationPoint(2.5F, -0.25F, 2.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.7854F, 0.0F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 0, 45, 0.0F, -0.24F, -1.99F, 2, 1, 2, 0.0F, false));

        this.forelegL3 = new AdvancedModelRenderer(this);
        this.forelegL3.setRotationPoint(2.0F, 0.0F, -1.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0F, 0.3491F, -0.1745F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 0, 21, 0.0F, -0.23F, -1.5F, 2, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.0F, 14.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 39, 23, -5.5F, -1.0F, -1.0F, 11, 2, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, -12.25F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0611F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 39, -5.0F, -1.025F, 11.15F, 10, 1, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.1F, 3.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 41, 0, -4.5F, -1.12F, -1.0F, 9, 2, 3, 0.0F, false));

        this.hindlegR = new AdvancedModelRenderer(this);
        this.hindlegR.setRotationPoint(-4.5F, 0.25F, 0.0F);
        this.body3.addChild(hindlegR);
        this.setRotateAngle(hindlegR, -0.1309F, 0.8727F, -0.1745F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 0, 36, -2.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.hindlegR2 = new AdvancedModelRenderer(this);
        this.hindlegR2.setRotationPoint(-2.5F, -0.25F, 0.0F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.0F, 0.4363F, 0.0F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 7, 25, -2.0F, -0.24F, 0.01F, 2, 1, 2, 0.0F, false));

        this.hindlegR3 = new AdvancedModelRenderer(this);
        this.hindlegR3.setRotationPoint(-2.0F, 0.0F, 1.0F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, -0.0436F, -0.2618F, 0.0873F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 0, 6, -3.0F, -0.23F, -1.5F, 3, 1, 3, 0.0F, false));

        this.hindlegL = new AdvancedModelRenderer(this);
        this.hindlegL.setRotationPoint(4.5F, 0.25F, 0.0F);
        this.body3.addChild(hindlegL);
        this.setRotateAngle(hindlegL, -0.1309F, -0.8727F, 0.1745F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 39, 29, -0.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRenderer(this);
        this.hindlegL2.setRotationPoint(2.5F, -0.25F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, -0.4363F, 0.0F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 6, 46, 0.0F, -0.24F, 0.01F, 2, 1, 2, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRenderer(this);
        this.hindlegL3.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.0436F, 0.2618F, -0.0873F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 0, 10, 0.0F, -0.23F, -1.5F, 3, 1, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 39, 44, -3.0F, -1.09F, -1.0F, 6, 2, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, 0.0F, -1.43F, 0.0F, 0, 1, 2, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 9, 9, 0.0F, -1.83F, 0.0F, 0, 1, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 50, 49, -2.0F, -1.08F, -1.0F, 4, 2, 4, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 9, 5, 0.0F, -2.08F, 0.0F, 0, 1, 3, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 0, -1.0F, -1.07F, -1.0F, 2, 2, 4, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 7, 18, -0.5F, -1.06F, -1.0F, 1, 2, 3, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 0, 1, 0.0F, -1.83F, 0.0F, 0, 1, 2, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 0, 9, 0.0F, -1.33F, 2.0F, 0, 1, 1, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 0, 0, -0.5F, -0.6F, 2.0F, 1, 1, 1, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 0, 7, 0.0F, -0.58F, 3.0F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 1.375F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetZ = -0.6F;
        this.body.render(0.1F);
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
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = -0.50F; //72

        EntityPrehistoricFloraGerrothorax Gerrothorax = (EntityPrehistoricFloraGerrothorax) e;


        float speed = 0.185F;
        if (Gerrothorax.getIsFast()) {
            speed = speed * 1.52F;
        }

        AdvancedModelRenderer[] Tail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7};

        boolean isAtBottom = Gerrothorax.isAtBottom();
        float bottomModifierTail = 1F;
        boolean atBottom = false;
        if (Gerrothorax.isReallyInWater() && isAtBottom && !Gerrothorax.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.12F;
            bottomModifierTail = 0.3F;
            atBottom = true;
        }

        if (!Gerrothorax.isReallyInWater()) {//on land

            if (f3 == 0.0F || !Gerrothorax.getIsMoving()) { //Not moving
                return;
            }

            this.flap(hindlegL, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(hindlegL, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(hindlegL2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(hindlegL3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(hindlegR, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(hindlegR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(hindlegR2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(hindlegR3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(forelegL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(forelegL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(forelegL2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(forelegL3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(forelegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(forelegR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(forelegR2, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(forelegR3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            //this.bob(Mastodonsaurus, speed*2, 0.3F, false, f2, 1F);

            //this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, -1.5F, f2, 1);

        }
        else {//in water
            speed = speed * 2F;

            if (!atBottom) {

                this.setRotateAngle(forelegL, 0, -(float) Math.toRadians(42.5), -(float) Math.toRadians(10));
                this.setRotateAngle(forelegR, 0, -(float) Math.toRadians(-42.5),-(float) Math.toRadians(-10));
                this.setRotateAngle(forelegL2, 0, -(float) Math.toRadians(17.5), 0);
                this.setRotateAngle(forelegR2, 0, -(float) Math.toRadians(-17.5), 0);
                this.setRotateAngle(forelegL3, 0, -(float) Math.toRadians(12.5), -0);
                this.setRotateAngle(forelegR3, 0, -(float) Math.toRadians(-12.5), 0);

                this.setRotateAngle(hindlegL, 0, -(float) Math.toRadians(32.5), -(float) Math.toRadians(17));
                this.setRotateAngle(hindlegR, (0), -(float) Math.toRadians(-32.5), -(float) Math.toRadians(-17));
                this.setRotateAngle(hindlegL2, (float) Math.toRadians(0), -(float) Math.toRadians(75), (float) Math.toRadians(0));
                this.setRotateAngle(hindlegR2, (float) Math.toRadians(0), -(float) Math.toRadians(-75), (float) Math.toRadians(0));
                this.setRotateAngle(hindlegL3, (float) Math.toRadians(0), -(float) Math.toRadians(7.5), (float) Math.toRadians(-0));
                this.setRotateAngle(hindlegR3, (float) Math.toRadians(0), -(float) Math.toRadians(-7.5), (float) Math.toRadians(0));

                AdvancedModelRenderer[] BackL = {this.hindlegL, this.hindlegL2};
                AdvancedModelRenderer[] BackR = {this.hindlegR, this.hindlegR2};
                AdvancedModelRenderer[] FrontL = {this.forelegL, this.forelegL2};
                AdvancedModelRenderer[] FrontR = {this.forelegR, this.forelegR2};

                this.chainSwingExtended(FrontL, speed * 0.85F, -0.2F, 0, 1F, f2, 1);
                this.chainSwingExtended(FrontR, speed * 0.85F, -0.2F, -2, 4F, f2, 1);
                this.chainSwingExtended(BackL, speed * 0.85F, -0.13F, -2, 1F, f2, 1);
                this.chainSwingExtended(BackR, speed * 0.85F, -0.13F, -2, 4F, f2, 1);


            }
            else if (f3 != 0 && Gerrothorax.getIsMoving()) {
                this.flap(hindlegL, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
                this.swing(hindlegL, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
                this.walk(hindlegL2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
                this.walk(hindlegL3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

                this.flap(hindlegR, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
                this.swing(hindlegR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
                this.walk(hindlegR2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
                this.walk(hindlegR3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

                this.flap(forelegL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
                this.swing(forelegL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
                this.walk(forelegL2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
                this.walk(forelegL3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

                this.flap(forelegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
                this.swing(forelegR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
                this.walk(forelegR2, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
                this.walk(forelegR3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

                this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
                //this.bob(Mastodonsaurus, speed*2, 0.3F, false, f2, 1F);

                this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 0, f2, 1);

            }

            this.chainSwing(Tail, speed * bottomModifierTail, 0.6F * bottomModifierTail, -0.4, f2, 0.5F * bottomModifierTail);
            if (!atBottom) {
                this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            }
            else {
                this.swing(neck, speed * bottomModifierTail * 0.33F, 0.1F, false, 0, -0.05F, f2, 0.5F);
                if (((EntityPrehistoricFloraGerrothorax) e).getAnimation() == ((EntityPrehistoricFloraGerrothorax) e).ROAR_ANIMATION) {
                    this.swing(body, speed * bottomModifierTail, -0.6F * bottomModifierTail, false, 0, 0, f2, 0.5F * bottomModifierTail);
                }
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, -(float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, -(float) Math.toRadians(62.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION); //120 ticks
        animator.startKeyframe(10);
        animator.rotate(this.neck, -(float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, -(float) Math.toRadians(62.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(5);
        animator.rotate(this.neck, -(float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, -(float) Math.toRadians(57.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(10);
        animator.rotate(this.neck, -(float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, -(float) Math.toRadians(62.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(5);
        animator.rotate(this.neck, -(float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, -(float) Math.toRadians(57.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(10);
        animator.rotate(this.neck, -(float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, -(float) Math.toRadians(62.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(5);
        animator.rotate(this.neck, -(float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, -(float) Math.toRadians(57.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(10);
        animator.rotate(this.neck, -(float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, -(float) Math.toRadians(62.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
