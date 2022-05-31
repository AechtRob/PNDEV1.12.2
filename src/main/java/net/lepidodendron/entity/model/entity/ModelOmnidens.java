package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOmnidens;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOmnidens extends AdvancedModelBase {
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer finL6;
    private final AdvancedModelRenderer finR6;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer finL5;
    private final AdvancedModelRenderer finR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer finL4;
    private final AdvancedModelRenderer finR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer finL3;
    private final AdvancedModelRenderer finR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer finR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer finL1;
    private final AdvancedModelRenderer finR1;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer toothplates;
    private final AdvancedModelRenderer toothplate1;
    private final AdvancedModelRenderer toothplate2;
    private final AdvancedModelRenderer toothplate3;
    private final AdvancedModelRenderer toothplate4;
    private final AdvancedModelRenderer toothplate5;
    private final AdvancedModelRenderer toothplate6;
    private final AdvancedModelRenderer toothplate7;
    private final AdvancedModelRenderer toothplate8;
    private final AdvancedModelRenderer toothplate9;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer appendageL1;
    private final AdvancedModelRenderer appendageL2;
    private final AdvancedModelRenderer appendageLhair1;
    private final AdvancedModelRenderer appendageLhair2;
    private final AdvancedModelRenderer appendageLhair3;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer appendageR1;
    private final AdvancedModelRenderer appendageR2;
    private final AdvancedModelRenderer appendageRhair1;
    private final AdvancedModelRenderer appendageRhair2;
    private final AdvancedModelRenderer appendageRhair3;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer finL7;
    private final AdvancedModelRenderer finR7;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer finL8;
    private final AdvancedModelRenderer finR8;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer finL9;
    private final AdvancedModelRenderer finR9;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer finL10;
    private final AdvancedModelRenderer finR10;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer finL11;
    private final AdvancedModelRenderer finR11;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer tailL;
    private final AdvancedModelRenderer tailR;

    private ModelAnimator animator;

    public ModelOmnidens() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 20.0F, 19.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 23, -5.99F, -1.99F, 0.0F, 12, 4, 5, 0.0F, false));

        this.finL6 = new AdvancedModelRenderer(this);
        this.finL6.setRotationPoint(6.0F, -0.5F, 3.0F);
        this.body6.addChild(finL6);
        this.finL6.cubeList.add(new ModelBox(finL6, 35, 19, -0.5F, 0.0F, -2.99F, 12, 1, 5, 0.0F, false));

        this.finR6 = new AdvancedModelRenderer(this);
        this.finR6.setRotationPoint(-6.0F, -0.5F, 3.0F);
        this.body6.addChild(finR6);
        this.finR6.cubeList.add(new ModelBox(finR6, 0, 35, -11.5F, 0.0F, -2.99F, 12, 1, 5, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(4.5F, -0.1F, 2.5F);
        this.body6.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, 0.4363F);
        this.legL6.cubeList.add(new ModelBox(legL6, 20, 48, 0.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-4.5F, -0.1F, 2.5F);
        this.body6.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, -0.4363F);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 48, -8.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body6.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 23, -6.0F, -2.01F, -5.0F, 12, 4, 5, 0.0F, false));

        this.finL5 = new AdvancedModelRenderer(this);
        this.finL5.setRotationPoint(6.0F, -0.5F, -2.0F);
        this.body5.addChild(finL5);
        this.finL5.cubeList.add(new ModelBox(finL5, 35, 19, -1.0F, 0.01F, -2.99F, 12, 1, 5, 0.0F, false));

        this.finR5 = new AdvancedModelRenderer(this);
        this.finR5.setRotationPoint(-6.0F, -0.5F, -2.0F);
        this.body5.addChild(finR5);
        this.finR5.cubeList.add(new ModelBox(finR5, 0, 35, -11.0F, 0.01F, -2.99F, 12, 1, 5, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(4.5F, -0.1F, -2.5F);
        this.body5.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.4363F);
        this.legL5.cubeList.add(new ModelBox(legL5, 20, 48, 0.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-4.5F, -0.1F, -2.5F);
        this.body5.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.4363F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 48, -8.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.body5.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 23, -5.99F, -1.99F, -5.0F, 12, 4, 5, 0.0F, false));

        this.finL4 = new AdvancedModelRenderer(this);
        this.finL4.setRotationPoint(6.0F, -0.5F, -2.0F);
        this.body4.addChild(finL4);
        this.finL4.cubeList.add(new ModelBox(finL4, 35, 19, -1.5F, 0.0F, -2.99F, 12, 1, 5, 0.0F, false));

        this.finR4 = new AdvancedModelRenderer(this);
        this.finR4.setRotationPoint(-6.0F, -0.5F, -2.0F);
        this.body4.addChild(finR4);
        this.finR4.cubeList.add(new ModelBox(finR4, 0, 35, -10.5F, 0.0F, -2.99F, 12, 1, 5, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(4.0F, -0.1F, -2.5F);
        this.body4.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.4363F);
        this.legL4.cubeList.add(new ModelBox(legL4, 20, 48, 0.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-4.0F, -0.1F, -2.5F);
        this.body4.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.4363F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 48, -8.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.body4.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 23, -6.0F, -2.01F, -5.0F, 12, 4, 5, 0.0F, false));

        this.finL3 = new AdvancedModelRenderer(this);
        this.finL3.setRotationPoint(6.0F, -0.5F, -2.0F);
        this.body3.addChild(finL3);
        this.finL3.cubeList.add(new ModelBox(finL3, 35, 19, -2.0F, 0.01F, -2.99F, 12, 1, 5, 0.0F, false));

        this.finR3 = new AdvancedModelRenderer(this);
        this.finR3.setRotationPoint(-6.0F, -0.5F, -2.0F);
        this.body3.addChild(finR3);
        this.finR3.cubeList.add(new ModelBox(finR3, 0, 35, -10.0F, 0.01F, -2.99F, 12, 1, 5, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(3.5F, -0.1F, -2.5F);
        this.body3.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.4363F);
        this.legL3.cubeList.add(new ModelBox(legL3, 20, 48, 0.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-3.5F, -0.1F, -2.5F);
        this.body3.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.4363F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 48, -8.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.body3.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 23, -5.99F, -1.99F, -5.0F, 12, 4, 5, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(6.0F, -0.5F, -2.0F);
        this.body2.addChild(finL2);
        this.finL2.cubeList.add(new ModelBox(finL2, 35, 19, -2.75F, 0.0F, -2.99F, 12, 1, 5, 0.0F, false));

        this.finR2 = new AdvancedModelRenderer(this);
        this.finR2.setRotationPoint(-6.0F, -0.5F, -2.0F);
        this.body2.addChild(finR2);
        this.finR2.cubeList.add(new ModelBox(finR2, 0, 35, -9.25F, 0.0F, -2.99F, 12, 1, 5, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(3.0F, -0.1F, -2.5F);
        this.body2.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.4363F);
        this.legL2.cubeList.add(new ModelBox(legL2, 20, 48, 0.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-3.0F, -0.1F, -2.5F);
        this.body2.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.4363F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 48, -8.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.body2.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 23, -6.0F, -2.01F, -5.0F, 12, 4, 5, 0.0F, false));

        this.finL1 = new AdvancedModelRenderer(this);
        this.finL1.setRotationPoint(6.0F, -0.5F, -2.0F);
        this.body1.addChild(finL1);
        this.finL1.cubeList.add(new ModelBox(finL1, 35, 19, -4.0F, 0.01F, -2.99F, 12, 1, 5, 0.0F, false));

        this.finR1 = new AdvancedModelRenderer(this);
        this.finR1.setRotationPoint(-6.0F, -0.5F, -2.0F);
        this.body1.addChild(finR1);
        this.finR1.cubeList.add(new ModelBox(finR1, 0, 35, -8.0F, 0.01F, -2.99F, 12, 1, 5, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(2.5F, -0.1F, -2.5F);
        this.body1.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.0F, 0.4363F);
        this.legL1.cubeList.add(new ModelBox(legL1, 20, 48, 0.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-2.5F, -0.1F, -2.5F);
        this.body1.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, 0.0F, -0.4363F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 48, -8.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.body1.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 52, 2.5F, 1.5F, -3.5F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 10, -5.5F, -2.0F, -9.0F, 11, 4, 9, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 52, -4.5F, 1.5F, -3.5F, 2, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.5F, -1.5F, -9.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 6, -3.0F, 0.0F, -2.75F, 1, 0, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.5F, -1.5F, -9.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 23, 2.0F, 0.0F, -2.75F, 1, 0, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.5F, -1.5F, -9.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 3, -1.65F, 0.0F, -2.5F, 1, 0, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.5F, -1.5F, -9.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 23, 0.65F, 0.0F, -2.5F, 1, 0, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.5F, -1.5F, -9.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.25F, 0.0F, -2.5F, 1, 0, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.5F, -1.5F, -9.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 35, -0.75F, 0.0F, -2.5F, 1, 0, 3, 0.0F, false));

        this.toothplates = new AdvancedModelRenderer(this);
        this.toothplates.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.head.addChild(toothplates);


        this.toothplate1 = new AdvancedModelRenderer(this);
        this.toothplate1.setRotationPoint(0.0F, 0.0F, -5.75F);
        this.toothplates.addChild(toothplate1);
        this.setRotateAngle(toothplate1, -0.2618F, 0.0F, 0.0F);
        this.toothplate1.cubeList.add(new ModelBox(toothplate1, 33, 14, -0.5F, 0.01F, -0.5F, 1, 0, 2, 0.0F, false));

        this.toothplate2 = new AdvancedModelRenderer(this);
        this.toothplate2.setRotationPoint(1.25F, 0.0F, -5.5F);
        this.toothplates.addChild(toothplate2);
        this.setRotateAngle(toothplate2, -0.2618F, -0.3491F, 0.0F);
        this.toothplate2.cubeList.add(new ModelBox(toothplate2, 31, 14, -0.5F, 0.01F, -0.5F, 1, 0, 2, 0.0F, false));

        this.toothplate3 = new AdvancedModelRenderer(this);
        this.toothplate3.setRotationPoint(-1.25F, 0.0F, -5.5F);
        this.toothplates.addChild(toothplate3);
        this.setRotateAngle(toothplate3, -0.2618F, 0.3491F, 0.0F);
        this.toothplate3.cubeList.add(new ModelBox(toothplate3, 29, 14, -0.5F, 0.01F, -0.5F, 1, 0, 2, 0.0F, false));

        this.toothplate4 = new AdvancedModelRenderer(this);
        this.toothplate4.setRotationPoint(-2.25F, 0.0F, -4.25F);
        this.toothplates.addChild(toothplate4);
        this.setRotateAngle(toothplate4, -0.2618F, 1.0472F, 0.0F);
        this.toothplate4.cubeList.add(new ModelBox(toothplate4, 0, 26, -0.5F, 0.01F, -0.5F, 1, 0, 2, 0.0F, false));

        this.toothplate5 = new AdvancedModelRenderer(this);
        this.toothplate5.setRotationPoint(2.25F, 0.0F, -4.25F);
        this.toothplates.addChild(toothplate5);
        this.setRotateAngle(toothplate5, -0.2618F, -1.0472F, 0.0F);
        this.toothplate5.cubeList.add(new ModelBox(toothplate5, 0, 17, -0.5F, 0.01F, -0.5F, 1, 0, 2, 0.0F, false));

        this.toothplate6 = new AdvancedModelRenderer(this);
        this.toothplate6.setRotationPoint(2.5F, 0.0F, -3.0F);
        this.toothplates.addChild(toothplate6);
        this.setRotateAngle(toothplate6, -0.2618F, -1.3963F, 0.0F);
        this.toothplate6.cubeList.add(new ModelBox(toothplate6, 0, 15, -0.5F, 0.01F, -0.5F, 1, 0, 2, 0.0F, false));

        this.toothplate7 = new AdvancedModelRenderer(this);
        this.toothplate7.setRotationPoint(-2.5F, 0.0F, -3.0F);
        this.toothplates.addChild(toothplate7);
        this.setRotateAngle(toothplate7, -0.2618F, 1.3963F, 0.0F);
        this.toothplate7.cubeList.add(new ModelBox(toothplate7, 0, 13, -0.5F, 0.01F, -0.5F, 1, 0, 2, 0.0F, false));

        this.toothplate8 = new AdvancedModelRenderer(this);
        this.toothplate8.setRotationPoint(-2.0F, 0.0F, -1.75F);
        this.toothplates.addChild(toothplate8);
        this.setRotateAngle(toothplate8, -0.2618F, 2.0071F, 0.0F);
        this.toothplate8.cubeList.add(new ModelBox(toothplate8, 0, 11, -0.5F, 0.01F, -0.5F, 1, 0, 2, 0.0F, false));

        this.toothplate9 = new AdvancedModelRenderer(this);
        this.toothplate9.setRotationPoint(2.0F, 0.0F, -1.75F);
        this.toothplates.addChild(toothplate9);
        this.setRotateAngle(toothplate9, -0.2618F, -2.0071F, 0.0F);
        this.toothplate9.cubeList.add(new ModelBox(toothplate9, 0, 9, -0.5F, 0.01F, -0.5F, 1, 0, 2, 0.0F, false));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(5.0F, 0.0F, -4.5F);
        this.head.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.0F, 0.1745F, 0.1309F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 31, 10, -2.0F, -1.5F, -3.0F, 10, 3, 6, 0.0F, false));
        this.appendageL.cubeList.add(new ModelBox(appendageL, 50, 49, 2.0F, -1.0F, -7.0F, 1, 0, 4, 0.0F, false));
        this.appendageL.cubeList.add(new ModelBox(appendageL, 29, 35, 2.0F, 1.0F, -7.0F, 1, 0, 4, 0.0F, false));
        this.appendageL.cubeList.add(new ModelBox(appendageL, 50, 25, 5.0F, -1.0F, -7.0F, 1, 0, 4, 0.0F, false));
        this.appendageL.cubeList.add(new ModelBox(appendageL, 27, 35, 5.0F, 1.0F, -7.0F, 1, 0, 4, 0.0F, false));

        this.appendageL1 = new AdvancedModelRenderer(this);
        this.appendageL1.setRotationPoint(8.0F, 0.0F, -0.25F);
        this.appendageL.addChild(appendageL1);
        this.setRotateAngle(appendageL1, 0.0F, 0.3491F, 0.0F);
        this.appendageL1.cubeList.add(new ModelBox(appendageL1, 0, 41, -1.0F, -1.0F, -2.5F, 9, 2, 5, 0.0F, false));
        this.appendageL1.cubeList.add(new ModelBox(appendageL1, 33, 35, 1.0F, -0.75F, -6.0F, 1, 0, 4, 0.0F, false));
        this.appendageL1.cubeList.add(new ModelBox(appendageL1, 25, 35, 1.0F, 0.75F, -6.0F, 1, 0, 4, 0.0F, false));
        this.appendageL1.cubeList.add(new ModelBox(appendageL1, 31, 35, 3.75F, -0.75F, -6.0F, 1, 0, 4, 0.0F, false));
        this.appendageL1.cubeList.add(new ModelBox(appendageL1, 31, 10, 3.75F, 0.75F, -6.0F, 1, 0, 4, 0.0F, false));
        this.appendageL1.cubeList.add(new ModelBox(appendageL1, 51, 29, 6.5F, -0.75F, -5.0F, 1, 0, 3, 0.0F, false));
        this.appendageL1.cubeList.add(new ModelBox(appendageL1, 49, 45, 6.5F, 0.75F, -5.0F, 1, 0, 3, 0.0F, false));

        this.appendageL2 = new AdvancedModelRenderer(this);
        this.appendageL2.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.appendageL1.addChild(appendageL2);
        this.setRotateAngle(appendageL2, 0.0F, 0.3491F, -0.0436F);
        this.appendageL2.cubeList.add(new ModelBox(appendageL2, 51, 45, -1.0F, -0.5F, -1.5F, 4, 1, 3, 0.0F, false));

        this.appendageLhair1 = new AdvancedModelRenderer(this);
        this.appendageLhair1.setRotationPoint(3.0F, -0.35F, 0.0F);
        this.appendageL2.addChild(appendageLhair1);
        this.setRotateAngle(appendageLhair1, 0.0F, 0.7854F, 0.0F);
        this.appendageLhair1.cubeList.add(new ModelBox(appendageLhair1, 25, 45, 0.0F, 0.0F, -2.5F, 12, 0, 3, 0.0F, false));

        this.appendageLhair2 = new AdvancedModelRenderer(this);
        this.appendageLhair2.setRotationPoint(3.0F, 0.4F, 1.0F);
        this.appendageL2.addChild(appendageLhair2);
        this.setRotateAngle(appendageLhair2, 0.0F, 0.2182F, 0.0F);
        this.appendageLhair2.cubeList.add(new ModelBox(appendageLhair2, 44, 42, 0.0F, 0.0F, -2.5F, 12, 0, 3, 0.0F, false));

        this.appendageLhair3 = new AdvancedModelRenderer(this);
        this.appendageLhair3.setRotationPoint(3.0F, 0.05F, 0.5F);
        this.appendageL2.addChild(appendageLhair3);
        this.setRotateAngle(appendageLhair3, 0.0F, 0.3927F, 0.0F);
        this.appendageLhair3.cubeList.add(new ModelBox(appendageLhair3, 0, 5, 0.0F, 0.0F, -4.5F, 24, 0, 5, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-5.0F, 0.0F, -4.5F);
        this.head.addChild(appendageR);
        this.setRotateAngle(appendageR, 0.0F, -0.1745F, -0.1309F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 28, 26, -8.0F, -1.5F, -3.0F, 10, 3, 6, 0.0F, false));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 2, 14, -3.0F, -1.0F, -7.0F, 1, 0, 4, 0.0F, false));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 0, 14, -3.0F, 1.0F, -7.0F, 1, 0, 4, 0.0F, false));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 2, 10, -6.0F, -1.0F, -7.0F, 1, 0, 4, 0.0F, false));
        this.appendageR.cubeList.add(new ModelBox(appendageR, 0, 10, -6.0F, 1.0F, -7.0F, 1, 0, 4, 0.0F, false));

        this.appendageR1 = new AdvancedModelRenderer(this);
        this.appendageR1.setRotationPoint(-8.0F, 0.0F, -0.25F);
        this.appendageR.addChild(appendageR1);
        this.setRotateAngle(appendageR1, 0.0F, -0.3491F, 0.0F);
        this.appendageR1.cubeList.add(new ModelBox(appendageR1, 34, 35, -8.0F, -1.0F, -2.5F, 9, 2, 5, 0.0F, false));
        this.appendageR1.cubeList.add(new ModelBox(appendageR1, 29, 10, -2.0F, -0.75F, -6.0F, 1, 0, 4, 0.0F, false));
        this.appendageR1.cubeList.add(new ModelBox(appendageR1, 27, 23, -2.0F, 0.75F, -6.0F, 1, 0, 4, 0.0F, false));
        this.appendageR1.cubeList.add(new ModelBox(appendageR1, 27, 10, -4.75F, -0.75F, -6.0F, 1, 0, 4, 0.0F, false));
        this.appendageR1.cubeList.add(new ModelBox(appendageR1, 25, 23, -4.75F, 0.75F, -6.0F, 1, 0, 4, 0.0F, false));
        this.appendageR1.cubeList.add(new ModelBox(appendageR1, 37, 48, -7.5F, -0.75F, -5.0F, 1, 0, 3, 0.0F, false));
        this.appendageR1.cubeList.add(new ModelBox(appendageR1, 0, 41, -7.5F, 0.75F, -5.0F, 1, 0, 3, 0.0F, false));

        this.appendageR2 = new AdvancedModelRenderer(this);
        this.appendageR2.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.appendageR1.addChild(appendageR2);
        this.setRotateAngle(appendageR2, 0.0F, -0.3491F, 0.0F);
        this.appendageR2.cubeList.add(new ModelBox(appendageR2, 40, 48, -3.0F, -0.5F, -1.5F, 4, 1, 3, 0.0F, false));

        this.appendageRhair1 = new AdvancedModelRenderer(this);
        this.appendageRhair1.setRotationPoint(-3.0F, -0.35F, 0.0F);
        this.appendageR2.addChild(appendageRhair1);
        this.setRotateAngle(appendageRhair1, 0.0F, -0.7854F, 0.0F);
        this.appendageRhair1.cubeList.add(new ModelBox(appendageRhair1, 20, 42, -12.0F, 0.0F, -2.5F, 12, 0, 3, 0.0F, false));

        this.appendageRhair2 = new AdvancedModelRenderer(this);
        this.appendageRhair2.setRotationPoint(-3.0F, 0.4F, 1.0F);
        this.appendageR2.addChild(appendageRhair2);
        this.setRotateAngle(appendageRhair2, 0.0F, -0.2182F, 0.0F);
        this.appendageRhair2.cubeList.add(new ModelBox(appendageRhair2, 0, 32, -12.0F, 0.0F, -2.5F, 12, 0, 3, 0.0F, false));

        this.appendageRhair3 = new AdvancedModelRenderer(this);
        this.appendageRhair3.setRotationPoint(-3.0F, 0.05F, 0.5F);
        this.appendageR2.addChild(appendageRhair3);
        this.setRotateAngle(appendageRhair3, 0.0F, -0.3927F, 0.0436F);
        this.appendageRhair3.cubeList.add(new ModelBox(appendageRhair3, 0, 0, -24.0F, 0.0F, -4.5F, 24, 0, 5, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 23, -6.0F, -2.01F, 0.0F, 12, 4, 5, 0.0F, false));

        this.finL7 = new AdvancedModelRenderer(this);
        this.finL7.setRotationPoint(6.0F, -0.5F, 3.0F);
        this.body7.addChild(finL7);
        this.finL7.cubeList.add(new ModelBox(finL7, 35, 19, -1.0F, 0.01F, -2.99F, 12, 1, 5, 0.0F, false));

        this.finR7 = new AdvancedModelRenderer(this);
        this.finR7.setRotationPoint(-6.0F, -0.5F, 3.0F);
        this.body7.addChild(finR7);
        this.finR7.cubeList.add(new ModelBox(finR7, 0, 35, -11.0F, 0.01F, -2.99F, 12, 1, 5, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(4.5F, -0.1F, 2.5F);
        this.body7.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, 0.4363F);
        this.legL7.cubeList.add(new ModelBox(legL7, 20, 48, 0.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-4.5F, -0.1F, 2.5F);
        this.body7.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, -0.4363F);
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 48, -8.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 0, 23, -5.99F, -1.99F, 0.0F, 12, 4, 5, 0.0F, false));

        this.finL8 = new AdvancedModelRenderer(this);
        this.finL8.setRotationPoint(6.0F, -0.5F, 3.0F);
        this.body8.addChild(finL8);
        this.finL8.cubeList.add(new ModelBox(finL8, 35, 19, -1.5F, 0.0F, -2.99F, 12, 1, 5, 0.0F, false));

        this.finR8 = new AdvancedModelRenderer(this);
        this.finR8.setRotationPoint(-6.0F, -0.5F, 3.0F);
        this.body8.addChild(finR8);
        this.finR8.cubeList.add(new ModelBox(finR8, 0, 35, -10.5F, 0.0F, -2.99F, 12, 1, 5, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(4.0F, -0.1F, 2.5F);
        this.body8.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0F, 0.4363F);
        this.legL8.cubeList.add(new ModelBox(legL8, 20, 48, 0.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-4.0F, -0.1F, 2.5F);
        this.body8.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.0F, -0.4363F);
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 48, -8.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 0, 23, -6.0F, -2.01F, 0.0F, 12, 4, 5, 0.0F, false));

        this.finL9 = new AdvancedModelRenderer(this);
        this.finL9.setRotationPoint(6.0F, -0.5F, 3.0F);
        this.body9.addChild(finL9);
        this.finL9.cubeList.add(new ModelBox(finL9, 35, 19, -2.5F, 0.01F, -2.99F, 12, 1, 5, 0.0F, false));

        this.finR9 = new AdvancedModelRenderer(this);
        this.finR9.setRotationPoint(-6.0F, -0.5F, 3.0F);
        this.body9.addChild(finR9);
        this.finR9.cubeList.add(new ModelBox(finR9, 0, 35, -9.5F, 0.01F, -2.99F, 12, 1, 5, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(3.5F, -0.1F, 2.5F);
        this.body9.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.0F, 0.4363F);
        this.legL9.cubeList.add(new ModelBox(legL9, 20, 48, 0.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-3.5F, -0.1F, 2.5F);
        this.body9.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, 0.0F, -0.4363F);
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 48, -8.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 0, 23, -5.99F, -1.99F, 0.0F, 12, 4, 5, 0.0F, false));

        this.finL10 = new AdvancedModelRenderer(this);
        this.finL10.setRotationPoint(6.0F, -0.5F, 3.0F);
        this.body10.addChild(finL10);
        this.finL10.cubeList.add(new ModelBox(finL10, 35, 19, -4.0F, 0.0F, -2.99F, 12, 1, 5, 0.0F, false));

        this.finR10 = new AdvancedModelRenderer(this);
        this.finR10.setRotationPoint(-6.0F, -0.5F, 3.0F);
        this.body10.addChild(finR10);
        this.finR10.cubeList.add(new ModelBox(finR10, 0, 35, -8.0F, 0.0F, -2.99F, 12, 1, 5, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(3.0F, -0.1F, 2.5F);
        this.body10.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.0F, 0.4363F);
        this.legL10.cubeList.add(new ModelBox(legL10, 20, 48, 0.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-3.0F, -0.1F, 2.5F);
        this.body10.addChild(legR10);
        this.setRotateAngle(legR10, 0.0F, 0.0F, -0.4363F);
        this.legR10.cubeList.add(new ModelBox(legR10, 0, 48, -8.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 0, 56, -5.0F, -2.01F, 0.0F, 10, 4, 5, 0.0F, false));
        this.body11.cubeList.add(new ModelBox(body11, 0, 66, -4.0F, -1.5F, 5.0F, 8, 3, 1, 0.0F, false));

        this.finL11 = new AdvancedModelRenderer(this);
        this.finL11.setRotationPoint(6.0F, -0.5F, 3.0F);
        this.body11.addChild(finL11);
        this.finL11.cubeList.add(new ModelBox(finL11, 35, 19, -6.5F, 0.01F, -2.99F, 12, 1, 5, 0.0F, false));

        this.finR11 = new AdvancedModelRenderer(this);
        this.finR11.setRotationPoint(-6.0F, -0.5F, 3.0F);
        this.body11.addChild(finR11);
        this.finR11.cubeList.add(new ModelBox(finR11, 0, 35, -5.5F, 0.01F, -2.99F, 12, 1, 5, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(2.25F, -0.1F, 2.5F);
        this.body11.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.0F, 0.4363F);
        this.legL11.cubeList.add(new ModelBox(legL11, 20, 48, 0.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-2.25F, -0.1F, 2.5F);
        this.body11.addChild(legR11);
        this.setRotateAngle(legR11, 0.0F, 0.0F, -0.4363F);
        this.legR11.cubeList.add(new ModelBox(legR11, 0, 48, -8.0F, 0.0F, -1.0F, 8, 2, 2, 0.0F, false));

        this.tailL = new AdvancedModelRenderer(this);
        this.tailL.setRotationPoint(0.5F, 0.0F, 5.0F);
        this.body11.addChild(tailL);
        this.setRotateAngle(tailL, 0.0F, 0.2182F, 0.0F);
        this.tailL.cubeList.add(new ModelBox(tailL, 45, 0, 0.0F, 0.0F, 0.0F, 1, 0, 8, 0.0F, false));

        this.tailR = new AdvancedModelRenderer(this);
        this.tailR.setRotationPoint(-0.5F, 0.0F, 5.0F);
        this.body11.addChild(tailR);
        this.setRotateAngle(tailR, 0.0F, -0.2182F, 0.0F);
        this.tailR.cubeList.add(new ModelBox(tailR, 45, 0, -1.0F, 0.0F, 0.0F, 1, 0, 8, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        //this.head.render(f5 * 0.2F);
        this.body6.render(f5 * 0.36F);
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
        //this.head.offsetY = 1.075F;
        this.body6.offsetY = 0.95F;

        AdvancedModelRenderer[] legsL = {this.legL1, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9, this.legL10, this.legL11};
        AdvancedModelRenderer[] legsR = {this.legR1, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9, this.legR10, this.legR11};
        AdvancedModelRenderer[] antennaL = {this.appendageL, this.appendageL2};
        AdvancedModelRenderer[] antennaR = {this.appendageR, this.appendageR2};
        AdvancedModelRenderer[] bodyF = {this.head, this.body1, this.body2, this.body3, this.body4, this.body5};
        AdvancedModelRenderer[] bodyB = {this.body7, this.body8, this.body9, this.body10, this.body11};
        AdvancedModelRenderer[] bodyA = {this.head, this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11};

        EntityPrehistoricFloraOmnidens ee = (EntityPrehistoricFloraOmnidens) e;
        float fast = 1F;
        if (ee.getIsFast()) {
            fast = 1.6F;
        }

        this.swing(tailL, 1.1F, 0.11F, false, 0, 0F, f2, 0.7F);
        this.swing(tailR, 1.1F, -0.11F, false, 0, 0F, f2, 0.7F);

        if (f3 != 0.0 && ee.getAnimation() != ee.LOOK_ANIMATION) {

            this.chainWave(legsL, 0.2F * fast, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F * fast, 0.2F, -3, f2, 1);

            float legFlap = 0.5F;
            float legFlapSpeed = 0.3F * fast;
            this.flap(legL1, legFlapSpeed, -legFlap, false, 0, -legFlap, f2, legFlapSpeed);
            this.flap(legR1, legFlapSpeed, legFlap, false, 0, legFlap, f2, legFlapSpeed);
            this.flap(legL2, legFlapSpeed, -legFlap, false, 1.0F, -legFlap, f2, legFlapSpeed);
            this.flap(legR2, legFlapSpeed, legFlap, false, 1.0F, legFlap, f2, legFlapSpeed);
            this.flap(legL3, legFlapSpeed, -legFlap, false, 2.0F, -legFlap, f2, legFlapSpeed);
            this.flap(legR3, legFlapSpeed, legFlap, false, 2.0F, legFlap, f2, legFlapSpeed);
            this.flap(legL4, legFlapSpeed, -legFlap, false, 3.0F, -legFlap, f2, legFlapSpeed);
            this.flap(legR4, legFlapSpeed, legFlap, false, 3.0F, legFlap, f2, legFlapSpeed);
            this.flap(legL5, legFlapSpeed, -legFlap, false, 2.0F, -legFlap, f2, legFlapSpeed);
            this.flap(legR5, legFlapSpeed, legFlap, false, 2.0F, legFlap, f2, legFlapSpeed);
            this.flap(legL6, legFlapSpeed, -legFlap, false, 1.0F, -legFlap, f2, legFlapSpeed);
            this.flap(legR6, legFlapSpeed, legFlap, false, 1.0F, legFlap, f2, legFlapSpeed);
            this.flap(legL7, legFlapSpeed, -legFlap, false, 0.0F, -legFlap, f2, legFlapSpeed);
            this.flap(legR7, legFlapSpeed, legFlap, false, 0.0F, legFlap, f2, legFlapSpeed);
            this.flap(legL8, legFlapSpeed, -legFlap, false, 1.0F, -legFlap, f2, legFlapSpeed);
            this.flap(legR8, legFlapSpeed, legFlap, false, 1.0F, legFlap, f2, legFlapSpeed);
            this.flap(legL9, legFlapSpeed, -legFlap, false, 2.0F, -legFlap, f2, legFlapSpeed);
            this.flap(legR9, legFlapSpeed, legFlap, false, 2.0F, legFlap, f2, legFlapSpeed);
            this.flap(legL10, legFlapSpeed, -legFlap, false, 3.0F, -legFlap, f2, legFlapSpeed);
            this.flap(legR10, legFlapSpeed, legFlap, false, 3.0F, legFlap, f2, legFlapSpeed);
            this.flap(legL11, legFlapSpeed, -legFlap, false, 2.0F, -legFlap, f2, legFlapSpeed);
            this.flap(legR11, legFlapSpeed, legFlap, false, 2.0F, legFlap, f2, legFlapSpeed);

            float legSwing = 0.05F;
            this.swing(legL1, legFlapSpeed, -legSwing, false, 0, -legSwing, f2, legFlapSpeed);
            this.swing(legR1, legFlapSpeed, legSwing, false, 0, legSwing, f2, legFlapSpeed);
            this.swing(legL2, legFlapSpeed, -legSwing, false, 1.0F, -legSwing, f2, legFlapSpeed);
            this.swing(legR2, legFlapSpeed, legSwing, false, 1.0F, legSwing, f2, legFlapSpeed);
            this.swing(legL3, legFlapSpeed, -legSwing, false, 2.0F, -legSwing, f2, legFlapSpeed);
            this.swing(legR3, legFlapSpeed, legSwing, false, 2.0F, legSwing, f2, legFlapSpeed);
            this.swing(legL4, legFlapSpeed, -legSwing, false, 3.0F, -legSwing, f2, legFlapSpeed);
            this.swing(legR4, legFlapSpeed, legSwing, false, 3.0F, legSwing, f2, legFlapSpeed);
            this.swing(legL5, legFlapSpeed, -legSwing, false, 2.0F, -legSwing, f2, legFlapSpeed);
            this.swing(legR5, legFlapSpeed, legSwing, false, 2.0F, legSwing, f2, legFlapSpeed);
            this.swing(legL6, legFlapSpeed, -legSwing, false, 1.0F, -legSwing, f2, legFlapSpeed);
            this.swing(legR6, legFlapSpeed, legSwing, false, 1.0F, legSwing, f2, legFlapSpeed);
            this.swing(legL7, legFlapSpeed, -legSwing, false, 0.0F, -legSwing, f2, legFlapSpeed);
            this.swing(legR7, legFlapSpeed, legSwing, false, 0.0F, legSwing, f2, legFlapSpeed);
            this.swing(legL8, legFlapSpeed, -legSwing, false, 1.0F, -legSwing, f2, legFlapSpeed);
            this.swing(legR8, legFlapSpeed, legSwing, false, 1.0F, legSwing, f2, legFlapSpeed);
            this.swing(legL9, legFlapSpeed, -legSwing, false, 2.0F, -legSwing, f2, legFlapSpeed);
            this.swing(legR9, legFlapSpeed, legSwing, false, 2.0F, legSwing, f2, legFlapSpeed);
            this.swing(legL10, legFlapSpeed, -legSwing, false, 3.0F, -legSwing, f2, legFlapSpeed);
            this.swing(legR10, legFlapSpeed, legSwing, false, 3.0F, legSwing, f2, legFlapSpeed);
            this.swing(legL11, legFlapSpeed, -legSwing, false, 2.0F, -legSwing, f2, legFlapSpeed);
            this.swing(legR11, legFlapSpeed, legSwing, false, 2.0F, legSwing, f2, legFlapSpeed);

            if (ee.getAnimation() != ee.ATTACK_ANIMATION) {
                this.bob(body6, 1F * fast, 0.05F, false, f2, 1);
                this.chainWave(bodyF, 0.4F * fast, 0.018f, 0.08 * fast, f2, 0.25F);
                this.chainWave(bodyB, 0.4F * fast, 0.018f, 0.08 * fast, f2, 0.25F);
                this.chainSwing(bodyA, 0.08F * fast, 0.02f * fast, 0.25, f2, 0.25F);
                this.chainSwing(bodyF, 0.08F * fast, 0.05F * fast, -1, f2, 0.5F);
                this.chainSwing(bodyB, 0.08F * fast, 0.05F * fast, 1, f2, 0.5F);
            }
        } else { //LOOK ANIMATION MIGHT BE RUNNING:
            if (f3 != 0) {
                float legFlap = 0.5F;
                float legFlapSpeed = 0.3F * fast;
                this.flap(legL1, legFlapSpeed, -legFlap, false, 0, -legFlap, f2, legFlapSpeed);
                this.flap(legR1, legFlapSpeed, legFlap, false, 0, legFlap, f2, legFlapSpeed);
                this.flap(legL2, legFlapSpeed, -legFlap, false, 1.0F, -legFlap, f2, legFlapSpeed);
                this.flap(legR2, legFlapSpeed, legFlap, false, 1.0F, legFlap, f2, legFlapSpeed);
                this.flap(legL3, legFlapSpeed, -legFlap, false, 2.0F, -legFlap, f2, legFlapSpeed);
                this.flap(legR3, legFlapSpeed, legFlap, false, 2.0F, legFlap, f2, legFlapSpeed);
                this.flap(legL4, legFlapSpeed, -legFlap, false, 3.0F, -legFlap, f2, legFlapSpeed);
                this.flap(legR4, legFlapSpeed, legFlap, false, 3.0F, legFlap, f2, legFlapSpeed);
                this.flap(legL5, legFlapSpeed, -legFlap, false, 2.0F, -legFlap, f2, legFlapSpeed);
                this.flap(legR5, legFlapSpeed, legFlap, false, 2.0F, legFlap, f2, legFlapSpeed);

                float legSwing = 0.05F;
                this.swing(legL1, legFlapSpeed, -legSwing, false, 0, -legSwing, f2, legFlapSpeed);
                this.swing(legR1, legFlapSpeed, legSwing, false, 0, legSwing, f2, legFlapSpeed);
                this.swing(legL2, legFlapSpeed, -legSwing, false, 1.0F, -legSwing, f2, legFlapSpeed);
                this.swing(legR2, legFlapSpeed, legSwing, false, 1.0F, legSwing, f2, legFlapSpeed);
                this.swing(legL3, legFlapSpeed, -legSwing, false, 2.0F, -legSwing, f2, legFlapSpeed);
                this.swing(legR3, legFlapSpeed, legSwing, false, 2.0F, legSwing, f2, legFlapSpeed);
                this.swing(legL4, legFlapSpeed, -legSwing, false, 3.0F, -legSwing, f2, legFlapSpeed);
                this.swing(legR4, legFlapSpeed, legSwing, false, 3.0F, legSwing, f2, legFlapSpeed);
                this.swing(legL5, legFlapSpeed, -legSwing, false, 2.0F, -legSwing, f2, legFlapSpeed);
                this.swing(legR5, legFlapSpeed, legSwing, false, 2.0F, legSwing, f2, legFlapSpeed);
                this.swing(legL6, legFlapSpeed, -legSwing, false, 1.0F, -legSwing, f2, legFlapSpeed);
            }
        }

        float finFlap = 0.1F;
        float finFlapSpeed = 0.6F * (fast * 0.65F);
        this.flap(finL1, finFlapSpeed, -finFlap, false, 0, -finFlap, f2, finFlapSpeed);
        this.flap(finR1, finFlapSpeed, finFlap, false, 0, finFlap, f2, finFlapSpeed);
        this.flap(finL2, finFlapSpeed, -finFlap, false, 1.0F, -finFlap, f2, finFlapSpeed);
        this.flap(finR2, finFlapSpeed, finFlap, false, 1.0F, finFlap, f2, finFlapSpeed);
        this.flap(finL3, finFlapSpeed, -finFlap, false, 2.0F, -finFlap, f2, finFlapSpeed);
        this.flap(finR3, finFlapSpeed, finFlap, false, 2.0F, finFlap, f2, finFlapSpeed);
        this.flap(finL4, finFlapSpeed, -finFlap, false, 3.0F, -finFlap, f2, finFlapSpeed);
        this.flap(finR4, finFlapSpeed, finFlap, false, 3.0F, finFlap, f2, finFlapSpeed);
        this.flap(finL5, finFlapSpeed, -finFlap, false, 2.0F, -finFlap, f2, finFlapSpeed);
        this.flap(finR5, finFlapSpeed, finFlap, false, 2.0F, finFlap, f2, finFlapSpeed);
        this.flap(finL6, finFlapSpeed, -finFlap, false, 1.0F, -finFlap, f2, finFlapSpeed);
        this.flap(finR6, finFlapSpeed, finFlap, false, 1.0F, finFlap, f2, finFlapSpeed);
        this.flap(finL7, finFlapSpeed, -finFlap, false, 0.0F, -finFlap, f2, finFlapSpeed);
        this.flap(finR7, finFlapSpeed, finFlap, false, 0.0F, finFlap, f2, finFlapSpeed);
        this.flap(finL8, finFlapSpeed, -finFlap, false, 1.0F, -finFlap, f2, finFlapSpeed);
        this.flap(finR8, finFlapSpeed, finFlap, false, 1.0F, finFlap, f2, finFlapSpeed);
        this.flap(finL9, finFlapSpeed, -finFlap, false, 2.0F, -finFlap, f2, finFlapSpeed);
        this.flap(finR9, finFlapSpeed, finFlap, false, 2.0F, finFlap, f2, finFlapSpeed);
        this.flap(finL10, finFlapSpeed, -finFlap, false, 3.0F, -finFlap, f2, finFlapSpeed);
        this.flap(finR10, finFlapSpeed, finFlap, false, 3.0F, finFlap, f2, finFlapSpeed);
        this.flap(finL11, finFlapSpeed, -finFlap, false, 2.0F, -finFlap, f2, finFlapSpeed);
        this.flap(finR11, finFlapSpeed, finFlap, false, 2.0F, finFlap, f2, finFlapSpeed);

        if (ee.getAnimation() != ee.ATTACK_ANIMATION) {
            this.chainSwing(antennaL, 0.12F, -0.2F * fast, 0.3F * fast, f2, 0.7F * fast);
            this.chainSwing(antennaR, 0.12F, 0.2F * fast, 0.3F * fast, f2, 0.7F * fast);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraOmnidens e = (EntityPrehistoricFloraOmnidens) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        //LOOK duration = 120
        animator.setAnimation(e.LOOK_ANIMATION);
        animator.startKeyframe(20);
        animator.rotate(this.body5, (float) Math.toRadians(-27.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(20);
        animator.rotate(this.body5, (float) Math.toRadians(-27.5), (float) Math.toRadians(-2.5), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-15), (float) Math.toRadians(-2.5), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-10), (float) Math.toRadians(-2.5), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-5), (float) Math.toRadians(-2.5), (float) Math.toRadians(0));
        animator.rotate(this.body1, (float) Math.toRadians(5), (float) Math.toRadians(-2.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(-7.5), (float) Math.toRadians(-15.0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(30);
        animator.rotate(this.body5, (float) Math.toRadians(-27.5), (float) Math.toRadians(2.5), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-15), (float) Math.toRadians(2.5), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-10), (float) Math.toRadians(2.5), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-5), (float) Math.toRadians(2.5), (float) Math.toRadians(0));
        animator.rotate(this.body1, (float) Math.toRadians(5), (float) Math.toRadians(2.5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(7.5), (float) Math.toRadians(15.0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(30);

        //ATTACK duration = 60
        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.body5, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL, (float) Math.toRadians(0), (float) Math.toRadians(-12.5), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(0), (float) Math.toRadians(12.5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);

        animator.startKeyframe(5);
        animator.move(this.body6, 0,0,1.0F);
        animator.rotate(this.body5, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL, (float) Math.toRadians(0), (float) Math.toRadians(22.5), (float) Math.toRadians(0));
        animator.rotate(this.appendageL1, (float) Math.toRadians(0), (float) Math.toRadians(10.0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL2, (float) Math.toRadians(0), (float) Math.toRadians(10.0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(0), (float) Math.toRadians(-22.5), (float) Math.toRadians(0));
        animator.rotate(this.appendageR1, (float) Math.toRadians(0), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR2, (float) Math.toRadians(0), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);

        animator.startKeyframe(5);
        animator.move(this.body6, 0,0,0.66F);
        animator.rotate(this.body5, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(2.5), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.body1, (float) Math.toRadians(10), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.appendageL, (float) Math.toRadians(0), (float) Math.toRadians(22.5), (float) Math.toRadians(0));
        animator.rotate(this.appendageL1, (float) Math.toRadians(0), (float) Math.toRadians(10.0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL2, (float) Math.toRadians(0), (float) Math.toRadians(10.0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(0), (float) Math.toRadians(-22.5), (float) Math.toRadians(0));
        animator.rotate(this.appendageR1, (float) Math.toRadians(0), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR2, (float) Math.toRadians(0), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);

        animator.startKeyframe(5);
        animator.move(this.body6, 0,0,0.33F);
        animator.rotate(this.body5, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(2.5), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.body1, (float) Math.toRadians(10), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.appendageL, (float) Math.toRadians(0), (float) Math.toRadians(22.5), (float) Math.toRadians(0));
        animator.rotate(this.appendageL1, (float) Math.toRadians(0), (float) Math.toRadians(10.0), (float) Math.toRadians(0));
        animator.rotate(this.appendageL2, (float) Math.toRadians(0), (float) Math.toRadians(10.0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR, (float) Math.toRadians(0), (float) Math.toRadians(-22.5), (float) Math.toRadians(0));
        animator.rotate(this.appendageR1, (float) Math.toRadians(0), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.rotate(this.appendageR2, (float) Math.toRadians(0), (float) Math.toRadians(-10.0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);

        animator.resetKeyframe(10);
    }
}
