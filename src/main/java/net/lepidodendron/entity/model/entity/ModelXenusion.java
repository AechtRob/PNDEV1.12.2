package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraXenusion;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelXenusion extends AdvancedModelBase {
    private final AdvancedModelRenderer bodyl5;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bodys5;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legRs5;
    private final AdvancedModelRenderer legLs5;
    private final AdvancedModelRenderer bodys6;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legRs6;
    private final AdvancedModelRenderer legLs6;
    private final AdvancedModelRenderer bodys7;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legRs7;
    private final AdvancedModelRenderer legLs7;
    private final AdvancedModelRenderer bodys8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer bodym;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer bodym2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer bodym3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer bodym4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer bodym5;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer legRm6;
    private final AdvancedModelRenderer legRm7;
    private final AdvancedModelRenderer bodym6;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer legRm8;
    private final AdvancedModelRenderer legLm8;
    private final AdvancedModelRenderer legLm6;
    private final AdvancedModelRenderer legLm7;
    private final AdvancedModelRenderer legRm4;
    private final AdvancedModelRenderer legRm5;
    private final AdvancedModelRenderer legLm4;
    private final AdvancedModelRenderer legLm5;
    private final AdvancedModelRenderer legRm3;
    private final AdvancedModelRenderer legLm3;
    private final AdvancedModelRenderer legRm2;
    private final AdvancedModelRenderer legLm2;
    private final AdvancedModelRenderer legRm;
    private final AdvancedModelRenderer legLm;
    private final AdvancedModelRenderer legRs8;
    private final AdvancedModelRenderer legLs8;
    private final AdvancedModelRenderer legRl5;
    private final AdvancedModelRenderer legLl5;
    private final AdvancedModelRenderer bodyl4;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer legRl4;
    private final AdvancedModelRenderer legLl4;
    private final AdvancedModelRenderer bodyl3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer legRl3;
    private final AdvancedModelRenderer legLl3;
    private final AdvancedModelRenderer bodyl2;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer legLl2;
    private final AdvancedModelRenderer legRl2;
    private final AdvancedModelRenderer bodyl;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer legRl;
    private final AdvancedModelRenderer legLl;
    private final AdvancedModelRenderer bodys4;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer legRs4;
    private final AdvancedModelRenderer legLs4;
    private final AdvancedModelRenderer bodys3;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer legRs3;
    private final AdvancedModelRenderer legLs3;
    private final AdvancedModelRenderer bodys2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer legRs2;
    private final AdvancedModelRenderer legLs2;
    private final AdvancedModelRenderer bodys;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer legRs;
    private final AdvancedModelRenderer legLs;
    private final AdvancedModelRenderer head;

    private ModelAnimator animator;

    public ModelXenusion() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.bodyl5 = new AdvancedModelRenderer(this);
        this.bodyl5.setRotationPoint(0.0F, 20.25F, 8.5F);
        this.bodyl5.cubeList.add(new ModelBox(bodyl5, 8, 8, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));
        this.bodyl5.cubeList.add(new ModelBox(bodyl5, 0, 10, -1.0F, -1.5F, -0.01F, 2, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -1.0F, 1.5F);
        this.bodyl5.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.3491F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 19, -0.35F, -3.25F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 8, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -1.0F, 1.5F);
        this.bodyl5.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.3491F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 6, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 18, -0.65F, -3.25F, -0.5F, 1, 3, 0, 0.0F, false));

        this.bodys5 = new AdvancedModelRenderer(this);
        this.bodys5.setRotationPoint(0.0F, -0.25F, 2.0F);
        this.bodyl5.addChild(bodys5);
        this.bodys5.cubeList.add(new ModelBox(bodys5, 8, 0, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -0.5F, 1.5F);
        this.bodys5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.3491F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 17, -0.35F, -3.25F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 4, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -0.5F, 1.5F);
        this.bodys5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 16, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 18, -0.65F, -3.25F, -0.5F, 1, 3, 0, 0.0F, false));

        this.legRs5 = new AdvancedModelRenderer(this);
        this.legRs5.setRotationPoint(-0.5F, 0.25F, 1.0F);
        this.bodys5.addChild(legRs5);
        this.setRotateAngle(legRs5, 0.0F, 0.0F, 0.3491F);
        this.legRs5.cubeList.add(new ModelBox(legRs5, 11, 12, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRs5.cubeList.add(new ModelBox(legRs5, 13, 17, -1.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs5.cubeList.add(new ModelBox(legRs5, 17, 12, -1.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs5.cubeList.add(new ModelBox(legRs5, 17, 11, -1.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs5.cubeList.add(new ModelBox(legRs5, 11, 17, -1.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));

        this.legLs5 = new AdvancedModelRenderer(this);
        this.legLs5.setRotationPoint(0.5F, 0.25F, 1.0F);
        this.bodys5.addChild(legLs5);
        this.setRotateAngle(legLs5, 0.0F, 0.0F, -0.3491F);
        this.legLs5.cubeList.add(new ModelBox(legLs5, 7, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLs5.cubeList.add(new ModelBox(legLs5, 17, 3, 0.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs5.cubeList.add(new ModelBox(legLs5, 17, 2, 0.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs5.cubeList.add(new ModelBox(legLs5, 3, 15, 0.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs5.cubeList.add(new ModelBox(legLs5, 14, 4, 0.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs5.cubeList.add(new ModelBox(legLs5, 3, 14, 0.0F, 1.2F, 0.25F, 1, 0, 1, 0.0F, false));

        this.bodys6 = new AdvancedModelRenderer(this);
        this.bodys6.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.bodys5.addChild(bodys6);
        this.bodys6.cubeList.add(new ModelBox(bodys6, 8, 0, -1.49F, -1.01F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -0.5F, 1.5F);
        this.bodys6.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.3491F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 17, -0.35F, -3.0F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 4, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -0.5F, 1.5F);
        this.bodys6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3491F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 16, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 18, -0.65F, -3.0F, -0.5F, 1, 3, 0, 0.0F, false));

        this.legRs6 = new AdvancedModelRenderer(this);
        this.legRs6.setRotationPoint(-0.5F, 0.15F, 1.0F);
        this.bodys6.addChild(legRs6);
        this.setRotateAngle(legRs6, 0.0F, 0.0F, 0.3491F);
        this.legRs6.cubeList.add(new ModelBox(legRs6, 11, 12, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRs6.cubeList.add(new ModelBox(legRs6, 13, 17, -1.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs6.cubeList.add(new ModelBox(legRs6, 17, 12, -1.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs6.cubeList.add(new ModelBox(legRs6, 17, 11, -1.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs6.cubeList.add(new ModelBox(legRs6, 11, 17, -1.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs6.cubeList.add(new ModelBox(legRs6, 17, 10, -1.0F, 1.2F, 0.25F, 1, 0, 1, 0.0F, false));

        this.legLs6 = new AdvancedModelRenderer(this);
        this.legLs6.setRotationPoint(0.5F, 0.15F, 1.0F);
        this.bodys6.addChild(legLs6);
        this.setRotateAngle(legLs6, 0.0F, 0.0F, -0.3491F);
        this.legLs6.cubeList.add(new ModelBox(legLs6, 7, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLs6.cubeList.add(new ModelBox(legLs6, 17, 3, 0.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs6.cubeList.add(new ModelBox(legLs6, 17, 2, 0.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs6.cubeList.add(new ModelBox(legLs6, 3, 15, 0.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs6.cubeList.add(new ModelBox(legLs6, 14, 4, 0.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs6.cubeList.add(new ModelBox(legLs6, 3, 14, 0.0F, 1.2F, 0.25F, 1, 0, 1, 0.0F, false));

        this.bodys7 = new AdvancedModelRenderer(this);
        this.bodys7.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.bodys6.addChild(bodys7);
        this.bodys7.cubeList.add(new ModelBox(bodys7, 8, 0, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -0.5F, 1.5F);
        this.bodys7.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3491F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 17, -0.35F, -2.9F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 4, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -0.5F, 1.5F);
        this.bodys7.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.3491F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 4, 16, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -0.65F, -2.9F, -0.5F, 1, 3, 0, 0.0F, false));

        this.legRs7 = new AdvancedModelRenderer(this);
        this.legRs7.setRotationPoint(-0.5F, 0.05F, 1.0F);
        this.bodys7.addChild(legRs7);
        this.setRotateAngle(legRs7, 0.0F, 0.0F, 0.3491F);
        this.legRs7.cubeList.add(new ModelBox(legRs7, 11, 12, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRs7.cubeList.add(new ModelBox(legRs7, 13, 17, -1.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs7.cubeList.add(new ModelBox(legRs7, 17, 12, -1.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs7.cubeList.add(new ModelBox(legRs7, 17, 11, -1.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs7.cubeList.add(new ModelBox(legRs7, 11, 17, -1.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs7.cubeList.add(new ModelBox(legRs7, 17, 10, -1.0F, 1.2F, 0.25F, 1, 0, 1, 0.0F, false));

        this.legLs7 = new AdvancedModelRenderer(this);
        this.legLs7.setRotationPoint(0.5F, 0.05F, 1.0F);
        this.bodys7.addChild(legLs7);
        this.setRotateAngle(legLs7, 0.0F, 0.0F, -0.3491F);
        this.legLs7.cubeList.add(new ModelBox(legLs7, 7, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLs7.cubeList.add(new ModelBox(legLs7, 17, 3, 0.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs7.cubeList.add(new ModelBox(legLs7, 17, 2, 0.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs7.cubeList.add(new ModelBox(legLs7, 3, 15, 0.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs7.cubeList.add(new ModelBox(legLs7, 14, 4, 0.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs7.cubeList.add(new ModelBox(legLs7, 3, 14, 0.0F, 1.2F, 0.25F, 1, 0, 1, 0.0F, false));

        this.bodys8 = new AdvancedModelRenderer(this);
        this.bodys8.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.bodys7.addChild(bodys8);
        this.bodys8.cubeList.add(new ModelBox(bodys8, 8, 0, -1.49F, -1.01F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -0.5F, 1.5F);
        this.bodys8.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.3491F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 17, -0.35F, -2.75F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 4, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -0.5F, 1.5F);
        this.bodys8.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 4, 16, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 18, -0.65F, -2.75F, -0.5F, 1, 3, 0, 0.0F, false));

        this.bodym = new AdvancedModelRenderer(this);
        this.bodym.setRotationPoint(0.0F, 0.05F, 2.0F);
        this.bodys8.addChild(bodym);
        this.bodym.cubeList.add(new ModelBox(bodym, 0, 6, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -0.5F, 1.5F);
        this.bodym.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3491F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 17, -0.35F, -2.5F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 0, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -0.5F, 1.5F);
        this.bodym.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3491F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 6, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 17, -0.65F, -2.5F, -0.5F, 1, 3, 0, 0.0F, false));

        this.bodym2 = new AdvancedModelRenderer(this);
        this.bodym2.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.bodym.addChild(bodym2);
        this.bodym2.cubeList.add(new ModelBox(bodym2, 0, 6, -0.99F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -0.5F, 1.5F);
        this.bodym2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.3491F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 17, -0.35F, -2.4F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 0, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.5F, 1.5F);
        this.bodym2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.3491F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 6, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 17, -0.65F, -2.4F, -0.5F, 1, 3, 0, 0.0F, false));

        this.bodym3 = new AdvancedModelRenderer(this);
        this.bodym3.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.bodym2.addChild(bodym3);
        this.bodym3.cubeList.add(new ModelBox(bodym3, 0, 6, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -0.5F, 1.25F);
        this.bodym3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.3491F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 17, -0.35F, -2.25F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 0, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.5F, 1.25F);
        this.bodym3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.3491F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 6, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 17, -0.65F, -2.25F, -0.5F, 1, 3, 0, 0.0F, false));

        this.bodym4 = new AdvancedModelRenderer(this);
        this.bodym4.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.bodym3.addChild(bodym4);
        this.bodym4.cubeList.add(new ModelBox(bodym4, 0, 6, -0.99F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -0.5F, 2.25F);
        this.bodym4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.3491F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 17, -0.35F, -1.75F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 17, -0.35F, -2.0F, -2.0F, 1, 3, 0, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 0, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 0, -0.35F, -0.75F, -2.5F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -0.5F, 2.25F);
        this.bodym4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.3491F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 6, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 6, -0.65F, -0.75F, -2.5F, 1, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 10, 17, -0.65F, -1.75F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 10, 17, -0.65F, -2.0F, -2.0F, 1, 3, 0, 0.0F, false));

        this.bodym5 = new AdvancedModelRenderer(this);
        this.bodym5.setRotationPoint(0.0F, 0.1F, 2.0F);
        this.bodym4.addChild(bodym5);
        this.bodym5.cubeList.add(new ModelBox(bodym5, 0, 6, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -0.5F, 2.75F);
        this.bodym5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.3491F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 8, 17, -0.35F, -1.5F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 8, 17, -0.35F, -1.75F, -1.75F, 1, 3, 0, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 16, 0, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 16, 0, -0.35F, -0.75F, -2.25F, 1, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -0.5F, 2.75F);
        this.bodym5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.3491F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 8, 6, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 8, 6, -0.65F, -0.75F, -2.25F, 1, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 17, -0.65F, -1.5F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 17, -0.65F, -1.75F, -1.75F, 1, 3, 0, 0.0F, false));

        this.legRm6 = new AdvancedModelRenderer(this);
        this.legRm6.setRotationPoint(-0.15F, 0.6F, 1.0F);
        this.bodym5.addChild(legRm6);
        this.setRotateAngle(legRm6, 0.0F, 0.0F, 0.5236F);
        this.legRm6.cubeList.add(new ModelBox(legRm6, 12, 4, -0.95F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legRm6.cubeList.add(new ModelBox(legRm6, 13, 12, -0.9F, 2.5F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legRm6.cubeList.add(new ModelBox(legRm6, 4, 13, -0.9F, 1.9F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legRm6.cubeList.add(new ModelBox(legRm6, 2, 13, -0.9F, 1.3F, -0.3F, 1, 0, 1, 0.0F, false));

        this.legRm7 = new AdvancedModelRenderer(this);
        this.legRm7.setRotationPoint(0.0F, 0.6F, 2.25F);
        this.bodym5.addChild(legRm7);
        this.setRotateAngle(legRm7, 0.0F, 0.0F, 0.5236F);
        this.legRm7.cubeList.add(new ModelBox(legRm7, 12, 4, -0.95F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legRm7.cubeList.add(new ModelBox(legRm7, 13, 12, -0.95F, 2.5F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legRm7.cubeList.add(new ModelBox(legRm7, 4, 13, -0.95F, 1.9F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legRm7.cubeList.add(new ModelBox(legRm7, 2, 13, -0.95F, 1.3F, -0.3F, 1, 0, 1, 0.0F, false));

        this.bodym6 = new AdvancedModelRenderer(this);
        this.bodym6.setRotationPoint(0.0F, 0.15F, 2.0F);
        this.bodym5.addChild(bodym6);
        this.bodym6.cubeList.add(new ModelBox(bodym6, 0, 6, -0.99F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -0.5F, 1.9F);
        this.bodym6.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.3491F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 8, 17, -0.35F, -1.5F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 0, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -0.5F, 1.9F);
        this.bodym6.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.3491F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 8, 6, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 10, 17, -0.65F, -1.5F, -0.5F, 1, 3, 0, 0.0F, false));

        this.legRm8 = new AdvancedModelRenderer(this);
        this.legRm8.setRotationPoint(0.1F, 0.45F, 1.4F);
        this.bodym6.addChild(legRm8);
        this.setRotateAngle(legRm8, 0.0F, 0.0F, 0.5236F);
        this.legRm8.cubeList.add(new ModelBox(legRm8, 12, 4, -0.95F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legRm8.cubeList.add(new ModelBox(legRm8, 13, 12, -0.95F, 2.5F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legRm8.cubeList.add(new ModelBox(legRm8, 4, 13, -0.95F, 1.9F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legRm8.cubeList.add(new ModelBox(legRm8, 2, 13, -0.95F, 1.3F, -0.3F, 1, 0, 1, 0.0F, false));

        this.legLm8 = new AdvancedModelRenderer(this);
        this.legLm8.setRotationPoint(-0.1F, 0.45F, 1.4F);
        this.bodym6.addChild(legLm8);
        this.setRotateAngle(legLm8, 0.0F, 0.0F, -0.5236F);
        this.legLm8.cubeList.add(new ModelBox(legLm8, 0, 0, -0.05F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legLm8.cubeList.add(new ModelBox(legLm8, 5, 11, -0.05F, 2.5F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legLm8.cubeList.add(new ModelBox(legLm8, 5, 10, -0.05F, 1.9F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legLm8.cubeList.add(new ModelBox(legLm8, 7, 1, -0.05F, 1.3F, -0.3F, 1, 0, 1, 0.0F, false));

        this.legLm6 = new AdvancedModelRenderer(this);
        this.legLm6.setRotationPoint(0.15F, 0.6F, 1.0F);
        this.bodym5.addChild(legLm6);
        this.setRotateAngle(legLm6, 0.0F, 0.0F, -0.5236F);
        this.legLm6.cubeList.add(new ModelBox(legLm6, 0, 0, -0.05F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legLm6.cubeList.add(new ModelBox(legLm6, 5, 11, -0.1F, 2.5F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legLm6.cubeList.add(new ModelBox(legLm6, 5, 10, -0.1F, 1.9F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legLm6.cubeList.add(new ModelBox(legLm6, 7, 1, -0.1F, 1.3F, -0.3F, 1, 0, 1, 0.0F, false));

        this.legLm7 = new AdvancedModelRenderer(this);
        this.legLm7.setRotationPoint(0.0F, 0.6F, 2.25F);
        this.bodym5.addChild(legLm7);
        this.setRotateAngle(legLm7, 0.0F, 0.0F, -0.5236F);
        this.legLm7.cubeList.add(new ModelBox(legLm7, 0, 0, -0.05F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legLm7.cubeList.add(new ModelBox(legLm7, 5, 11, -0.05F, 2.5F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legLm7.cubeList.add(new ModelBox(legLm7, 5, 10, -0.05F, 1.9F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legLm7.cubeList.add(new ModelBox(legLm7, 7, 1, -0.05F, 1.3F, -0.3F, 1, 0, 1, 0.0F, false));

        this.legRm4 = new AdvancedModelRenderer(this);
        this.legRm4.setRotationPoint(-0.25F, 0.7F, 0.25F);
        this.bodym4.addChild(legRm4);
        this.setRotateAngle(legRm4, 0.0F, 0.0F, 0.5236F);
        this.legRm4.cubeList.add(new ModelBox(legRm4, 12, 4, -0.95F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legRm4.cubeList.add(new ModelBox(legRm4, 13, 12, -0.9031F, 2.675F, -0.2F, 1, 0, 1, 0.0F, false));
        this.legRm4.cubeList.add(new ModelBox(legRm4, 4, 13, -0.9031F, 2.075F, -0.2F, 1, 0, 1, 0.0F, false));
        this.legRm4.cubeList.add(new ModelBox(legRm4, 2, 13, -0.9031F, 1.475F, -0.2F, 1, 0, 1, 0.0F, false));

        this.legRm5 = new AdvancedModelRenderer(this);
        this.legRm5.setRotationPoint(-0.25F, 0.7F, 1.75F);
        this.bodym4.addChild(legRm5);
        this.setRotateAngle(legRm5, 0.0F, 0.0F, 0.5236F);
        this.legRm5.cubeList.add(new ModelBox(legRm5, 12, 4, -0.95F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legRm5.cubeList.add(new ModelBox(legRm5, 13, 12, -0.9031F, 2.675F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legRm5.cubeList.add(new ModelBox(legRm5, 4, 13, -0.9031F, 2.075F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legRm5.cubeList.add(new ModelBox(legRm5, 2, 13, -0.9031F, 1.475F, -0.3F, 1, 0, 1, 0.0F, false));

        this.legLm4 = new AdvancedModelRenderer(this);
        this.legLm4.setRotationPoint(0.25F, 0.7F, 0.25F);
        this.bodym4.addChild(legLm4);
        this.setRotateAngle(legLm4, 0.0F, 0.0F, -0.5236F);
        this.legLm4.cubeList.add(new ModelBox(legLm4, 0, 0, -0.05F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legLm4.cubeList.add(new ModelBox(legLm4, 5, 11, -0.0969F, 2.675F, -0.2F, 1, 0, 1, 0.0F, false));
        this.legLm4.cubeList.add(new ModelBox(legLm4, 5, 10, -0.0969F, 2.075F, -0.2F, 1, 0, 1, 0.0F, false));
        this.legLm4.cubeList.add(new ModelBox(legLm4, 7, 1, -0.0969F, 1.475F, -0.2F, 1, 0, 1, 0.0F, false));

        this.legLm5 = new AdvancedModelRenderer(this);
        this.legLm5.setRotationPoint(0.25F, 0.7F, 1.75F);
        this.bodym4.addChild(legLm5);
        this.setRotateAngle(legLm5, 0.0F, 0.0F, -0.5236F);
        this.legLm5.cubeList.add(new ModelBox(legLm5, 0, 0, -0.05F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legLm5.cubeList.add(new ModelBox(legLm5, 5, 11, -0.0969F, 2.675F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legLm5.cubeList.add(new ModelBox(legLm5, 5, 10, -0.0969F, 2.075F, -0.3F, 1, 0, 1, 0.0F, false));
        this.legLm5.cubeList.add(new ModelBox(legLm5, 7, 1, -0.0969F, 1.475F, -0.3F, 1, 0, 1, 0.0F, false));

        this.legRm3 = new AdvancedModelRenderer(this);
        this.legRm3.setRotationPoint(-0.25F, 0.8F, 0.75F);
        this.bodym3.addChild(legRm3);
        this.setRotateAngle(legRm3, 0.0F, 0.0F, 0.5236F);
        this.legRm3.cubeList.add(new ModelBox(legRm3, 12, 4, -0.95F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legRm3.cubeList.add(new ModelBox(legRm3, 13, 12, -0.9031F, 2.675F, -0.1F, 1, 0, 1, 0.0F, false));
        this.legRm3.cubeList.add(new ModelBox(legRm3, 4, 13, -0.9031F, 2.075F, -0.1F, 1, 0, 1, 0.0F, false));
        this.legRm3.cubeList.add(new ModelBox(legRm3, 2, 13, -0.9031F, 1.475F, -0.1F, 1, 0, 1, 0.0F, false));
        this.legRm3.cubeList.add(new ModelBox(legRm3, 9, 12, -0.9031F, 0.875F, -0.1F, 1, 0, 1, 0.0F, false));

        this.legLm3 = new AdvancedModelRenderer(this);
        this.legLm3.setRotationPoint(0.25F, 0.8F, 0.75F);
        this.bodym3.addChild(legLm3);
        this.setRotateAngle(legLm3, 0.0F, 0.0F, -0.5236F);
        this.legLm3.cubeList.add(new ModelBox(legLm3, 0, 0, -0.05F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legLm3.cubeList.add(new ModelBox(legLm3, 5, 11, -0.0969F, 2.675F, -0.1F, 1, 0, 1, 0.0F, false));
        this.legLm3.cubeList.add(new ModelBox(legLm3, 5, 10, -0.0969F, 2.075F, -0.1F, 1, 0, 1, 0.0F, false));
        this.legLm3.cubeList.add(new ModelBox(legLm3, 7, 1, -0.0969F, 1.475F, -0.1F, 1, 0, 1, 0.0F, false));
        this.legLm3.cubeList.add(new ModelBox(legLm3, 7, 0, -0.0969F, 0.875F, -0.1F, 1, 0, 1, 0.0F, false));

        this.legRm2 = new AdvancedModelRenderer(this);
        this.legRm2.setRotationPoint(-0.25F, 0.9F, 1.0F);
        this.bodym2.addChild(legRm2);
        this.setRotateAngle(legRm2, 0.0F, 0.0F, 0.5236F);
        this.legRm2.cubeList.add(new ModelBox(legRm2, 12, 4, -0.95F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legRm2.cubeList.add(new ModelBox(legRm2, 13, 12, -0.9031F, 2.675F, 0.0F, 1, 0, 1, 0.0F, false));
        this.legRm2.cubeList.add(new ModelBox(legRm2, 4, 13, -0.9031F, 2.075F, 0.0F, 1, 0, 1, 0.0F, false));
        this.legRm2.cubeList.add(new ModelBox(legRm2, 2, 13, -0.9031F, 1.475F, 0.0F, 1, 0, 1, 0.0F, false));
        this.legRm2.cubeList.add(new ModelBox(legRm2, 9, 12, -0.9031F, 0.875F, 0.0F, 1, 0, 1, 0.0F, false));

        this.legLm2 = new AdvancedModelRenderer(this);
        this.legLm2.setRotationPoint(0.25F, 0.9F, 1.0F);
        this.bodym2.addChild(legLm2);
        this.setRotateAngle(legLm2, 0.0F, 0.0F, -0.5236F);
        this.legLm2.cubeList.add(new ModelBox(legLm2, 0, 0, -0.05F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legLm2.cubeList.add(new ModelBox(legLm2, 5, 11, -0.0969F, 2.675F, 0.0F, 1, 0, 1, 0.0F, false));
        this.legLm2.cubeList.add(new ModelBox(legLm2, 5, 10, -0.0969F, 2.075F, 0.0F, 1, 0, 1, 0.0F, false));
        this.legLm2.cubeList.add(new ModelBox(legLm2, 7, 1, -0.0969F, 1.475F, 0.0F, 1, 0, 1, 0.0F, false));
        this.legLm2.cubeList.add(new ModelBox(legLm2, 7, 0, -0.0969F, 0.875F, 0.0F, 1, 0, 1, 0.0F, false));

        this.legRm = new AdvancedModelRenderer(this);
        this.legRm.setRotationPoint(-0.25F, 1.0F, 1.0F);
        this.bodym.addChild(legRm);
        this.setRotateAngle(legRm, 0.0F, 0.0F, 0.5236F);
        this.legRm.cubeList.add(new ModelBox(legRm, 12, 4, -0.95F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legRm.cubeList.add(new ModelBox(legRm, 13, 12, -0.9031F, 2.675F, 0.0F, 1, 0, 1, 0.0F, false));
        this.legRm.cubeList.add(new ModelBox(legRm, 4, 13, -0.9031F, 2.075F, 0.0F, 1, 0, 1, 0.0F, false));
        this.legRm.cubeList.add(new ModelBox(legRm, 2, 13, -0.9031F, 1.475F, 0.0F, 1, 0, 1, 0.0F, false));
        this.legRm.cubeList.add(new ModelBox(legRm, 9, 12, -0.9031F, 0.875F, 0.0F, 1, 0, 1, 0.0F, false));

        this.legLm = new AdvancedModelRenderer(this);
        this.legLm.setRotationPoint(0.25F, 1.0F, 1.0F);
        this.bodym.addChild(legLm);
        this.setRotateAngle(legLm, 0.0F, 0.0F, -0.5236F);
        this.legLm.cubeList.add(new ModelBox(legLm, 0, 0, -0.05F, 0.0866F, -0.5F, 1, 3, 1, 0.0F, false));
        this.legLm.cubeList.add(new ModelBox(legLm, 5, 11, -0.0969F, 2.675F, 0.0F, 1, 0, 1, 0.0F, false));
        this.legLm.cubeList.add(new ModelBox(legLm, 5, 10, -0.0969F, 2.075F, 0.0F, 1, 0, 1, 0.0F, false));
        this.legLm.cubeList.add(new ModelBox(legLm, 7, 1, -0.0969F, 1.475F, 0.0F, 1, 0, 1, 0.0F, false));
        this.legLm.cubeList.add(new ModelBox(legLm, 7, 0, -0.0969F, 0.875F, 0.0F, 1, 0, 1, 0.0F, false));

        this.legRs8 = new AdvancedModelRenderer(this);
        this.legRs8.setRotationPoint(-0.5F, -0.05F, 1.0F);
        this.bodys8.addChild(legRs8);
        this.setRotateAngle(legRs8, 0.0F, 0.0F, 0.3491F);
        this.legRs8.cubeList.add(new ModelBox(legRs8, 11, 12, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRs8.cubeList.add(new ModelBox(legRs8, 13, 17, -1.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs8.cubeList.add(new ModelBox(legRs8, 17, 12, -1.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs8.cubeList.add(new ModelBox(legRs8, 17, 11, -1.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs8.cubeList.add(new ModelBox(legRs8, 11, 17, -1.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));

        this.legLs8 = new AdvancedModelRenderer(this);
        this.legLs8.setRotationPoint(0.5F, -0.05F, 1.0F);
        this.bodys8.addChild(legLs8);
        this.setRotateAngle(legLs8, 0.0F, 0.0F, -0.3491F);
        this.legLs8.cubeList.add(new ModelBox(legLs8, 7, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLs8.cubeList.add(new ModelBox(legLs8, 17, 3, 0.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs8.cubeList.add(new ModelBox(legLs8, 17, 2, 0.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs8.cubeList.add(new ModelBox(legLs8, 3, 15, 0.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs8.cubeList.add(new ModelBox(legLs8, 14, 4, 0.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));

        this.legRl5 = new AdvancedModelRenderer(this);
        this.legRl5.setRotationPoint(-0.5F, 0.15F, 1.0F);
        this.bodyl5.addChild(legRl5);
        this.setRotateAngle(legRl5, 0.0F, 0.0F, 0.4363F);
        this.legRl5.cubeList.add(new ModelBox(legRl5, 0, 13, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRl5.cubeList.add(new ModelBox(legRl5, 18, 4, -1.0F, 3.5F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl5.cubeList.add(new ModelBox(legRl5, 3, 18, -1.0F, 2.9F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl5.cubeList.add(new ModelBox(legRl5, 1, 18, -1.0F, 2.3F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl5.cubeList.add(new ModelBox(legRl5, 18, 0, -1.0F, 1.7F, 0.4F, 1, 0, 1, 0.0F, false));

        this.legLl5 = new AdvancedModelRenderer(this);
        this.legLl5.setRotationPoint(0.5F, 0.15F, 1.0F);
        this.bodyl5.addChild(legLl5);
        this.setRotateAngle(legLl5, 0.0F, 0.0F, -0.4363F);
        this.legLl5.cubeList.add(new ModelBox(legLl5, 15, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLl5.cubeList.add(new ModelBox(legLl5, 13, 18, 0.0F, 3.5F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl5.cubeList.add(new ModelBox(legLl5, 11, 18, 0.0F, 2.9F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl5.cubeList.add(new ModelBox(legLl5, 18, 8, 0.0F, 2.3F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl5.cubeList.add(new ModelBox(legLl5, 18, 6, 0.0F, 1.7F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl5.cubeList.add(new ModelBox(legLl5, 5, 18, 0.0F, 1.1F, 0.4F, 1, 0, 1, 0.0F, false));

        this.bodyl4 = new AdvancedModelRenderer(this);
        this.bodyl4.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.bodyl5.addChild(bodyl4);
        this.bodyl4.cubeList.add(new ModelBox(bodyl4, 8, 8, -1.49F, -0.8F, -2.0F, 3, 2, 2, 0.0F, false));
        this.bodyl4.cubeList.add(new ModelBox(bodyl4, 0, 10, -0.99F, -1.3F, -2.01F, 2, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, -0.8F, -0.5F);
        this.bodyl4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.3491F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 2, 19, -0.35F, -3.5F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 8, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, -0.8F, -0.5F);
        this.bodyl4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.3491F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 16, 6, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 18, 18, -0.65F, -3.5F, -0.5F, 1, 3, 0, 0.0F, false));

        this.legRl4 = new AdvancedModelRenderer(this);
        this.legRl4.setRotationPoint(-0.5F, 0.25F, -1.0F);
        this.bodyl4.addChild(legRl4);
        this.setRotateAngle(legRl4, 0.0F, 0.0F, 0.3491F);
        this.legRl4.cubeList.add(new ModelBox(legRl4, 0, 13, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRl4.cubeList.add(new ModelBox(legRl4, 18, 4, -1.0F, 3.5F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl4.cubeList.add(new ModelBox(legRl4, 3, 18, -1.0F, 2.9F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl4.cubeList.add(new ModelBox(legRl4, 1, 18, -1.0F, 2.3F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl4.cubeList.add(new ModelBox(legRl4, 18, 0, -1.0F, 1.7F, 0.4F, 1, 0, 1, 0.0F, false));

        this.legLl4 = new AdvancedModelRenderer(this);
        this.legLl4.setRotationPoint(0.5F, 0.25F, -1.0F);
        this.bodyl4.addChild(legLl4);
        this.setRotateAngle(legLl4, 0.0F, 0.0F, -0.3491F);
        this.legLl4.cubeList.add(new ModelBox(legLl4, 15, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLl4.cubeList.add(new ModelBox(legLl4, 13, 18, 0.0F, 3.5F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl4.cubeList.add(new ModelBox(legLl4, 11, 18, 0.0F, 2.9F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl4.cubeList.add(new ModelBox(legLl4, 18, 8, 0.0F, 2.3F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl4.cubeList.add(new ModelBox(legLl4, 18, 6, 0.0F, 1.7F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl4.cubeList.add(new ModelBox(legLl4, 5, 18, 0.0F, 1.1F, 0.4F, 1, 0, 1, 0.0F, false));

        this.bodyl3 = new AdvancedModelRenderer(this);
        this.bodyl3.setRotationPoint(0.0F, -0.25F, -2.0F);
        this.bodyl4.addChild(bodyl3);
        this.bodyl3.cubeList.add(new ModelBox(bodyl3, 8, 8, -1.5F, -0.6F, -2.0F, 3, 2, 2, 0.0F, false));
        this.bodyl3.cubeList.add(new ModelBox(bodyl3, 0, 10, -1.0F, -1.1F, -2.01F, 2, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, -0.6F, -0.5F);
        this.bodyl3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.3491F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 2, 19, -0.35F, -3.5F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 16, 8, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, -0.6F, -0.5F);
        this.bodyl3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -0.3491F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 16, 6, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 18, 18, -0.65F, -3.5F, -0.5F, 1, 3, 0, 0.0F, false));

        this.legRl3 = new AdvancedModelRenderer(this);
        this.legRl3.setRotationPoint(-0.7F, 0.45F, -1.0F);
        this.bodyl3.addChild(legRl3);
        this.setRotateAngle(legRl3, 0.0F, 0.0F, 0.2618F);
        this.legRl3.cubeList.add(new ModelBox(legRl3, 0, 13, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRl3.cubeList.add(new ModelBox(legRl3, 18, 4, -1.0F, 3.5F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl3.cubeList.add(new ModelBox(legRl3, 3, 18, -1.0F, 2.9F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl3.cubeList.add(new ModelBox(legRl3, 1, 18, -1.0F, 2.3F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl3.cubeList.add(new ModelBox(legRl3, 18, 0, -1.0F, 1.7F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl3.cubeList.add(new ModelBox(legRl3, 17, 17, -1.0F, 1.1F, 0.4F, 1, 0, 1, 0.0F, false));

        this.legLl3 = new AdvancedModelRenderer(this);
        this.legLl3.setRotationPoint(0.7F, 0.45F, -1.0F);
        this.bodyl3.addChild(legLl3);
        this.setRotateAngle(legLl3, 0.0F, 0.0F, -0.2618F);
        this.legLl3.cubeList.add(new ModelBox(legLl3, 15, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLl3.cubeList.add(new ModelBox(legLl3, 13, 18, 0.0F, 3.5F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl3.cubeList.add(new ModelBox(legLl3, 11, 18, 0.0F, 2.9F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl3.cubeList.add(new ModelBox(legLl3, 18, 8, 0.0F, 2.3F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl3.cubeList.add(new ModelBox(legLl3, 18, 6, 0.0F, 1.7F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl3.cubeList.add(new ModelBox(legLl3, 5, 18, 0.0F, 1.1F, 0.4F, 1, 0, 1, 0.0F, false));

        this.bodyl2 = new AdvancedModelRenderer(this);
        this.bodyl2.setRotationPoint(0.0F, 0.25F, -2.0F);
        this.bodyl3.addChild(bodyl2);
        this.bodyl2.cubeList.add(new ModelBox(bodyl2, 8, 8, -1.49F, -0.8F, -2.0F, 3, 2, 2, 0.0F, false));
        this.bodyl2.cubeList.add(new ModelBox(bodyl2, 0, 10, -0.99F, -1.3F, -2.01F, 2, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, -0.8F, -0.5F);
        this.bodyl2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.3491F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 2, 19, -0.35F, -3.5F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 8, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, -0.8F, -0.5F);
        this.bodyl2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -0.3491F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 16, 6, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 18, -0.65F, -3.5F, -0.5F, 1, 3, 0, 0.0F, false));

        this.legLl2 = new AdvancedModelRenderer(this);
        this.legLl2.setRotationPoint(0.5F, 0.25F, -1.0F);
        this.bodyl2.addChild(legLl2);
        this.setRotateAngle(legLl2, 0.0F, 0.0F, -0.3491F);
        this.legLl2.cubeList.add(new ModelBox(legLl2, 15, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLl2.cubeList.add(new ModelBox(legLl2, 13, 18, 0.0F, 3.5F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl2.cubeList.add(new ModelBox(legLl2, 11, 18, 0.0F, 2.9F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl2.cubeList.add(new ModelBox(legLl2, 18, 8, 0.0F, 2.3F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl2.cubeList.add(new ModelBox(legLl2, 18, 6, 0.0F, 1.7F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl2.cubeList.add(new ModelBox(legLl2, 5, 18, 0.0F, 1.1F, 0.4F, 1, 0, 1, 0.0F, false));

        this.legRl2 = new AdvancedModelRenderer(this);
        this.legRl2.setRotationPoint(-0.5F, 0.25F, -1.0F);
        this.bodyl2.addChild(legRl2);
        this.setRotateAngle(legRl2, 0.0F, 0.0F, 0.3491F);
        this.legRl2.cubeList.add(new ModelBox(legRl2, 0, 13, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRl2.cubeList.add(new ModelBox(legRl2, 18, 4, -1.0F, 3.5F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl2.cubeList.add(new ModelBox(legRl2, 3, 18, -1.0F, 2.9F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl2.cubeList.add(new ModelBox(legRl2, 1, 18, -1.0F, 2.3F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl2.cubeList.add(new ModelBox(legRl2, 18, 0, -1.0F, 1.7F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl2.cubeList.add(new ModelBox(legRl2, 17, 17, -1.0F, 1.1F, 0.4F, 1, 0, 1, 0.0F, false));

        this.bodyl = new AdvancedModelRenderer(this);
        this.bodyl.setRotationPoint(0.0F, 0.25F, -2.0F);
        this.bodyl2.addChild(bodyl);
        this.bodyl.cubeList.add(new ModelBox(bodyl, 8, 8, -1.5F, -1.0F, -2.0F, 3, 2, 2, 0.0F, false));
        this.bodyl.cubeList.add(new ModelBox(bodyl, 0, 10, -1.0F, -1.5F, -2.01F, 2, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.0F, -1.0F, -0.5F);
        this.bodyl.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.3491F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 2, 19, -0.35F, -3.25F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 16, 8, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, -1.0F, -0.5F);
        this.bodyl.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.3491F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 6, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 18, -0.65F, -3.25F, -0.5F, 1, 3, 0, 0.0F, false));

        this.legRl = new AdvancedModelRenderer(this);
        this.legRl.setRotationPoint(-0.25F, 0.1F, -1.0F);
        this.bodyl.addChild(legRl);
        this.setRotateAngle(legRl, 0.0F, 0.0F, 0.4363F);
        this.legRl.cubeList.add(new ModelBox(legRl, 0, 13, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRl.cubeList.add(new ModelBox(legRl, 18, 4, -1.0F, 3.5F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl.cubeList.add(new ModelBox(legRl, 3, 18, -1.0F, 2.9F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl.cubeList.add(new ModelBox(legRl, 1, 18, -1.0F, 2.3F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legRl.cubeList.add(new ModelBox(legRl, 18, 0, -1.0F, 1.7F, 0.4F, 1, 0, 1, 0.0F, false));

        this.legLl = new AdvancedModelRenderer(this);
        this.legLl.setRotationPoint(0.25F, 0.1F, -1.0F);
        this.bodyl.addChild(legLl);
        this.setRotateAngle(legLl, 0.0F, 0.0F, -0.4363F);
        this.legLl.cubeList.add(new ModelBox(legLl, 15, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLl.cubeList.add(new ModelBox(legLl, 13, 18, 0.0F, 3.5F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl.cubeList.add(new ModelBox(legLl, 11, 18, 0.0F, 2.9F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl.cubeList.add(new ModelBox(legLl, 18, 8, 0.0F, 2.3F, 0.4F, 1, 0, 1, 0.0F, false));
        this.legLl.cubeList.add(new ModelBox(legLl, 18, 6, 0.0F, 1.7F, 0.4F, 1, 0, 1, 0.0F, false));

        this.bodys4 = new AdvancedModelRenderer(this);
        this.bodys4.setRotationPoint(0.0F, -0.15F, -2.0F);
        this.bodyl.addChild(bodys4);
        this.bodys4.cubeList.add(new ModelBox(bodys4, 8, 0, -1.49F, -1.01F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.0F, -0.5F, -0.5F);
        this.bodys4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 0.3491F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 16, 17, -0.35F, -3.25F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 16, 4, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.0F, -0.5F, -0.5F);
        this.bodys4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -0.3491F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 4, 16, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 18, -0.65F, -3.25F, -0.5F, 1, 3, 0, 0.0F, false));

        this.legRs4 = new AdvancedModelRenderer(this);
        this.legRs4.setRotationPoint(-0.25F, 0.1F, -1.0F);
        this.bodys4.addChild(legRs4);
        this.setRotateAngle(legRs4, 0.0F, 0.0F, 0.3491F);
        this.legRs4.cubeList.add(new ModelBox(legRs4, 11, 12, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRs4.cubeList.add(new ModelBox(legRs4, 13, 17, -1.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs4.cubeList.add(new ModelBox(legRs4, 17, 12, -1.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs4.cubeList.add(new ModelBox(legRs4, 17, 11, -1.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs4.cubeList.add(new ModelBox(legRs4, 11, 17, -1.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));

        this.legLs4 = new AdvancedModelRenderer(this);
        this.legLs4.setRotationPoint(0.25F, 0.1F, -1.0F);
        this.bodys4.addChild(legLs4);
        this.setRotateAngle(legLs4, 0.0F, 0.0F, -0.3491F);
        this.legLs4.cubeList.add(new ModelBox(legLs4, 7, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLs4.cubeList.add(new ModelBox(legLs4, 17, 3, 0.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs4.cubeList.add(new ModelBox(legLs4, 17, 2, 0.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs4.cubeList.add(new ModelBox(legLs4, 3, 15, 0.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs4.cubeList.add(new ModelBox(legLs4, 14, 4, 0.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));

        this.bodys3 = new AdvancedModelRenderer(this);
        this.bodys3.setRotationPoint(0.0F, 0.1F, -2.0F);
        this.bodys4.addChild(bodys3);
        this.bodys3.cubeList.add(new ModelBox(bodys3, 8, 0, -1.5F, -1.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.0F, -0.5F, -0.5F);
        this.bodys3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 0.3491F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 16, 17, -0.35F, -3.0F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 16, 4, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.0F, -0.5F, -0.5F);
        this.bodys3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, -0.3491F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 4, 16, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 18, -0.65F, -3.1F, -0.5F, 1, 3, 0, 0.0F, false));

        this.legRs3 = new AdvancedModelRenderer(this);
        this.legRs3.setRotationPoint(-0.25F, 0.0F, -1.0F);
        this.bodys3.addChild(legRs3);
        this.setRotateAngle(legRs3, 0.0F, 0.0F, 0.3491F);
        this.legRs3.cubeList.add(new ModelBox(legRs3, 11, 12, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRs3.cubeList.add(new ModelBox(legRs3, 13, 17, -1.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs3.cubeList.add(new ModelBox(legRs3, 17, 12, -1.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs3.cubeList.add(new ModelBox(legRs3, 17, 11, -1.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs3.cubeList.add(new ModelBox(legRs3, 11, 17, -1.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));

        this.legLs3 = new AdvancedModelRenderer(this);
        this.legLs3.setRotationPoint(0.25F, 0.0F, -1.0F);
        this.bodys3.addChild(legLs3);
        this.setRotateAngle(legLs3, 0.0F, 0.0F, -0.3491F);
        this.legLs3.cubeList.add(new ModelBox(legLs3, 7, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLs3.cubeList.add(new ModelBox(legLs3, 17, 3, 0.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs3.cubeList.add(new ModelBox(legLs3, 17, 2, 0.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs3.cubeList.add(new ModelBox(legLs3, 3, 15, 0.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs3.cubeList.add(new ModelBox(legLs3, 14, 4, 0.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));

        this.bodys2 = new AdvancedModelRenderer(this);
        this.bodys2.setRotationPoint(0.0F, 0.1F, -2.0F);
        this.bodys3.addChild(bodys2);
        this.bodys2.cubeList.add(new ModelBox(bodys2, 8, 0, -1.49F, -1.01F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.0F, -0.5F, -0.5F);
        this.bodys2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 0.3491F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 16, 17, -0.35F, -2.85F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 16, 4, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.0F, -0.5F, -0.5F);
        this.bodys2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.3491F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 4, 16, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 18, -0.65F, -2.75F, -0.5F, 1, 3, 0, 0.0F, false));

        this.legRs2 = new AdvancedModelRenderer(this);
        this.legRs2.setRotationPoint(-0.25F, 0.05F, -1.0F);
        this.bodys2.addChild(legRs2);
        this.setRotateAngle(legRs2, 0.0F, 0.0F, 0.4363F);
        this.legRs2.cubeList.add(new ModelBox(legRs2, 11, 12, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRs2.cubeList.add(new ModelBox(legRs2, 13, 17, -1.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs2.cubeList.add(new ModelBox(legRs2, 17, 12, -1.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs2.cubeList.add(new ModelBox(legRs2, 17, 11, -1.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs2.cubeList.add(new ModelBox(legRs2, 11, 17, -1.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));

        this.legLs2 = new AdvancedModelRenderer(this);
        this.legLs2.setRotationPoint(0.25F, 0.05F, -1.0F);
        this.bodys2.addChild(legLs2);
        this.setRotateAngle(legLs2, 0.0F, 0.0F, -0.4363F);
        this.legLs2.cubeList.add(new ModelBox(legLs2, 7, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLs2.cubeList.add(new ModelBox(legLs2, 17, 3, 0.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs2.cubeList.add(new ModelBox(legLs2, 17, 2, 0.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs2.cubeList.add(new ModelBox(legLs2, 3, 15, 0.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs2.cubeList.add(new ModelBox(legLs2, 14, 4, 0.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));

        this.bodys = new AdvancedModelRenderer(this);
        this.bodys.setRotationPoint(0.0F, 0.1F, -2.0F);
        this.bodys2.addChild(bodys);
        this.bodys.cubeList.add(new ModelBox(bodys, 8, 0, -1.5F, -1.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.0F, -0.5F, -0.5F);
        this.bodys.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, 0.3491F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 16, 17, -0.35F, -2.25F, -0.5F, 1, 3, 0, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 16, 4, -0.35F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.0F, -0.5F, -0.5F);
        this.bodys.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, -0.3491F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 4, 16, -0.65F, -0.75F, -1.0F, 1, 1, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 18, -0.65F, -2.25F, -0.5F, 1, 3, 0, 0.0F, false));

        this.legRs = new AdvancedModelRenderer(this);
        this.legRs.setRotationPoint(-0.25F, 0.0F, -1.0F);
        this.bodys.addChild(legRs);
        this.setRotateAngle(legRs, 0.0F, 0.0F, 0.4363F);
        this.legRs.cubeList.add(new ModelBox(legRs, 11, 12, -1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legRs.cubeList.add(new ModelBox(legRs, 13, 17, -1.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs.cubeList.add(new ModelBox(legRs, 17, 12, -1.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs.cubeList.add(new ModelBox(legRs, 17, 11, -1.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legRs.cubeList.add(new ModelBox(legRs, 11, 17, -1.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));

        this.legLs = new AdvancedModelRenderer(this);
        this.legLs.setRotationPoint(0.25F, 0.0F, -1.0F);
        this.bodys.addChild(legLs);
        this.setRotateAngle(legLs, 0.0F, 0.0F, -0.4363F);
        this.legLs.cubeList.add(new ModelBox(legLs, 7, 12, 0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.legLs.cubeList.add(new ModelBox(legLs, 17, 3, 0.0F, 3.6F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs.cubeList.add(new ModelBox(legLs, 17, 2, 0.0F, 3.0F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs.cubeList.add(new ModelBox(legLs, 3, 15, 0.0F, 2.4F, 0.25F, 1, 0, 1, 0.0F, false));
        this.legLs.cubeList.add(new ModelBox(legLs, 14, 4, 0.0F, 1.8F, 0.25F, 1, 0, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.15F, -1.5F);
        this.bodys.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -0.75F, -4.0F, 2, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 22, -0.5F, -0.25F, -4.01F, 1, 1, 0, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bodyl5.render(f5 * 0.125F);
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
        this.bodyl5.offsetY = 1.32F;

        AdvancedModelRenderer[] bodyF = {this.bodys3, this.bodys2,this.bodys, this.head};
        AdvancedModelRenderer[] bodyB = {this.bodys5, this.bodys6, this.bodys7, this.bodys8};
        AdvancedModelRenderer[] bodyE = {this.bodym, this.bodym2, this.bodym3, this.bodym4, this.bodym5, this.bodym6};
        AdvancedModelRenderer[] bodyH = {this.head};

        EntityPrehistoricFloraXenusion ee = (EntityPrehistoricFloraXenusion) e;

        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.faceTarget(f3, f4, 6, head);
        }

        float legFlapDegree = 0.3F;
        float legWalkDegree = 0.5F;
        float legSpeed = 0.198F;
        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.flap(legLs, legSpeed, -legFlapDegree, false, 0, -legFlapDegree, f2, 0.3F);
            this.flap(legRs, legSpeed, legFlapDegree, false, 2F, legFlapDegree, f2, 0.3F);
            this.flap(legLs2, legSpeed, -legFlapDegree, false, 2.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRs2, legSpeed, legFlapDegree, false, 4.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLs3, legSpeed, -legFlapDegree, false, 4.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRs3, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLs4, legSpeed, -legFlapDegree, false, 6.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRs4, legSpeed, legFlapDegree, false, 8.0F, legFlapDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.flap(legLl, legSpeed, -legFlapDegree, false, 8.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRl, legSpeed, legFlapDegree, false, 10.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLl2, legSpeed * 1.1F, -legFlapDegree, false, 0.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRl2, legSpeed * 1.1F, legFlapDegree, false, 2.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLl3, legSpeed * 1.2F, -legFlapDegree, false, 2.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRl3, legSpeed * 1.2F, legFlapDegree, false, 4.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLl4, legSpeed * 1.3F, -legFlapDegree, false, 4.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRl4, legSpeed * 1.3F, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLl5, legSpeed * 1.3F, -legFlapDegree, false, 6.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRl5, legSpeed * 1.3F, legFlapDegree, false, 8.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLs5, legSpeed * 1.3F, -legFlapDegree, false, 8.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRs5, legSpeed * 1.3F, legFlapDegree, false, 10.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLs6, legSpeed * 1.3F, -legFlapDegree, false, 10.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRs6, legSpeed * 1.3F, legFlapDegree, false, 12.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLs7, legSpeed * 1.3F, -legFlapDegree, false, 12.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRs7, legSpeed * 1.3F, legFlapDegree, false, 14.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLs8, legSpeed * 1.3F, -legFlapDegree, false, 14.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRs8, legSpeed * 1.3F, legFlapDegree, false, 16.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLm, legSpeed * 1.3F, -legFlapDegree, false, 16.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRm, legSpeed * 1.3F, legFlapDegree, false, 18.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLm2, legSpeed * 1.3F, -legFlapDegree, false, 18.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRm2, legSpeed * 1.3F, legFlapDegree, false, 20.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLm3, legSpeed * 1.3F, -legFlapDegree, false, 20.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRm3, legSpeed * 1.3F, legFlapDegree, false, 22.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLm4, legSpeed * 1.3F, -legFlapDegree, false, 22.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRm4, legSpeed * 1.3F, legFlapDegree, false, 24.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLm5, legSpeed * 1.3F, -legFlapDegree, false, 24.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRm5, legSpeed * 1.3F, legFlapDegree, false, 26.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLm6, legSpeed * 1.3F, -legFlapDegree, false, 26.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRm6, legSpeed * 1.3F, legFlapDegree, false, 28.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLm7, legSpeed * 1.3F, -legFlapDegree, false, 28.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRm7, legSpeed * 1.3F, legFlapDegree, false, 30.0F, legFlapDegree, f2, 0.3F);
            this.flap(legLm8, legSpeed * 1.3F, -legFlapDegree, false, 30.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legRm8, legSpeed * 1.3F, legFlapDegree, false, 32.0F, legFlapDegree, f2, 0.3F);
        }

        if (f3 != 0.0f) {
            this.walk(legLs, legSpeed, -legWalkDegree, false, 0, -legWalkDegree, f2, 0.3F);
            this.walk(legRs, legSpeed, legWalkDegree, false, 2F, legWalkDegree, f2, 0.3F);
            this.walk(legLs2, legSpeed, -legWalkDegree, false, 2.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRs2, legSpeed, legWalkDegree, false, 4.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLs3, legSpeed, -legWalkDegree, false, 4.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRs3, legSpeed, legWalkDegree, false, 6.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLs4, legSpeed, -legWalkDegree, false, 6.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRs4, legSpeed, legWalkDegree, false, 8.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLl, legSpeed, -legWalkDegree, false, 8.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRl, legSpeed, legWalkDegree, false, 10.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLl2, legSpeed * 1.1F, -legWalkDegree, false, 0.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRl2, legSpeed * 1.1F, legWalkDegree, false, 2.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLl3, legSpeed * 1.2F, -legWalkDegree, false, 2.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRl3, legSpeed * 1.2F, legWalkDegree, false, 4.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLl4, legSpeed * 1.3F, -legWalkDegree, false, 4.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRl4, legSpeed * 1.3F, legWalkDegree, false, 6.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLl5, legSpeed * 1.3F, -legWalkDegree, false, 6.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRl5, legSpeed * 1.3F, legWalkDegree, false, 8.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLs5, legSpeed * 1.3F, -legWalkDegree, false, 8.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRs5, legSpeed * 1.3F, legWalkDegree, false, 10.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLs6, legSpeed * 1.3F, -legWalkDegree, false, 10.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRs6, legSpeed * 1.3F, legWalkDegree, false, 12.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLs7, legSpeed * 1.3F, -legWalkDegree, false, 12.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRs7, legSpeed * 1.3F, legWalkDegree, false, 14.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLs8, legSpeed * 1.3F, -legWalkDegree, false, 14.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRs8, legSpeed * 1.3F, legWalkDegree, false, 16.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLm, legSpeed * 1.3F, -legWalkDegree, false, 16.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRm, legSpeed * 1.3F, legWalkDegree, false, 18.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLm2, legSpeed * 1.3F, -legWalkDegree, false, 18.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRm2, legSpeed * 1.3F, legWalkDegree, false, 20.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLm3, legSpeed * 1.3F, -legWalkDegree, false, 20.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRm3, legSpeed * 1.3F, legWalkDegree, false, 22.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLm4, legSpeed * 1.3F, -legWalkDegree, false, 22.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRm4, legSpeed * 1.3F, legWalkDegree, false, 24.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLm5, legSpeed * 1.3F, -legWalkDegree, false, 24.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRm5, legSpeed * 1.3F, legWalkDegree, false, 26.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLm6, legSpeed * 1.3F, -legWalkDegree, false, 26.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRm6, legSpeed * 1.3F, legWalkDegree, false, 28.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLm7, legSpeed * 1.3F, -legWalkDegree, false, 28.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRm7, legSpeed * 1.3F, legWalkDegree, false, 30.0F, legWalkDegree, f2, 0.3F);
            this.walk(legLm8, legSpeed * 1.3F, -legWalkDegree, false, 30.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legRm8, legSpeed * 1.3F, legWalkDegree, false, 32.0F, legWalkDegree, f2, 0.3F);
        }

        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.bob(bodyl5, 1F, 0.02F, false, f2, 1);
        }
        //this.walk(body6, 0.8F, -0.010f, false, 2, 0.15F, f2, 0.8F);
        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.chainWave(bodyH, legSpeed * 1.25F, 0.4f, -0.8F, f2, 0.4F);
            this.chainSwing(bodyH, legSpeed * 1.25F, 0.25F, 0.8F, f2, 0.45F);
        }
        this.chainWave(bodyF, 0.4F, 0.02f, 0.05, f2, 0.1F);
        this.chainSwing(bodyB, 0.085F, 0.18f, 0.15, f2, 0.15F);
        this.chainSwing(bodyF, 0.06F, 0.4F, -1, f2, 0.25F);
        //}
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraXenusion e = (EntityPrehistoricFloraXenusion) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.LOOK_ANIMATION);
        animator.startKeyframe(60);
        animator.rotate(this.head, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.head, (float) Math.toRadians(30), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.head, (float) Math.toRadians(-30), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.head, (float) Math.toRadians(-30), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.head, (float) Math.toRadians(30), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(60);
    }
}
