package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelCarcinosoma extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer eyeR_r1;
    private final AdvancedModelRenderer eyeL_r1;
    private final AdvancedModelRenderer carapace5_r1;
    private final AdvancedModelRenderer carapace4_r1;
    private final AdvancedModelRenderer segments;
    private final AdvancedModelRenderer metasoma1;
    private final AdvancedModelRenderer metasoma2;
    private final AdvancedModelRenderer metasoma3;
    private final AdvancedModelRenderer metasoma4;
    private final AdvancedModelRenderer metasoma5;
    private final AdvancedModelRenderer telson;
    private final AdvancedModelRenderer tip;
    private final AdvancedModelRenderer spine3_r1;
    private final AdvancedModelRenderer leg1L;
    private final AdvancedModelRenderer leg2L;
    private final AdvancedModelRenderer leg2L2;
    private final AdvancedModelRenderer leg2L3;
    private final AdvancedModelRenderer leg3L;
    private final AdvancedModelRenderer leg3L2;
    private final AdvancedModelRenderer leg3L3;
    private final AdvancedModelRenderer leg4L;
    private final AdvancedModelRenderer leg4L2;
    private final AdvancedModelRenderer leg4L3;
    private final AdvancedModelRenderer leg5L;
    private final AdvancedModelRenderer leg5L2;
    private final AdvancedModelRenderer leg5L3;
    private final AdvancedModelRenderer leg1R;
    private final AdvancedModelRenderer leg2R;
    private final AdvancedModelRenderer leg2R2;
    private final AdvancedModelRenderer leg2R3;
    private final AdvancedModelRenderer leg3R;
    private final AdvancedModelRenderer leg3R2;
    private final AdvancedModelRenderer leg3R3;
    private final AdvancedModelRenderer leg4R;
    private final AdvancedModelRenderer leg4R2;
    private final AdvancedModelRenderer leg4R3;
    private final AdvancedModelRenderer leg5R;
    private final AdvancedModelRenderer leg5R2;
    private final AdvancedModelRenderer leg5R3;

    private ModelAnimator animator;


    public ModelCarcinosoma() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 19, 9, -4.5F, -2.0F, -3.0F, 9, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 28, -2.0F, -2.0F, -8.0F, 4, 2, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 44, 0, -3.0F, -2.0F, -4.0F, 6, 2, 1, 0.0F, false));

        this.eyeR_r1 = new AdvancedModelRenderer(this);
        this.eyeR_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(eyeR_r1);
        this.setRotateAngle(eyeR_r1, 0.0F, -0.4363F, 0.0F);
        this.eyeR_r1.cubeList.add(new ModelBox(eyeR_r1, 0, 0, -5.25F, -2.25F, -6.5F, 1, 1, 2, 0.0F, false));

        this.eyeL_r1 = new AdvancedModelRenderer(this);
        this.eyeL_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(eyeL_r1);
        this.setRotateAngle(eyeL_r1, 0.0F, 0.4363F, 0.0F);
        this.eyeL_r1.cubeList.add(new ModelBox(eyeL_r1, 0, 3, 4.25F, -2.25F, -6.5F, 1, 1, 2, 0.0F, false));

        this.carapace5_r1 = new AdvancedModelRenderer(this);
        this.carapace5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(carapace5_r1);
        this.setRotateAngle(carapace5_r1, 0.0F, -0.5236F, 0.0F);
        this.carapace5_r1.cubeList.add(new ModelBox(carapace5_r1, 29, 29, -5.25F, -1.99F, -5.25F, 2, 2, 5, 0.0F, false));

        this.carapace4_r1 = new AdvancedModelRenderer(this);
        this.carapace4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(carapace4_r1);
        this.setRotateAngle(carapace4_r1, 0.0F, 0.5236F, 0.0F);
        this.carapace4_r1.cubeList.add(new ModelBox(carapace4_r1, 0, 30, 3.25F, -1.99F, -5.25F, 2, 2, 5, 0.0F, false));

        this.segments = new AdvancedModelRenderer(this);
        this.segments.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.body.addChild(segments);
        this.segments.cubeList.add(new ModelBox(segments, 0, 7, -3.0F, -1.0F, 0.0F, 6, 2, 7, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 0, 22, -2.5F, -1.0F, 7.001F, 5, 2, 6, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 19, 7, -5.5F, -0.25F, 0.0F, 11, 1, 1, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 0, 19, -6.0F, -0.25F, 1.0F, 12, 1, 2, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 0, 16, -6.5F, -0.25F, 9.0F, 13, 1, 2, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 26, 13, -4.5F, -0.25F, 11.0F, 9, 1, 2, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 0, 0, -7.0F, -0.25F, 3.0F, 14, 1, 6, 0.0F, false));

        this.metasoma1 = new AdvancedModelRenderer(this);
        this.metasoma1.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.segments.addChild(metasoma1);
        this.metasoma1.cubeList.add(new ModelBox(metasoma1, 38, 25, -1.99F, -1.01F, 0.0F, 4, 2, 3, 0.0F, false));

        this.metasoma2 = new AdvancedModelRenderer(this);
        this.metasoma2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.metasoma1.addChild(metasoma2);
        this.metasoma2.cubeList.add(new ModelBox(metasoma2, 24, 36, -2.0F, -1.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.metasoma3 = new AdvancedModelRenderer(this);
        this.metasoma3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.metasoma2.addChild(metasoma3);
        this.metasoma3.cubeList.add(new ModelBox(metasoma3, 34, 0, -1.5F, -1.01F, 0.0F, 3, 2, 4, 0.0F, false));

        this.metasoma4 = new AdvancedModelRenderer(this);
        this.metasoma4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.metasoma3.addChild(metasoma4);
        this.metasoma4.cubeList.add(new ModelBox(metasoma4, 10, 34, -1.49F, -1.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.metasoma5 = new AdvancedModelRenderer(this);
        this.metasoma5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.metasoma4.addChild(metasoma5);
        this.metasoma5.cubeList.add(new ModelBox(metasoma5, 30, 16, -1.5F, -1.01F, 0.0F, 3, 2, 4, 0.0F, false));
        this.metasoma5.cubeList.add(new ModelBox(metasoma5, 44, 19, -2.0F, -0.25F, 1.75F, 4, 1, 2, 0.0F, false));

        this.telson = new AdvancedModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.metasoma5.addChild(telson);
        this.telson.cubeList.add(new ModelBox(telson, 20, 47, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 23, 22, -0.5F, -0.5F, 2.0F, 1, 1, 5, 0.0F, false));

        this.tip = new AdvancedModelRenderer(this);
        this.tip.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.telson.addChild(tip);


        this.spine3_r1 = new AdvancedModelRenderer(this);
        this.spine3_r1.setRotationPoint(0.0F, 1.0F, -37.0F);
        this.tip.addChild(spine3_r1);
        this.setRotateAngle(spine3_r1, -0.5236F, 0.0F, 0.0F);
        this.spine3_r1.cubeList.add(new ModelBox(spine3_r1, 12, 60, -0.499F, -19.75F, 31.25F, 1, 1, 3, 0.0F, false));

        this.leg1L = new AdvancedModelRenderer(this);
        this.leg1L.setRotationPoint(0.75F, 0.0F, -7.25F);
        this.body.addChild(leg1L);
        this.setRotateAngle(leg1L, 0.0F, -0.3491F, 0.0F);
        this.leg1L.cubeList.add(new ModelBox(leg1L, 0, 51, -2.0F, 0.499F, -5.0F, 2, 0, 5, 0.0F, false));
        this.leg1L.cubeList.add(new ModelBox(leg1L, 9, 40, 0.0F, 0.001F, -5.0F, 1, 1, 5, 0.0F, false));

        this.leg2L = new AdvancedModelRenderer(this);
        this.leg2L.setRotationPoint(1.5F, 0.0F, -6.0F);
        this.body.addChild(leg2L);
        this.setRotateAngle(leg2L, 0.0F, 0.6981F, 0.3491F);
        this.leg2L.cubeList.add(new ModelBox(leg2L, 35, 43, -1.0F, 0.0F, -1.0F, 5, 1, 2, 0.0F, false));
        this.leg2L.cubeList.add(new ModelBox(leg2L, 44, 13, 0.0F, 0.5F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg2L2 = new AdvancedModelRenderer(this);
        this.leg2L2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leg2L.addChild(leg2L2);
        this.setRotateAngle(leg2L2, 0.0F, 0.3491F, 0.0F);
        this.leg2L2.cubeList.add(new ModelBox(leg2L2, 26, 46, 0.0F, 0.001F, -1.0F, 4, 1, 2, 0.0F, false));
        this.leg2L2.cubeList.add(new ModelBox(leg2L2, 42, 22, 0.0F, 0.501F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg2L3 = new AdvancedModelRenderer(this);
        this.leg2L3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leg2L2.addChild(leg2L3);
        this.setRotateAngle(leg2L3, 0.0F, 0.3491F, 0.0F);
        this.leg2L3.cubeList.add(new ModelBox(leg2L3, 21, 44, 0.0F, 0.5F, -2.5F, 4, 0, 2, 0.0F, false));
        this.leg2L3.cubeList.add(new ModelBox(leg2L3, 0, 49, 0.0F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));

        this.leg3L = new AdvancedModelRenderer(this);
        this.leg3L.setRotationPoint(2.5F, 0.0F, -4.25F);
        this.body.addChild(leg3L);
        this.setRotateAngle(leg3L, 0.0F, 0.3491F, 0.5236F);
        this.leg3L.cubeList.add(new ModelBox(leg3L, 41, 10, -1.0F, 0.0F, -1.0F, 5, 1, 2, 0.0F, false));
        this.leg3L.cubeList.add(new ModelBox(leg3L, 7, 32, 0.0F, 0.5F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg3L2 = new AdvancedModelRenderer(this);
        this.leg3L2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leg3L.addChild(leg3L2);
        this.setRotateAngle(leg3L2, 0.0F, 0.3491F, 0.0F);
        this.leg3L2.cubeList.add(new ModelBox(leg3L2, 46, 3, 0.0F, 0.501F, -3.0F, 3, 0, 2, 0.0F, false));
        this.leg3L2.cubeList.add(new ModelBox(leg3L2, 46, 39, 0.0F, 0.001F, -1.0F, 3, 1, 2, 0.0F, false));

        this.leg3L3 = new AdvancedModelRenderer(this);
        this.leg3L3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg3L2.addChild(leg3L3);
        this.setRotateAngle(leg3L3, 0.0F, 0.3491F, 0.0F);
        this.leg3L3.cubeList.add(new ModelBox(leg3L3, 28, 49, 0.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.leg3L3.cubeList.add(new ModelBox(leg3L3, 0, 44, 0.0F, 0.5F, -2.5F, 3, 0, 2, 0.0F, false));

        this.leg4L = new AdvancedModelRenderer(this);
        this.leg4L.setRotationPoint(2.0F, 0.0F, -2.5F);
        this.body.addChild(leg4L);
        this.setRotateAngle(leg4L, 0.0F, 0.0F, 0.6981F);
        this.leg4L.cubeList.add(new ModelBox(leg4L, 26, 46, 0.0F, 0.0F, -1.0F, 4, 1, 2, 0.0F, false));
        this.leg4L.cubeList.add(new ModelBox(leg4L, 7, 32, 0.0F, 0.5F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg4L2 = new AdvancedModelRenderer(this);
        this.leg4L2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leg4L.addChild(leg4L2);
        this.setRotateAngle(leg4L2, 0.0F, 0.3491F, 0.0F);
        this.leg4L2.cubeList.add(new ModelBox(leg4L2, 46, 3, 0.0F, 0.501F, -3.0F, 3, 0, 2, 0.0F, false));
        this.leg4L2.cubeList.add(new ModelBox(leg4L2, 46, 39, 0.0F, 0.001F, -1.0F, 3, 1, 2, 0.0F, false));

        this.leg4L3 = new AdvancedModelRenderer(this);
        this.leg4L3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg4L2.addChild(leg4L3);
        this.setRotateAngle(leg4L3, 0.0F, 0.3491F, 0.0F);
        this.leg4L3.cubeList.add(new ModelBox(leg4L3, 28, 49, 0.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.leg4L3.cubeList.add(new ModelBox(leg4L3, 0, 44, 0.0F, 0.5F, -2.5F, 3, 0, 2, 0.0F, false));

        this.leg5L = new AdvancedModelRenderer(this);
        this.leg5L.setRotationPoint(4.0F, -0.5F, -1.0F);
        this.body.addChild(leg5L);
        this.setRotateAngle(leg5L, 0.0F, -0.3491F, 0.3491F);
        this.leg5L.cubeList.add(new ModelBox(leg5L, 35, 36, 0.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false));

        this.leg5L2 = new AdvancedModelRenderer(this);
        this.leg5L2.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.leg5L.addChild(leg5L2);
        this.setRotateAngle(leg5L2, 0.0F, -0.2618F, 0.0F);
        this.leg5L2.cubeList.add(new ModelBox(leg5L2, 40, 6, 0.0F, 0.001F, -1.0F, 4, 1, 3, 0.0F, false));

        this.leg5L3 = new AdvancedModelRenderer(this);
        this.leg5L3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leg5L2.addChild(leg5L3);
        this.setRotateAngle(leg5L3, 0.0F, -0.2618F, 0.0F);
        this.leg5L3.cubeList.add(new ModelBox(leg5L3, 0, 40, 0.0F, 0.0F, -1.0F, 4, 1, 3, 0.0F, false));
        this.leg5L3.cubeList.add(new ModelBox(leg5L3, 6, 61, 4.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.leg1R = new AdvancedModelRenderer(this);
        this.leg1R.setRotationPoint(-0.75F, 0.0F, -7.25F);
        this.body.addChild(leg1R);
        this.setRotateAngle(leg1R, 0.0F, 0.3491F, 0.0F);
        this.leg1R.cubeList.add(new ModelBox(leg1R, 16, 41, -1.0F, 0.001F, -5.0F, 1, 1, 5, 0.0F, false));
        this.leg1R.cubeList.add(new ModelBox(leg1R, 4, 51, 0.0F, 0.499F, -5.0F, 2, 0, 5, 0.0F, false));

        this.leg2R = new AdvancedModelRenderer(this);
        this.leg2R.setRotationPoint(-1.5F, 0.0F, -6.0F);
        this.body.addChild(leg2R);
        this.setRotateAngle(leg2R, 0.0F, -0.6981F, -0.3491F);
        this.leg2R.cubeList.add(new ModelBox(leg2R, 23, 41, -4.0F, 0.0F, -1.0F, 5, 1, 2, 0.0F, false));
        this.leg2R.cubeList.add(new ModelBox(leg2R, 41, 34, -4.0F, 0.5F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg2R2 = new AdvancedModelRenderer(this);
        this.leg2R2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.leg2R.addChild(leg2R2);
        this.setRotateAngle(leg2R2, 0.0F, -0.3491F, 0.0F);
        this.leg2R2.cubeList.add(new ModelBox(leg2R2, 0, 46, -4.0F, 0.001F, -1.0F, 4, 1, 2, 0.0F, false));
        this.leg2R2.cubeList.add(new ModelBox(leg2R2, 0, 37, -4.0F, 0.501F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg2R3 = new AdvancedModelRenderer(this);
        this.leg2R3.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.leg2R2.addChild(leg2R3);
        this.setRotateAngle(leg2R3, 0.0F, -0.3491F, 0.0F);
        this.leg2R3.cubeList.add(new ModelBox(leg2R3, 18, 34, -4.0F, 0.5F, -2.5F, 4, 0, 2, 0.0F, false));
        this.leg2R3.cubeList.add(new ModelBox(leg2R3, 37, 48, -4.0F, 0.0F, -0.5F, 4, 1, 1, 0.0F, false));

        this.leg3R = new AdvancedModelRenderer(this);
        this.leg3R.setRotationPoint(-2.5F, 0.0F, -4.25F);
        this.body.addChild(leg3R);
        this.setRotateAngle(leg3R, 0.0F, -0.3491F, -0.5236F);
        this.leg3R.cubeList.add(new ModelBox(leg3R, 40, 16, -4.0F, 0.0F, -1.0F, 5, 1, 2, 0.0F, false));
        this.leg3R.cubeList.add(new ModelBox(leg3R, 28, 25, -4.0F, 0.5F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg3R2 = new AdvancedModelRenderer(this);
        this.leg3R2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.leg3R.addChild(leg3R2);
        this.setRotateAngle(leg3R2, 0.0F, -0.3491F, 0.0F);
        this.leg3R2.cubeList.add(new ModelBox(leg3R2, 18, 36, -3.0F, 0.501F, -3.0F, 3, 0, 2, 0.0F, false));
        this.leg3R2.cubeList.add(new ModelBox(leg3R2, 46, 46, -3.0F, 0.001F, -1.0F, 3, 1, 2, 0.0F, false));

        this.leg3R3 = new AdvancedModelRenderer(this);
        this.leg3R3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg3R2.addChild(leg3R3);
        this.setRotateAngle(leg3R3, 0.0F, -0.3491F, 0.0F);
        this.leg3R3.cubeList.add(new ModelBox(leg3R3, 10, 49, -3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.leg3R3.cubeList.add(new ModelBox(leg3R3, 26, 16, -3.0F, 0.5F, -2.5F, 3, 0, 2, 0.0F, false));

        this.leg4R = new AdvancedModelRenderer(this);
        this.leg4R.setRotationPoint(-2.0F, 0.0F, -2.5F);
        this.body.addChild(leg4R);
        this.setRotateAngle(leg4R, 0.0F, 0.0F, -0.6981F);
        this.leg4R.cubeList.add(new ModelBox(leg4R, 0, 46, -4.0F, 0.0F, -1.0F, 4, 1, 2, 0.0F, false));
        this.leg4R.cubeList.add(new ModelBox(leg4R, 28, 25, -4.0F, 0.5F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg4R2 = new AdvancedModelRenderer(this);
        this.leg4R2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.leg4R.addChild(leg4R2);
        this.setRotateAngle(leg4R2, 0.0F, -0.3491F, 0.0F);
        this.leg4R2.cubeList.add(new ModelBox(leg4R2, 18, 36, -3.0F, 0.501F, -3.0F, 3, 0, 2, 0.0F, false));
        this.leg4R2.cubeList.add(new ModelBox(leg4R2, 46, 46, -3.0F, 0.001F, -1.0F, 3, 1, 2, 0.0F, false));

        this.leg4R3 = new AdvancedModelRenderer(this);
        this.leg4R3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg4R2.addChild(leg4R3);
        this.setRotateAngle(leg4R3, 0.0F, -0.3491F, 0.0F);
        this.leg4R3.cubeList.add(new ModelBox(leg4R3, 10, 49, -3.0F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
        this.leg4R3.cubeList.add(new ModelBox(leg4R3, 26, 16, -3.0F, 0.5F, -2.5F, 3, 0, 2, 0.0F, false));

        this.leg5R = new AdvancedModelRenderer(this);
        this.leg5R.setRotationPoint(-4.0F, -0.5F, -1.0F);
        this.body.addChild(leg5R);
        this.setRotateAngle(leg5R, 0.0F, 0.3491F, -0.3491F);
        this.leg5R.cubeList.add(new ModelBox(leg5R, 30, 22, -6.0F, 0.0F, -1.0F, 6, 1, 2, 0.0F, false));

        this.leg5R2 = new AdvancedModelRenderer(this);
        this.leg5R2.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.leg5R.addChild(leg5R2);
        this.setRotateAngle(leg5R2, 0.0F, 0.2618F, 0.0F);
        this.leg5R2.cubeList.add(new ModelBox(leg5R2, 35, 39, -4.0F, 0.001F, -1.0F, 4, 1, 3, 0.0F, false));

        this.leg5R3 = new AdvancedModelRenderer(this);
        this.leg5R3.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.leg5R2.addChild(leg5R3);
        this.setRotateAngle(leg5R3, 0.0F, 0.2618F, 0.0F);
        this.leg5R3.cubeList.add(new ModelBox(leg5R3, 38, 30, -4.0F, 0.0F, -1.0F, 4, 1, 3, 0.0F, false));
        this.leg5R3.cubeList.add(new ModelBox(leg5R3, 0, 61, -5.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.85F);
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
        this.body.offsetY = 0.0F;

        float speedMultiplier = 1F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speedMultiplier = 1.75F;
        }
        AdvancedModelRenderer[] fishBody = {this.segments, this.metasoma1, this.metasoma2, this.metasoma3, this.metasoma4, this.metasoma5};
        AdvancedModelRenderer[] fishTail = {this.metasoma1, this.metasoma2, this.metasoma3, this.metasoma4, this.metasoma5};
        AdvancedModelRenderer[] fishfinL = {this.leg5L};
        AdvancedModelRenderer[] fishfinR = {this.leg5R};

        //mouthparts:
        this.swing(leg1L, 0.45F, -0.18F, false, 0, -0.1F, f2, 0.6F);
        this.swing(leg1R, 0.45F, 0.18F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.25F * speedMultiplier;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.2F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;

        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F * speedMultiplier;
            tailHdegree = 0.4F;
            tailSwing = 0.25F;
            paddleVdegree = 0.1F;
        }

        if (f3 != 0.0F && e.isInWater()) { //Is moving:
            this.leg2L.rotateAngleY = -0.5F;
            this.leg3L.rotateAngleY = -0.7F;
            this.leg4L.rotateAngleY = -0.8F;

            this.leg2R.rotateAngleY = 0.5F;
            this.leg3R.rotateAngleY = 0.7F;
            this.leg4R.rotateAngleY = 0.8F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
            this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);

            this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            //this.flap(clawbaseL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
            //this.flap(clawbaseR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

            //this.swing(clawL, 0.4F, 0.2F, false, 0, -0.1F, f2, 0.8F);
            //this.swing(clawR, 0.4F, -0.2F, false, 0, 0.1F, f2, 0.8F);

            //this.flap(legL1, speed, 0.2F, false, 3F, 0.5F, f2, 1F);
            //this.flap(legR1, speed, 0.2F, true, 0F, 0.5F, f2, 1F);
            //this.swing(legL1, speed * 2F, 0.3F, false, 0F, 0.4F, f2, 0.8F);
            //this.swing(legR1, speed * 2F, 0.3F, true, 0F, 0.4F, f2, 0.8F);

            if (e.isInWater()) {
                if (!isAtBottom) { //Swimming
                    this.swing(leg2L, speed * 2F, 0.18F, false, 0F, 0.4F, f2, 1F);
                    this.swing(leg3L, speed * 2F, 0.18F, false, 1F, 0.4F, f2, 1F);
                    this.swing(leg4L, speed * 2F, 0.18F, false, 2F, 0.4F, f2, 1F);
                    this.swing(leg2R, speed * 2F, 0.18F, true, 0F, 0.4F, f2, 1F);
                    this.swing(leg3R, speed * 2F, 0.18F, true, 1F, 0.4F, f2, 1F);
                    this.swing(leg4R, speed * 2F, 0.18F, true, 2F, 0.4F, f2, 1F);
                } else { //Walking
                    if (f3 != 0.0F) {
                        this.swing(leg2L, speed * 2F, 0.18F, false, 0F, 0.4F, f2, 1F);
                        this.swing(leg3L, speed * 2F, 0.18F, false, 1F, 0.4F, f2, 1F);
                        this.swing(leg4L, speed * 2F, 0.18F, false, 2F, 0.4F, f2, 1F);
                        this.swing(leg2R, speed * 2F, 0.18F, true, 0F, 0.4F, f2, 1F);
                        this.swing(leg3R, speed * 2F, 0.18F, true, 1F, 0.4F, f2, 1F);
                        this.swing(leg4R, speed * 2F, 0.18F, true, 2F, 0.4F, f2, 1F);
                    }
                }
            }

            //this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!isAtBottom) {
                this.bob(body, -speed * 0.5F, 0.5F, false, f2, 0.8F);
            }
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.0F;
                this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.1F, -2, f2, 1);
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

        animator.rotate(this.body, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.move(this.body, 0F, -5F, 0F);
        animator.rotate(this.segments, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.metasoma1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.metasoma2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.metasoma3, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.metasoma4, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.metasoma5, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.telson, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tip, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(7);
        animator.resetKeyframe(18);
    }
}
