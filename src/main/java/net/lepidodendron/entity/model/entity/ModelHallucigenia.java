package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHallucigenia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelHallucigenia extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer spikeL1;
    private final AdvancedModelRenderer spikeL2;
    private final AdvancedModelRenderer spikeR2;
    private final AdvancedModelRenderer spikeL3;
    private final AdvancedModelRenderer spikeR3;
    private final AdvancedModelRenderer spikeL4;
    private final AdvancedModelRenderer spikeR4;
    private final AdvancedModelRenderer spikeL5;
    private final AdvancedModelRenderer spikeR5;
    private final AdvancedModelRenderer spikeR1;
    private final AdvancedModelRenderer armL3;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer armL1;
    private final AdvancedModelRenderer armR1;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer spikeL6;
    private final AdvancedModelRenderer spikeR6;
    private final AdvancedModelRenderer spikeL7;
    private final AdvancedModelRenderer spikeR7;

    private ModelAnimator animator;

    public ModelHallucigenia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 18.0F, -3.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -2.0F, 0.0F, 2, 2, 13, 0.0F, false));

        this.spikeL1 = new AdvancedModelRenderer(this);
        this.spikeL1.setRotationPoint(-0.25F, -2.0F, 1.25F);
        this.body.addChild(spikeL1);
        this.setRotateAngle(spikeL1, 0.2618F, 0.0F, 0.3491F);
        this.spikeL1.cubeList.add(new ModelBox(spikeL1, 32, 26, 0.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.spikeL1.cubeList.add(new ModelBox(spikeL1, 0, 56, 0.25F, -8.0F, -0.5F, 0, 7, 1, 0.0F, false));

        this.spikeL2 = new AdvancedModelRenderer(this);
        this.spikeL2.setRotationPoint(-0.25F, -2.0F, 3.25F);
        this.body.addChild(spikeL2);
        this.setRotateAngle(spikeL2, 0.0F, 0.0F, 0.3491F);
        this.spikeL2.cubeList.add(new ModelBox(spikeL2, 32, 22, 0.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.spikeL2.cubeList.add(new ModelBox(spikeL2, 0, 56, 0.25F, -8.0F, -0.5F, 0, 7, 1, 0.0F, false));

        this.spikeR2 = new AdvancedModelRenderer(this);
        this.spikeR2.setRotationPoint(0.25F, -2.0F, 3.25F);
        this.body.addChild(spikeR2);
        this.setRotateAngle(spikeR2, 0.0F, 0.0F, -0.3491F);
        this.spikeR2.cubeList.add(new ModelBox(spikeR2, 8, 31, -1.0F, -1.0F, -0.499F, 1, 1, 1, 0.0F, false));
        this.spikeR2.cubeList.add(new ModelBox(spikeR2, 2, 56, -0.25F, -8.0F, -0.499F, 0, 7, 1, 0.0F, false));

        this.spikeL3 = new AdvancedModelRenderer(this);
        this.spikeL3.setRotationPoint(-0.25F, -2.0F, 5.75F);
        this.body.addChild(spikeL3);
        this.setRotateAngle(spikeL3, 0.0F, 0.0F, 0.3491F);
        this.spikeL3.cubeList.add(new ModelBox(spikeL3, 31, 31, 0.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.spikeL3.cubeList.add(new ModelBox(spikeL3, 0, 56, 0.25F, -8.0F, -0.5F, 0, 7, 1, 0.0F, false));

        this.spikeR3 = new AdvancedModelRenderer(this);
        this.spikeR3.setRotationPoint(0.25F, -2.0F, 5.75F);
        this.body.addChild(spikeR3);
        this.setRotateAngle(spikeR3, 0.0F, 0.0F, -0.3491F);
        this.spikeR3.cubeList.add(new ModelBox(spikeR3, 4, 31, -1.0F, -1.0F, -0.499F, 1, 1, 1, 0.0F, false));
        this.spikeR3.cubeList.add(new ModelBox(spikeR3, 2, 56, -0.25F, -8.0F, -0.499F, 0, 7, 1, 0.0F, false));

        this.spikeL4 = new AdvancedModelRenderer(this);
        this.spikeL4.setRotationPoint(-0.25F, -2.0F, 8.25F);
        this.body.addChild(spikeL4);
        this.setRotateAngle(spikeL4, -0.0436F, 0.0F, 0.3491F);
        this.spikeL4.cubeList.add(new ModelBox(spikeL4, 31, 29, 0.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.spikeL4.cubeList.add(new ModelBox(spikeL4, 0, 56, 0.25F, -8.0F, -0.5F, 0, 7, 1, 0.0F, false));

        this.spikeR4 = new AdvancedModelRenderer(this);
        this.spikeR4.setRotationPoint(0.25F, -2.0F, 8.25F);
        this.body.addChild(spikeR4);
        this.setRotateAngle(spikeR4, -0.0436F, 0.0F, -0.3491F);
        this.spikeR4.cubeList.add(new ModelBox(spikeR4, 0, 31, -1.0F, -1.0F, -0.499F, 1, 1, 1, 0.0F, false));
        this.spikeR4.cubeList.add(new ModelBox(spikeR4, 2, 56, -0.25F, -8.0F, -0.499F, 0, 7, 1, 0.0F, false));

        this.spikeL5 = new AdvancedModelRenderer(this);
        this.spikeL5.setRotationPoint(-0.25F, -2.0F, 10.75F);
        this.body.addChild(spikeL5);
        this.setRotateAngle(spikeL5, -0.0873F, 0.0F, 0.3491F);
        this.spikeL5.cubeList.add(new ModelBox(spikeL5, 12, 31, 0.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.spikeL5.cubeList.add(new ModelBox(spikeL5, 0, 56, 0.25F, -8.0F, -0.5F, 0, 7, 1, 0.0F, false));

        this.spikeR5 = new AdvancedModelRenderer(this);
        this.spikeR5.setRotationPoint(0.25F, -2.0F, 10.75F);
        this.body.addChild(spikeR5);
        this.setRotateAngle(spikeR5, -0.0873F, 0.0F, -0.3491F);
        this.spikeR5.cubeList.add(new ModelBox(spikeR5, 28, 30, -1.0F, -1.0F, -0.499F, 1, 1, 1, 0.0F, false));
        this.spikeR5.cubeList.add(new ModelBox(spikeR5, 2, 56, -0.25F, -8.0F, -0.499F, 0, 7, 1, 0.0F, false));

        this.spikeR1 = new AdvancedModelRenderer(this);
        this.spikeR1.setRotationPoint(0.25F, -2.0F, 1.25F);
        this.body.addChild(spikeR1);
        this.setRotateAngle(spikeR1, 0.2618F, 0.0F, -0.3491F);
        this.spikeR1.cubeList.add(new ModelBox(spikeR1, 32, 24, -1.0F, -1.0F, -0.499F, 1, 1, 1, 0.0F, false));
        this.spikeR1.cubeList.add(new ModelBox(spikeR1, 2, 56, -0.25F, -8.0F, -0.499F, 0, 7, 1, 0.0F, false));

        this.armL3 = new AdvancedModelRenderer(this);
        this.armL3.setRotationPoint(0.6F, -0.5F, 1.0F);
        this.body.addChild(armL3);
        this.setRotateAngle(armL3, -0.2618F, 0.0F, -0.3491F);
        this.armL3.cubeList.add(new ModelBox(armL3, 4, 3, 0.0F, -0.5F, -1.75F, 0, 8, 2, 0.0F, false));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(-0.6F, -0.5F, 1.0F);
        this.body.addChild(armR3);
        this.setRotateAngle(armR3, -0.2618F, 0.0F, 0.3491F);
        this.armR3.cubeList.add(new ModelBox(armR3, 0, 3, 0.0F, -0.5F, -1.75F, 0, 8, 2, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.75F, -0.5F, 3.25F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.0F, -0.2618F);
        this.legL1.cubeList.add(new ModelBox(legL1, 30, 8, -0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, -0.5F, 5.75F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, -0.2618F);
        this.legL2.cubeList.add(new ModelBox(legL2, 29, 0, -0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.75F, -0.5F, 8.25F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, -0.2618F);
        this.legL3.cubeList.add(new ModelBox(legL3, 28, 22, -0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.75F, -0.5F, 10.75F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, -0.2618F);
        this.legL4.cubeList.add(new ModelBox(legL4, 25, 0, -0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.75F, -0.5F, 3.25F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, 0.0F, 0.2618F);
        this.legR1.cubeList.add(new ModelBox(legR1, 12, 23, -0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.75F, -0.5F, 5.75F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.2618F);
        this.legR2.cubeList.add(new ModelBox(legR2, 8, 23, -0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.75F, -0.5F, 8.25F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.2618F);
        this.legR3.cubeList.add(new ModelBox(legR3, 4, 23, -0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.75F, -0.5F, 10.75F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, 0.2618F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 23, -0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0F, 0.25F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 16, 15, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -5.9F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -0.75F, -4.0F, 2, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 7, 0, -0.99F, -0.5F, -1.0F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 37, -1.25F, -0.76F, -3.0F, 1, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 37, 0.25F, -0.76F, -3.0F, 1, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 38, -0.5F, -0.25F, -4.01F, 1, 1, 0, 0.0F, false));

        this.armL1 = new AdvancedModelRenderer(this);
        this.armL1.setRotationPoint(0.35F, 0.5F, -2.25F);
        this.neck.addChild(armL1);
        this.setRotateAngle(armL1, -0.4363F, 0.0F, -0.1745F);
        this.armL1.cubeList.add(new ModelBox(armL1, 20, 20, 0.0F, -0.5F, -1.75F, 0, 8, 2, 0.0F, false));

        this.armR1 = new AdvancedModelRenderer(this);
        this.armR1.setRotationPoint(-0.35F, 0.5F, -2.25F);
        this.neck.addChild(armR1);
        this.setRotateAngle(armR1, -0.4363F, 0.0F, 0.1745F);
        this.armR1.cubeList.add(new ModelBox(armR1, 17, 0, 0.0F, -0.5F, -1.75F, 0, 8, 2, 0.0F, false));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(0.35F, 0.5F, -0.75F);
        this.neck.addChild(armL2);
        this.setRotateAngle(armL2, -0.4363F, 0.0F, -0.2182F);
        this.armL2.cubeList.add(new ModelBox(armL2, 16, 20, 0.0F, -0.5F, -1.75F, 0, 8, 2, 0.0F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(-0.35F, 0.5F, -0.75F);
        this.neck.addChild(armR2);
        this.setRotateAngle(armR2, -0.4363F, 0.0F, 0.2182F);
        this.armR2.cubeList.add(new ModelBox(armR2, 8, 3, 0.0F, -0.5F, -1.75F, 0, 8, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.75F, 13.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.4363F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 15, -0.99F, -0.25F, 0.0F, 2, 2, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 30, 16, -0.49F, 0.5F, 5.5F, 1, 1, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.75F, 0.75F, 1.0F);
        this.tail.addChild(legL5);
        this.setRotateAngle(legL5, 0.4363F, 0.0F, -0.2618F);
        this.legL5.cubeList.add(new ModelBox(legL5, 24, 22, -0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.75F, 0.75F, 1.0F);
        this.tail.addChild(legR5);
        this.setRotateAngle(legR5, 0.4363F, 0.0F, 0.2618F);
        this.legR5.cubeList.add(new ModelBox(legR5, 21, 0, -0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(0.75F, 1.25F, 4.5F);
        this.tail.addChild(legL6);
        this.setRotateAngle(legL6, 0.4363F, 0.0F, -0.2618F);
        this.legL6.cubeList.add(new ModelBox(legL6, 10, 15, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-0.75F, 1.25F, 4.5F);
        this.tail.addChild(legR6);
        this.setRotateAngle(legR6, 0.4363F, 0.0F, 0.2618F);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 15, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.75F, 1.5F, 6.0F);
        this.tail.addChild(legL7);
        this.setRotateAngle(legL7, 0.6981F, 0.0F, -0.2618F);
        this.legL7.cubeList.add(new ModelBox(legL7, 25, 8, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.75F, 1.5F, 6.0F);
        this.tail.addChild(legR7);
        this.setRotateAngle(legR7, 0.6981F, 0.0F, 0.2618F);
        this.legR7.cubeList.add(new ModelBox(legR7, 21, 8, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.spikeL6 = new AdvancedModelRenderer(this);
        this.spikeL6.setRotationPoint(-0.25F, -0.25F, 0.5F);
        this.tail.addChild(spikeL6);
        this.setRotateAngle(spikeL6, -0.1745F, 0.0F, 0.3491F);
        this.spikeL6.cubeList.add(new ModelBox(spikeL6, 30, 20, 0.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.spikeL6.cubeList.add(new ModelBox(spikeL6, 0, 56, 0.25F, -8.0F, -0.5F, 0, 7, 1, 0.0F, false));

        this.spikeR6 = new AdvancedModelRenderer(this);
        this.spikeR6.setRotationPoint(0.25F, -0.25F, 0.5F);
        this.tail.addChild(spikeR6);
        this.setRotateAngle(spikeR6, -0.1745F, 0.0F, -0.3491F);
        this.spikeR6.cubeList.add(new ModelBox(spikeR6, 17, 10, -1.0F, -1.0F, -0.49F, 1, 1, 1, 0.0F, false));
        this.spikeR6.cubeList.add(new ModelBox(spikeR6, 2, 56, -0.25F, -8.0F, -0.49F, 0, 7, 1, 0.0F, false));

        this.spikeL7 = new AdvancedModelRenderer(this);
        this.spikeL7.setRotationPoint(-0.25F, -0.25F, 3.75F);
        this.tail.addChild(spikeL7);
        this.setRotateAngle(spikeL7, -0.3491F, 0.0F, 0.3491F);
        this.spikeL7.cubeList.add(new ModelBox(spikeL7, 30, 18, 0.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.spikeL7.cubeList.add(new ModelBox(spikeL7, 0, 56, 0.25F, -8.0F, -0.5F, 0, 7, 1, 0.0F, false));

        this.spikeR7 = new AdvancedModelRenderer(this);
        this.spikeR7.setRotationPoint(0.25F, -0.25F, 3.75F);
        this.tail.addChild(spikeR7);
        this.setRotateAngle(spikeR7, -0.3491F, 0.0F, -0.3491F);
        this.spikeR7.cubeList.add(new ModelBox(spikeR7, 17, 0, -1.0F, -1.0F, -0.499F, 1, 1, 1, 0.0F, false));
        this.spikeR7.cubeList.add(new ModelBox(spikeR7, 2, 56, -0.25F, -8.0F, -0.499F, 0, 7, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.12F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.render(0.007F);
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
        this.body.offsetY = 1.320F;

        AdvancedModelRenderer[] bodyF = {this.neck, this.head};
        AdvancedModelRenderer[] bodyB = {this.body, this.tail};

        EntityPrehistoricFloraHallucigenia ee = (EntityPrehistoricFloraHallucigenia) e;

        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.faceTarget(f3, f4, 6, head);
            this.faceTarget(f3, f4, 10, body);
        }

        float legFlapDegree = 0.3F;
        float legWalkDegree = 0.5F;
        float legSpeed = 0.23F;
        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.flap(legL1, legSpeed, -legFlapDegree, false, 0, -legFlapDegree, f2, 0.3F);
            this.flap(legR1, legSpeed, legFlapDegree, false, 2F, legFlapDegree, f2, 0.3F);
            this.flap(legL2, legSpeed, -legFlapDegree, false, 2.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR2, legSpeed, legFlapDegree, false, 4.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL3, legSpeed, -legFlapDegree, false, 4.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR3, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL4, legSpeed, -legFlapDegree, false, 6.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR4, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.flap(legL5, legSpeed, -legFlapDegree, false, 8.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR5, legSpeed, legFlapDegree, false, 10.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL6, legSpeed * 1.1F, -legFlapDegree, false, 10.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR6, legSpeed * 1.1F, legFlapDegree, false, 12.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL7, legSpeed * 1.2F, -legFlapDegree, false, 12.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR7, legSpeed * 1.2F, legFlapDegree, false, 14.0F, legFlapDegree, f2, 0.3F);
        }

        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.walk(legL1, legSpeed, -legWalkDegree, false, 0, -legWalkDegree, f2, 0.3F);
            this.walk(legR1, legSpeed, legWalkDegree, false, 2F, legWalkDegree, f2, 0.3F);
            this.walk(legL2, legSpeed, -legWalkDegree, false, 2.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR2, legSpeed, legWalkDegree, false, 4.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL3, legSpeed, -legWalkDegree, false, 4.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR3, legSpeed, legWalkDegree, false, 6.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL4, legSpeed, -legWalkDegree, false, 6.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR4, legSpeed, legWalkDegree, false, 8.0F, legWalkDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.walk(legL5, legSpeed, -legWalkDegree, false, 8.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR5, legSpeed, legWalkDegree, false, 10.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL6, legSpeed * 1.1F, -legWalkDegree * 1.1F, false, 10.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR6, legSpeed * 1.1F, legWalkDegree * 1.1F, false, 12.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL7, legSpeed * 1.2F, -legWalkDegree * 1.2F, false, 12.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR7, legSpeed * 1.2F, legWalkDegree * 1.2F, false, 14.0F, legWalkDegree, f2, 0.3F);
        }

        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.bob(body, 1F, 0.05F, false, f2, 1);
        }
        //this.walk(body6, 0.8F, -0.010f, false, 2, 0.15F, f2, 0.8F);

        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.chainWave(bodyF, legSpeed * 1.25F, 0.4f, -0.8F, f2, 0.4F);
            this.chainSwing(bodyF, legSpeed * 1.25F, 0.25F, 0.8F, f2, 0.45F);
        }

        this.chainSwing(bodyB, 0.085F, 0.25f, 0.1, f2, 0.15F);

        this.walk(armL1, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armL1, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);
        this.swing(armL1, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);

        this.walk(armL2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armL2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);
        this.swing(armL2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);

        this.walk(armL3, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 2.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armL3, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 2.0F, -legWalkDegree, f2, 0.3F);
        this.swing(armL3, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 2.0F, -legWalkDegree, f2, 0.3F);


        this.walk(armR1, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armR1, legSpeed * 1.1F, legWalkDegree * 1.4F, false, 0.0F, legWalkDegree, f2, 0.3F);
        this.swing(armR1, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 0.0F, -legWalkDegree, f2, 0.3F);

        this.walk(armR2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armR2, legSpeed * 1.1F, legWalkDegree * 1.4F, false, 1.0F, legWalkDegree, f2, 0.3F);
        this.swing(armR2, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 1.0F, -legWalkDegree, f2, 0.3F);

        this.walk(armR3, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 2.0F, -legWalkDegree, f2, 0.3F);
        this.flap(armR3, legSpeed * 1.1F, legWalkDegree * 1.4F, false, 2.0F, legWalkDegree, f2, 0.3F);
        this.swing(armR3, legSpeed * 1.1F, -legWalkDegree * 1.4F, false, 2.0F, -legWalkDegree, f2, 0.3F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHallucigenia e = (EntityPrehistoricFloraHallucigenia) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.LOOK_ANIMATION);
        animator.startKeyframe(30);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(15);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(12.5), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(7.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(7.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(15);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(-12.5), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(-7.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(-7.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(15);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(12.5), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(7.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(7.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(15);
        animator.move(this.body, 0,-1.5F,0);
        animator.rotate(this.tail, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-17.5), (float) Math.toRadians(-12.5), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-17.5), (float) Math.toRadians(-7.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(20), (float) Math.toRadians(-7.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(30);
    }
}
