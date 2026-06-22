package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEramoscorpius;
import net.lepidodendron.entity.EntityPrehistoricFloraPraearcturus;
import net.lepidodendron.entity.EntityPrehistoricFloraScorpion_Waeringoscorpio;
import net.lepidodendron.entity.base.EntityPrehistoricFloraWalkingAmphibianBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelWaeringoscorpio extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer fingerright;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer fingerleft;
    private final AdvancedModelRenderer cheliceraright;
    private final AdvancedModelRenderer cheliceraleft;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer gillright;
    private final AdvancedModelRenderer gillleft;
    private final AdvancedModelRenderer gillright2;
    private final AdvancedModelRenderer gillleft2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer gillright3;
    private final AdvancedModelRenderer gillleft3;
    private final AdvancedModelRenderer gillright4;
    private final AdvancedModelRenderer gillleft4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;

    public ModelWaeringoscorpio() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 23.0F, -1.4F);
        this.setRotateAngle(head, -0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 12, 2, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 16, -0.5F, -1.25F, -1.075F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 13, -1.0F, -1.0F, -0.375F, 2, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.0F, -2.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3709F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 15, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.775F, 0.0F, -2.55F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 15, -1.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.6F, 0.0F, -2.975F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.6545F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 15, -1.0F, -1.0F, 2.0F, 1, 1, 1, -0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.6F, 0.0F, -2.975F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.6545F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 15, 0.0F, -1.0F, 2.0F, 1, 1, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.775F, 0.0F, -2.55F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2182F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 15, 0.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.0F, -2.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3709F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 15, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-0.5F, -0.25F, -1.85F);
        this.head.addChild(armright);
        this.setRotateAngle(armright, 0.167F, -0.2322F, -0.2134F);
        this.armright.cubeList.add(new ModelBox(armright, 14, 13, -1.85F, -0.024F, -0.45F, 2, 0, 1, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-1.6F, 0.0F, 0.15F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.0F, -0.9163F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 14, 12, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-1.6F, 0.0F, -0.3F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.8633F, -0.3434F, 0.0617F);
        this.armright3.cubeList.add(new ModelBox(armright3, 4, 19, -0.75F, -0.5F, -0.5F, 1, 1, 1, 0.01F, false));
        this.armright3.cubeList.add(new ModelBox(armright3, 8, 19, -1.25F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.875F, 0.025F, 0.45F);
        this.armright3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3054F, 0.2182F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 14, -2.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.fingerright = new AdvancedModelRenderer(this);
        this.fingerright.setRotationPoint(-0.875F, 0.425F, 0.45F);
        this.armright3.addChild(fingerright);
        this.setRotateAngle(fingerright, -0.0253F, -0.2861F, 0.3828F);
        this.fingerright.cubeList.add(new ModelBox(fingerright, 0, 15, -2.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(0.5F, -0.25F, -1.85F);
        this.head.addChild(armleft);
        this.setRotateAngle(armleft, 0.167F, 0.2322F, 0.2134F);
        this.armleft.cubeList.add(new ModelBox(armleft, 14, 13, -0.15F, -0.024F, -0.45F, 2, 0, 1, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(1.6F, 0.0F, 0.15F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.0F, 0.9163F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 14, 12, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(1.6F, 0.0F, -0.3F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.8633F, 0.3434F, -0.0617F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 4, 19, -0.25F, -0.5F, -0.5F, 1, 1, 1, 0.01F, true));
        this.armleft3.cubeList.add(new ModelBox(armleft3, 8, 19, 0.25F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.875F, 0.025F, 0.45F);
        this.armleft3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3054F, -0.2182F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 14, 0.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.fingerleft = new AdvancedModelRenderer(this);
        this.fingerleft.setRotationPoint(0.875F, 0.425F, 0.45F);
        this.armleft3.addChild(fingerleft);
        this.setRotateAngle(fingerleft, -0.0253F, 0.2861F, -0.3828F);
        this.fingerleft.cubeList.add(new ModelBox(fingerleft, 0, 15, 0.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, true));

        this.cheliceraright = new AdvancedModelRenderer(this);
        this.cheliceraright.setRotationPoint(-0.15F, -0.875F, -2.0F);
        this.head.addChild(cheliceraright);
        this.setRotateAngle(cheliceraright, 0.1745F, -0.3491F, 0.1745F);
        this.cheliceraright.cubeList.add(new ModelBox(cheliceraright, 12, 19, 0.0F, 0.0F, -0.35F, 0, 1, 1, 0.0F, false));

        this.cheliceraleft = new AdvancedModelRenderer(this);
        this.cheliceraleft.setRotationPoint(0.15F, -0.875F, -2.0F);
        this.head.addChild(cheliceraleft);
        this.setRotateAngle(cheliceraleft, 0.1745F, 0.3491F, -0.1745F);
        this.cheliceraleft.cubeList.add(new ModelBox(cheliceraleft, 12, 19, 0.0F, 0.0F, -0.35F, 0, 1, 1, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.7F, -0.5F, -1.325F);
        this.head.addChild(legright);
        this.setRotateAngle(legright, -0.3546F, -0.1625F, -0.3158F);
        this.legright.cubeList.add(new ModelBox(legright, 0, 11, -3.75F, -1.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.7F, -0.5F, -1.325F);
        this.head.addChild(legleft);
        this.setRotateAngle(legleft, -0.3546F, 0.1625F, 0.3158F);
        this.legleft.cubeList.add(new ModelBox(legleft, 0, 11, -0.25F, -1.5F, 0.0F, 4, 2, 0, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-1.0F, -0.5F, -0.775F);
        this.head.addChild(legright2);
        this.setRotateAngle(legright2, -0.3431F, 0.1864F, -0.2721F);
        this.legright2.cubeList.add(new ModelBox(legright2, 12, 0, -4.0F, -1.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(1.0F, -0.5F, -0.775F);
        this.head.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.3431F, -0.1864F, 0.2721F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 12, 0, 0.0F, -1.5F, 0.0F, 4, 2, 0, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-1.275F, -0.5F, -0.275F);
        this.head.addChild(legright3);
        this.setRotateAngle(legright3, -0.3335F, 0.448F, -0.2254F);
        this.legright3.cubeList.add(new ModelBox(legright3, 0, 7, -4.75F, -1.5F, 0.0F, 5, 2, 0, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(1.275F, -0.5F, -0.275F);
        this.head.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.3335F, -0.448F, 0.2254F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 0, 7, -0.25F, -1.5F, 0.0F, 5, 2, 0, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-1.275F, -0.5F, 0.3F);
        this.head.addChild(legright4);
        this.setRotateAngle(legright4, -0.3067F, 0.715F, -0.1966F);
        this.legright4.cubeList.add(new ModelBox(legright4, 0, 5, -5.75F, -1.5F, 0.0F, 6, 2, 0, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(1.275F, -0.5F, 0.3F);
        this.head.addChild(legleft4);
        this.setRotateAngle(legleft4, -0.3067F, -0.715F, 0.1966F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 0, 5, -0.25F, -1.5F, 0.0F, 6, 2, 0, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, 0.625F);
        this.head.addChild(body);
        this.setRotateAngle(body, -0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -0.5F, -0.2F, 3, 1, 3, 0.01F, false));

        this.gillright = new AdvancedModelRenderer(this);
        this.gillright.setRotationPoint(-1.5F, 0.25F, 1.45F);
        this.body.addChild(gillright);
        this.setRotateAngle(gillright, 0.3491F, 0.7418F, -0.2182F);
        this.gillright.cubeList.add(new ModelBox(gillright, 1, 10, -2.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.gillleft = new AdvancedModelRenderer(this);
        this.gillleft.setRotationPoint(1.5F, 0.25F, 1.45F);
        this.body.addChild(gillleft);
        this.setRotateAngle(gillleft, 0.3491F, -0.7418F, 0.2182F);
        this.gillleft.cubeList.add(new ModelBox(gillleft, 1, 10, -0.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.gillright2 = new AdvancedModelRenderer(this);
        this.gillright2.setRotationPoint(-1.5F, 0.25F, 2.2F);
        this.body.addChild(gillright2);
        this.setRotateAngle(gillright2, 0.3491F, 1.0036F, -0.2182F);
        this.gillright2.cubeList.add(new ModelBox(gillright2, 11, 8, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.gillleft2 = new AdvancedModelRenderer(this);
        this.gillleft2.setRotationPoint(1.5F, 0.25F, 2.2F);
        this.body.addChild(gillleft2);
        this.setRotateAngle(gillleft2, 0.3491F, -1.0036F, 0.2182F);
        this.gillleft2.cubeList.add(new ModelBox(gillleft2, 11, 8, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.8F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 10, 9, -1.0F, -0.5F, -0.25F, 2, 1, 2, 0.0F, false));

        this.gillright3 = new AdvancedModelRenderer(this);
        this.gillright3.setRotationPoint(-0.975F, 0.25F, -0.1F);
        this.body2.addChild(gillright3);
        this.setRotateAngle(gillright3, 0.3491F, 1.1781F, -0.2182F);
        this.gillright3.cubeList.add(new ModelBox(gillright3, 12, 5, -2.375F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.gillleft3 = new AdvancedModelRenderer(this);
        this.gillleft3.setRotationPoint(0.975F, 0.25F, -0.1F);
        this.body2.addChild(gillleft3);
        this.setRotateAngle(gillleft3, 0.3491F, -1.1781F, 0.2182F);
        this.gillleft3.cubeList.add(new ModelBox(gillleft3, 12, 5, -0.625F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.gillright4 = new AdvancedModelRenderer(this);
        this.gillright4.setRotationPoint(-0.975F, 0.25F, 0.45F);
        this.body2.addChild(gillright4);
        this.setRotateAngle(gillright4, 0.3491F, 1.6581F, -0.2182F);
        this.gillright4.cubeList.add(new ModelBox(gillright4, 12, 6, -1.975F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.gillleft4 = new AdvancedModelRenderer(this);
        this.gillleft4.setRotationPoint(0.975F, 0.25F, 0.45F);
        this.body2.addChild(gillleft4);
        this.setRotateAngle(gillleft4, 0.3491F, -1.6581F, 0.2182F);
        this.gillleft4.cubeList.add(new ModelBox(gillleft4, 12, 6, -0.025F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, 0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 4, 17, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 8, 17, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 17, -0.5F, -0.5F, 0.275F, 1, 1, 1, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 1.25F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 17, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 18, -0.5F, -0.5F, 0.8F, 1, 1, 1, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 18, 2, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 18, 9, -0.5F, -0.5F, 0.8F, 1, 1, 1, -0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 8, 12, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.5672F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 18, 15, -0.5F, -0.5F, -0.4F, 1, 1, 1, -0.01F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 6, 13, 0.0F, -0.25F, 0.1F, 0, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.1F, 0.0F, 0.0F);
        this.body.offsetZ = -0.03F;
        this.body.offsetY = -0.04F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }


    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.080F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.4F;
        this.body.offsetX = -0.1F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.2F, 3.8F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        //this.resetToDefaultPose();

        //this.cheliceraL.swing(0.85F, (float)Math.toRadians(-25), false, 0, 0F, f2, 1.0F);
        //this.cheliceraR.swing(0.85F, (float)Math.toRadians(25), false, 0, 0F, f2, 1.0F);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraWalkingAmphibianBase ee = (EntityPrehistoricFloraWalkingAmphibianBase) entitylivingbaseIn;

        if (ee.isReallyInWater() ) {//swimming
                if (ee.getIsMoving()) {
                    if(ee instanceof EntityPrehistoricFloraScorpion_Waeringoscorpio) {
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        if(ee.getIsFast()) {//fast
                            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                        } else {//slow
                            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                        }
                    }
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }

        }
        else {
            //land pose:
            if (!ee.getIsMoving()) { //static on land
                if(ee instanceof EntityPrehistoricFloraScorpion_Waeringoscorpio) {
                    animWalkingLand(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
            }
            else {
                //moving on land
                if(ee instanceof EntityPrehistoricFloraScorpion_Waeringoscorpio) {
                    animWalkingLand(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
        }
        
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            if(ee instanceof EntityPrehistoricFloraScorpion_Waeringoscorpio) {
                animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
            }
        }

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScorpion_Waeringoscorpio entity = (EntityPrehistoricFloraScorpion_Waeringoscorpio) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (16.19965-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (1.18701-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (-4.85741-(0)));
    }
            else if (tickAnim >= 3 && tickAnim < 5) {
    xx = 16.19965 + (((tickAnim - 3) / 2) * (42.5-(16.19965)));
    yy = 1.18701 + (((tickAnim - 3) / 2) * (0-(1.18701)));
    zz = -4.85741 + (((tickAnim - 3) / 2) * (0-(-4.85741)));
}
        else if (tickAnim >= 5 && tickAnim < 8) {
        xx = 42.5 + (((tickAnim - 5) / 3) * (35.3171-(42.5)));
        yy = 0 + (((tickAnim - 5) / 3) * (-2.71466-(0)));
        zz = 0 + (((tickAnim - 5) / 3) * (4.20045-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = 35.3171 + (((tickAnim - 8) / 5) * (28.69026-(35.3171)));
        yy = -2.71466 + (((tickAnim - 8) / 5) * (-1.6288-(-2.71466)));
        zz = 4.20045 + (((tickAnim - 8) / 5) * (2.52027-(4.20045)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
        xx = 28.69026 + (((tickAnim - 13) / 4) * (-2.24877-(28.69026)));
        yy = -1.6288 + (((tickAnim - 13) / 4) * (-0.72391-(-1.6288)));
        zz = 2.52027 + (((tickAnim - 13) / 4) * (1.12012-(2.52027)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
        xx = -2.24877 + (((tickAnim - 17) / 3) * (0-(-2.24877)));
        yy = -0.72391 + (((tickAnim - 17) / 3) * (0-(-0.72391)));
        zz = 1.12012 + (((tickAnim - 17) / 3) * (0-(1.12012)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        yy = 0.5 + (((tickAnim - 3) / 2) * (1-(0.5)));
        zz = 0.5 + (((tickAnim - 3) / 2) * (0-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
        xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        yy = 1 + (((tickAnim - 5) / 3) * (0.83-(1)));
        zz = 0 + (((tickAnim - 5) / 3) * (-0.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        yy = 0.83 + (((tickAnim - 8) / 12) * (0-(0.83)));
        zz = -0.5 + (((tickAnim - 8) / 12) * (0-(-0.5)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (-29.73792-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (15.33322-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (45.32876-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = -29.73792 + (((tickAnim - 5) / 15) * (0-(-29.73792)));
        yy = 15.33322 + (((tickAnim - 5) / 15) * (0-(15.33322)));
        zz = 45.32876 + (((tickAnim - 5) / 15) * (0-(45.32876)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (30-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        yy = 30 + (((tickAnim - 5) / 15) * (0-(30)));
        zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (-37.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        zz = -37.5 + (((tickAnim - 5) / 15) * (0-(-37.5)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(fingerright, fingerright.rotateAngleX + (float) Math.toRadians(xx), fingerright.rotateAngleY + (float) Math.toRadians(yy), fingerright.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (-0.47784-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (1.53585-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (1.98623-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = -0.47784 + (((tickAnim - 5) / 15) * (0-(-0.47784)));
        yy = 1.53585 + (((tickAnim - 5) / 15) * (0-(1.53585)));
        zz = 1.98623 + (((tickAnim - 5) / 15) * (0-(1.98623)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (4.23754-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (-10.40259-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (-13.04256-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 4.23754 + (((tickAnim - 5) / 15) * (0-(4.23754)));
        yy = -10.40259 + (((tickAnim - 5) / 15) * (0-(-10.40259)));
        zz = -13.04256 + (((tickAnim - 5) / 15) * (0-(-13.04256)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (9.39677-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (-19.71343-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (-23.75825-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 9.39677 + (((tickAnim - 5) / 15) * (0-(9.39677)));
        yy = -19.71343 + (((tickAnim - 5) / 15) * (0-(-19.71343)));
        zz = -23.75825 + (((tickAnim - 5) / 15) * (0-(-23.75825)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (17.12967-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (-29.40564-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (-33.50725-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 17.12967 + (((tickAnim - 5) / 15) * (0-(17.12967)));
        yy = -29.40564 + (((tickAnim - 5) / 15) * (0-(-29.40564)));
        zz = -33.50725 + (((tickAnim - 5) / 15) * (0-(-33.50725)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (-28.75-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = -28.75 + (((tickAnim - 3) / 2) * (67.5-(-28.75)));
        yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 67.5 + (((tickAnim - 5) / 15) * (0-(67.5)));
        yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        zz = 0 + (((tickAnim - 3) / 1) * (-45-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
        xx = 0 + (((tickAnim - 4) / 3) * (7.87256-(0)));
        yy = 0 + (((tickAnim - 4) / 3) * (-45.18071-(0)));
        zz = -45 + (((tickAnim - 4) / 3) * (48.27303-(-45)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
        xx = 7.87256 + (((tickAnim - 7) / 13) * (0-(7.87256)));
        yy = -45.18071 + (((tickAnim - 7) / 13) * (0-(-45.18071)));
        zz = 48.27303 + (((tickAnim - 7) / 13) * (0-(48.27303)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(gillright, gillright.rotateAngleX + (float) Math.toRadians(xx), gillright.rotateAngleY + (float) Math.toRadians(yy), gillright.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        zz = 0 + (((tickAnim - 3) / 1) * (45-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
        xx = 0 + (((tickAnim - 4) / 3) * (3.43174-(0)));
        yy = 0 + (((tickAnim - 4) / 3) * (30.84418-(0)));
        zz = 45 + (((tickAnim - 4) / 3) * (-46.43507-(45)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
        xx = 3.43174 + (((tickAnim - 7) / 13) * (0-(3.43174)));
        yy = 30.84418 + (((tickAnim - 7) / 13) * (0-(30.84418)));
        zz = -46.43507 + (((tickAnim - 7) / 13) * (0-(-46.43507)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(gillleft, gillleft.rotateAngleX + (float) Math.toRadians(xx), gillleft.rotateAngleY + (float) Math.toRadians(yy), gillleft.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        zz = 0 + (((tickAnim - 3) / 1) * (-22.5-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
        xx = 0 + (((tickAnim - 4) / 3) * (3.01313-(0)));
        yy = 0 + (((tickAnim - 4) / 3) * (-45.44195-(0)));
        zz = -22.5 + (((tickAnim - 4) / 3) * (64.35158-(-22.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
        xx = 3.01313 + (((tickAnim - 7) / 13) * (0-(3.01313)));
        yy = -45.44195 + (((tickAnim - 7) / 13) * (0-(-45.44195)));
        zz = 64.35158 + (((tickAnim - 7) / 13) * (0-(64.35158)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(gillright2, gillright2.rotateAngleX + (float) Math.toRadians(xx), gillright2.rotateAngleY + (float) Math.toRadians(yy), gillright2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        zz = 0 + (((tickAnim - 3) / 1) * (45-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
        xx = 0 + (((tickAnim - 4) / 3) * (17.55768-(0)));
        yy = 0 + (((tickAnim - 4) / 3) * (30.44302-(0)));
        zz = 45 + (((tickAnim - 4) / 3) * (-39.08754-(45)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
        xx = 17.55768 + (((tickAnim - 7) / 13) * (0-(17.55768)));
        yy = 30.44302 + (((tickAnim - 7) / 13) * (0-(30.44302)));
        zz = -39.08754 + (((tickAnim - 7) / 13) * (0-(-39.08754)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(gillleft2, gillleft2.rotateAngleX + (float) Math.toRadians(xx), gillleft2.rotateAngleY + (float) Math.toRadians(yy), gillleft2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (10-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = 10 + (((tickAnim - 3) / 2) * (60-(10)));
        yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 60 + (((tickAnim - 5) / 15) * (0-(60)));
        yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 3) / 1) * (-6.77946-(0)));
        yy = 0 + (((tickAnim - 3) / 1) * (-52.17516-(0)));
        zz = 0 + (((tickAnim - 3) / 1) * (-43.0573-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
        xx = -6.77946 + (((tickAnim - 4) / 3) * (-9.13644-(-6.77946)));
        yy = -52.17516 + (((tickAnim - 4) / 3) * (-18.46948-(-52.17516)));
        zz = -43.0573 + (((tickAnim - 4) / 3) * (37.66559-(-43.0573)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
        xx = -9.13644 + (((tickAnim - 7) / 13) * (0-(-9.13644)));
        yy = -18.46948 + (((tickAnim - 7) / 13) * (0-(-18.46948)));
        zz = 37.66559 + (((tickAnim - 7) / 13) * (0-(37.66559)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(gillright3, gillright3.rotateAngleX + (float) Math.toRadians(xx), gillright3.rotateAngleY + (float) Math.toRadians(yy), gillright3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 3) / 1) * (-32.43977-(0)));
        yy = 0 + (((tickAnim - 3) / 1) * (41.16666-(0)));
        zz = 0 + (((tickAnim - 3) / 1) * (47.33685-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
        xx = -32.43977 + (((tickAnim - 4) / 3) * (-33.37349-(-32.43977)));
        yy = 41.16666 + (((tickAnim - 4) / 3) * (27.80529-(41.16666)));
        zz = 47.33685 + (((tickAnim - 4) / 3) * (-13.46659-(47.33685)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
        xx = -33.37349 + (((tickAnim - 7) / 13) * (0-(-33.37349)));
        yy = 27.80529 + (((tickAnim - 7) / 13) * (0-(27.80529)));
        zz = -13.46659 + (((tickAnim - 7) / 13) * (0-(-13.46659)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(gillleft3, gillleft3.rotateAngleX + (float) Math.toRadians(xx), gillleft3.rotateAngleY + (float) Math.toRadians(yy), gillleft3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 3) / 1) * (-2.91385-(0)));
        yy = 0 + (((tickAnim - 3) / 1) * (-51.36117-(0)));
        zz = 0 + (((tickAnim - 3) / 1) * (-31.6667-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
        xx = -2.91385 + (((tickAnim - 4) / 3) * (-2.79918-(-2.91385)));
        yy = -51.36117 + (((tickAnim - 4) / 3) * (-21.5019-(-51.36117)));
        zz = -31.6667 + (((tickAnim - 4) / 3) * (57.12763-(-31.6667)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
        xx = -2.79918 + (((tickAnim - 7) / 13) * (0-(-2.79918)));
        yy = -21.5019 + (((tickAnim - 7) / 13) * (0-(-21.5019)));
        zz = 57.12763 + (((tickAnim - 7) / 13) * (0-(57.12763)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(gillright4, gillright4.rotateAngleX + (float) Math.toRadians(xx), gillright4.rotateAngleY + (float) Math.toRadians(yy), gillright4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
        xx = 0 + (((tickAnim - 3) / 1) * (-46.96468-(0)));
        yy = 0 + (((tickAnim - 3) / 1) * (41.62435-(0)));
        zz = 0 + (((tickAnim - 3) / 1) * (66.18528-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
        xx = -46.96468 + (((tickAnim - 4) / 3) * (0-(-46.96468)));
        yy = 41.62435 + (((tickAnim - 4) / 3) * (0-(41.62435)));
        zz = 66.18528 + (((tickAnim - 4) / 3) * (0-(66.18528)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(gillleft4, gillleft4.rotateAngleX + (float) Math.toRadians(xx), gillleft4.rotateAngleY + (float) Math.toRadians(yy), gillleft4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (12.5-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 12.5 + (((tickAnim - 5) / 15) * (0-(12.5)));
        yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (17.5-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = 17.5 + (((tickAnim - 3) / 2) * (0-(17.5)));
        yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
        xx = 0 + (((tickAnim - 5) / 6) * (22.5-(0)));
        yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
        xx = 22.5 + (((tickAnim - 11) / 9) * (0-(22.5)));
        yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (40-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = 40 + (((tickAnim - 3) / 2) * (0-(40)));
        yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
        xx = 0 + (((tickAnim - 5) / 6) * (40-(0)));
        yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
        xx = 40 + (((tickAnim - 11) / 9) * (0-(40)));
        yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (47.5-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
        xx = 47.5 + (((tickAnim - 3) / 1) * (35.83-(47.5)));
        yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
        xx = 35.83 + (((tickAnim - 4) / 1) * (0-(35.83)));
        yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
        xx = 0 + (((tickAnim - 5) / 6) * (27.5-(0)));
        yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
        xx = 27.5 + (((tickAnim - 11) / 6) * (45-(27.5)));
        yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
        xx = 45 + (((tickAnim - 17) / 3) * (0-(45)));
        yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 0 + (((tickAnim - 0) / 3) * (50-(0)));
        yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = 50 + (((tickAnim - 3) / 2) * (0-(50)));
        yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
        xx = 0 + (((tickAnim - 5) / 6) * (25-(0)));
        yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
        xx = 25 + (((tickAnim - 11) / 6) * (56.59-(25)));
        yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
        xx = 56.59 + (((tickAnim - 17) / 3) * (0-(56.59)));
        yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (-0.47784-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (-1.53585-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (-1.98623-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = -0.47784 + (((tickAnim - 5) / 15) * (0-(-0.47784)));
        yy = -1.53585 + (((tickAnim - 5) / 15) * (0-(-1.53585)));
        zz = -1.98623 + (((tickAnim - 5) / 15) * (0-(-1.98623)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (4.23754-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (10.40259-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (13.04256-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 4.23754 + (((tickAnim - 5) / 15) * (0-(4.23754)));
        yy = 10.40259 + (((tickAnim - 5) / 15) * (0-(10.40259)));
        zz = 13.04256 + (((tickAnim - 5) / 15) * (0-(13.04256)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (9.20455-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (19.45505-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (23.3956-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 9.20455 + (((tickAnim - 5) / 15) * (0-(9.20455)));
        yy = 19.45505 + (((tickAnim - 5) / 15) * (0-(19.45505)));
        zz = 23.3956 + (((tickAnim - 5) / 15) * (0-(23.3956)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (17.12967-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (29.40564-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (33.50725-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 17.12967 + (((tickAnim - 5) / 15) * (0-(17.12967)));
        yy = 29.40564 + (((tickAnim - 5) / 15) * (0-(29.40564)));
        zz = 33.50725 + (((tickAnim - 5) / 15) * (0-(33.50725)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (-41.32409-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (-11.20963-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (-39.03164-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = -41.32409 + (((tickAnim - 5) / 15) * (0-(-41.32409)));
        yy = -11.20963 + (((tickAnim - 5) / 15) * (0-(-11.20963)));
        zz = -39.03164 + (((tickAnim - 5) / 15) * (0-(-39.03164)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (-32.5-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        yy = -32.5 + (((tickAnim - 5) / 15) * (0-(-32.5)));
        zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        zz = 0 + (((tickAnim - 0) / 5) * (27.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
        xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        zz = 27.5 + (((tickAnim - 5) / 15) * (0-(27.5)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(fingerleft, fingerleft.rotateAngleX + (float) Math.toRadians(xx), fingerleft.rotateAngleY + (float) Math.toRadians(yy), fingerleft.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraScorpion_Waeringoscorpio entity = (EntityPrehistoricFloraScorpion_Waeringoscorpio) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4))*1), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2-60))*1), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*3));
        this.head.rotationPointX = this.head.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-60))*0.1);
        this.head.rotationPointY = this.head.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4))*0.1);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2+60*2))*0.1);



         if (tickAnim >= 0 && tickAnim < 4) {
        xx = 1.14 + (((tickAnim - 0) / 4) * (-3.79855-(1.14)));
        yy = -2.3 + (((tickAnim - 0) / 4) * (11.90061-(-2.3)));
        zz = -0.93 + (((tickAnim - 0) / 4) * (0.77134-(-0.93)));
    }
            else if (tickAnim >= 4 && tickAnim < 8) {
    xx = -3.79855 + (((tickAnim - 4) / 4) * (0.35443-(-3.79855)));
    yy = 11.90061 + (((tickAnim - 4) / 4) * (-2.20472-(11.90061)));
    zz = 0.77134 + (((tickAnim - 4) / 4) * (6.05475-(0.77134)));
}
        else if (tickAnim >= 8 && tickAnim < 12) {
        xx = 0.35443 + (((tickAnim - 8) / 4) * (6.07249-(0.35443)));
        yy = -2.20472 + (((tickAnim - 8) / 4) * (-16.50608-(-2.20472)));
        zz = 6.05475 + (((tickAnim - 8) / 4) * (-2.62252-(6.05475)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
        xx = 6.07249 + (((tickAnim - 12) / 7) * (-3.79855-(6.07249)));
        yy = -16.50608 + (((tickAnim - 12) / 7) * (11.90061-(-16.50608)));
        zz = -2.62252 + (((tickAnim - 12) / 7) * (0.77134-(-2.62252)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
        xx = -3.79855 + (((tickAnim - 19) / 4) * (0.35443-(-3.79855)));
        yy = 11.90061 + (((tickAnim - 19) / 4) * (-2.20472-(11.90061)));
        zz = 0.77134 + (((tickAnim - 19) / 4) * (6.05475-(0.77134)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
        xx = 0.35443 + (((tickAnim - 23) / 4) * (6.07249-(0.35443)));
        yy = -2.20472 + (((tickAnim - 23) / 4) * (-16.50608-(-2.20472)));
        zz = 6.05475 + (((tickAnim - 23) / 4) * (-2.62252-(6.05475)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
        xx = 6.07249 + (((tickAnim - 27) / 3) * (1.14-(6.07249)));
        yy = -16.50608 + (((tickAnim - 27) / 3) * (-2.3-(-16.50608)));
        zz = -2.62252 + (((tickAnim - 27) / 3) * (-0.93-(-2.62252)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 1) {
        xx = 1.25 + (((tickAnim - 0) / 1) * (2.08926-(1.25)));
        yy = 0.1 + (((tickAnim - 0) / 1) * (-1.68001-(0.1)));
        zz = 5.53 + (((tickAnim - 0) / 1) * (6.96109-(5.53)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
        xx = 2.08926 + (((tickAnim - 1) / 3) * (3.38904-(2.08926)));
        yy = -1.68001 + (((tickAnim - 1) / 3) * (-12.02434-(-1.68001)));
        zz = 6.96109 + (((tickAnim - 1) / 3) * (-0.27009-(6.96109)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
        xx = 3.38904 + (((tickAnim - 4) / 8) * (-2.08855-(3.38904)));
        yy = -12.02434 + (((tickAnim - 4) / 8) * (7.21477-(-12.02434)));
        zz = -0.27009 + (((tickAnim - 4) / 8) * (-0.18884-(-0.27009)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
        xx = -2.08855 + (((tickAnim - 12) / 4) * (2.08926-(-2.08855)));
        yy = 7.21477 + (((tickAnim - 12) / 4) * (-1.68001-(7.21477)));
        zz = -0.18884 + (((tickAnim - 12) / 4) * (6.96109-(-0.18884)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
        xx = 2.08926 + (((tickAnim - 16) / 3) * (3.38904-(2.08926)));
        yy = -1.68001 + (((tickAnim - 16) / 3) * (-12.02434-(-1.68001)));
        zz = 6.96109 + (((tickAnim - 16) / 3) * (-0.27009-(6.96109)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
        xx = 3.38904 + (((tickAnim - 19) / 8) * (-2.08855-(3.38904)));
        yy = -12.02434 + (((tickAnim - 19) / 8) * (7.21477-(-12.02434)));
        zz = -0.27009 + (((tickAnim - 19) / 8) * (-0.18884-(-0.27009)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
        xx = -2.08855 + (((tickAnim - 27) / 3) * (1.25-(-2.08855)));
        yy = 7.21477 + (((tickAnim - 27) / 3) * (0.1-(7.21477)));
        zz = -0.18884 + (((tickAnim - 27) / 3) * (5.53-(-0.18884)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 1) {
        xx = -0.72 + (((tickAnim - 0) / 1) * (-1.23291-(-0.72)));
        yy = 2.74 + (((tickAnim - 0) / 1) * (4.86702-(2.74)));
        zz = -0.18 + (((tickAnim - 0) / 1) * (-0.26925-(-0.18)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
        xx = -1.23291 + (((tickAnim - 1) / 4) * (4.0424-(-1.23291)));
        yy = 4.86702 + (((tickAnim - 1) / 4) * (-2.94725-(4.86702)));
        zz = -0.26925 + (((tickAnim - 1) / 4) * (7.87805-(-0.26925)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
        xx = 4.0424 + (((tickAnim - 5) / 3) * (2.90809-(4.0424)));
        yy = -2.94725 + (((tickAnim - 5) / 3) * (-12.18537-(-2.94725)));
        zz = 7.87805 + (((tickAnim - 5) / 3) * (0.43273-(7.87805)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
        xx = 2.90809 + (((tickAnim - 8) / 8) * (-1.23291-(2.90809)));
        yy = -12.18537 + (((tickAnim - 8) / 8) * (4.86702-(-12.18537)));
        zz = 0.43273 + (((tickAnim - 8) / 8) * (-0.26925-(0.43273)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
        xx = -1.23291 + (((tickAnim - 16) / 4) * (4.0424-(-1.23291)));
        yy = 4.86702 + (((tickAnim - 16) / 4) * (-2.94725-(4.86702)));
        zz = -0.26925 + (((tickAnim - 16) / 4) * (7.87805-(-0.26925)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
        xx = 4.0424 + (((tickAnim - 20) / 3) * (2.90809-(4.0424)));
        yy = -2.94725 + (((tickAnim - 20) / 3) * (-12.18537-(-2.94725)));
        zz = 7.87805 + (((tickAnim - 20) / 3) * (0.43273-(7.87805)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
        xx = 2.90809 + (((tickAnim - 23) / 7) * (-0.72-(2.90809)));
        yy = -12.18537 + (((tickAnim - 23) / 7) * (2.74-(-12.18537)));
        zz = 0.43273 + (((tickAnim - 23) / 7) * (-0.18-(0.43273)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 1) {
        xx = 4.35 + (((tickAnim - 0) / 1) * (3.32152-(4.35)));
        yy = -11.07 + (((tickAnim - 0) / 1) * (-14.73142-(-11.07)));
        zz = 3.88 + (((tickAnim - 0) / 1) * (1.19576-(3.88)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
        xx = 3.32152 + (((tickAnim - 1) / 7) * (-2.16319-(3.32152)));
        yy = -14.73142 + (((tickAnim - 1) / 7) * (7.3339-(-14.73142)));
        zz = 1.19576 + (((tickAnim - 1) / 7) * (-1.1954-(1.19576)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
        xx = -2.16319 + (((tickAnim - 8) / 5) * (6.40055-(-2.16319)));
        yy = 7.3339 + (((tickAnim - 8) / 5) * (-3.73695-(7.3339)));
        zz = -1.1954 + (((tickAnim - 8) / 5) * (9.24099-(-1.1954)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
        xx = 6.40055 + (((tickAnim - 13) / 3) * (3.32152-(6.40055)));
        yy = -3.73695 + (((tickAnim - 13) / 3) * (-14.73142-(-3.73695)));
        zz = 9.24099 + (((tickAnim - 13) / 3) * (1.19576-(9.24099)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
        xx = 3.32152 + (((tickAnim - 16) / 7) * (-2.16319-(3.32152)));
        yy = -14.73142 + (((tickAnim - 16) / 7) * (7.3339-(-14.73142)));
        zz = 1.19576 + (((tickAnim - 16) / 7) * (-1.1954-(1.19576)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
        xx = -2.16319 + (((tickAnim - 23) / 5) * (6.40055-(-2.16319)));
        yy = 7.3339 + (((tickAnim - 23) / 5) * (-3.73695-(7.3339)));
        zz = -1.1954 + (((tickAnim - 23) / 5) * (9.24099-(-1.1954)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
        xx = 6.40055 + (((tickAnim - 28) / 2) * (4.35-(6.40055)));
        yy = -3.73695 + (((tickAnim - 28) / 2) * (-11.07-(-3.73695)));
        zz = 9.24099 + (((tickAnim - 28) / 2) * (3.88-(9.24099)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = -1.31 + (((tickAnim - 0) / 3) * (0.35443-(-1.31)));
        yy = -3.44 + (((tickAnim - 0) / 3) * (2.20472-(-3.44)));
        zz = -3.94 + (((tickAnim - 0) / 3) * (-6.05475-(-3.94)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
        xx = 0.35443 + (((tickAnim - 3) / 2) * (6.07249-(0.35443)));
        yy = 2.20472 + (((tickAnim - 3) / 2) * (16.50608-(2.20472)));
        zz = -6.05475 + (((tickAnim - 3) / 2) * (2.62252-(-6.05475)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
        xx = 6.07249 + (((tickAnim - 5) / 8) * (-3.79855-(6.07249)));
        yy = 16.50608 + (((tickAnim - 5) / 8) * (-11.90061-(16.50608)));
        zz = 2.62252 + (((tickAnim - 5) / 8) * (-0.77134-(2.62252)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
        xx = -3.79855 + (((tickAnim - 13) / 4) * (0.35443-(-3.79855)));
        yy = -11.90061 + (((tickAnim - 13) / 4) * (2.20472-(-11.90061)));
        zz = -0.77134 + (((tickAnim - 13) / 4) * (-6.05475-(-0.77134)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
        xx = 0.35443 + (((tickAnim - 17) / 3) * (6.07249-(0.35443)));
        yy = 2.20472 + (((tickAnim - 17) / 3) * (16.50608-(2.20472)));
        zz = -6.05475 + (((tickAnim - 17) / 3) * (2.62252-(-6.05475)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
        xx = 6.07249 + (((tickAnim - 20) / 8) * (-3.79855-(6.07249)));
        yy = 16.50608 + (((tickAnim - 20) / 8) * (-11.90061-(16.50608)));
        zz = 2.62252 + (((tickAnim - 20) / 8) * (-0.77134-(2.62252)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
        xx = -3.79855 + (((tickAnim - 28) / 2) * (-1.31-(-3.79855)));
        yy = -11.90061 + (((tickAnim - 28) / 2) * (-3.44-(-11.90061)));
        zz = -0.77134 + (((tickAnim - 28) / 2) * (-3.94-(-0.77134)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 5) {
        xx = 1.33 + (((tickAnim - 0) / 5) * (-2.08855-(1.33)));
        yy = 4.81 + (((tickAnim - 0) / 5) * (-7.21477-(4.81)));
        zz = 0.24 + (((tickAnim - 0) / 5) * (0.18884-(0.24)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
        xx = -2.08855 + (((tickAnim - 5) / 4) * (2.08926-(-2.08855)));
        yy = -7.21477 + (((tickAnim - 5) / 4) * (1.68001-(-7.21477)));
        zz = 0.18884 + (((tickAnim - 5) / 4) * (-6.96109-(0.18884)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
        xx = 2.08926 + (((tickAnim - 9) / 4) * (3.38904-(2.08926)));
        yy = 1.68001 + (((tickAnim - 9) / 4) * (12.02434-(1.68001)));
        zz = -6.96109 + (((tickAnim - 9) / 4) * (0.27009-(-6.96109)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
        xx = 3.38904 + (((tickAnim - 13) / 7) * (-2.08855-(3.38904)));
        yy = 12.02434 + (((tickAnim - 13) / 7) * (-7.21477-(12.02434)));
        zz = 0.27009 + (((tickAnim - 13) / 7) * (0.18884-(0.27009)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
        xx = -2.08855 + (((tickAnim - 20) / 4) * (2.08926-(-2.08855)));
        yy = -7.21477 + (((tickAnim - 20) / 4) * (1.68001-(-7.21477)));
        zz = 0.18884 + (((tickAnim - 20) / 4) * (-6.96109-(0.18884)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
        xx = 2.08926 + (((tickAnim - 24) / 4) * (3.38904-(2.08926)));
        yy = 1.68001 + (((tickAnim - 24) / 4) * (12.02434-(1.68001)));
        zz = -6.96109 + (((tickAnim - 24) / 4) * (0.27009-(-6.96109)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
        xx = 3.38904 + (((tickAnim - 28) / 2) * (1.33-(3.38904)));
        yy = 12.02434 + (((tickAnim - 28) / 2) * (4.81-(12.02434)));
        zz = 0.27009 + (((tickAnim - 28) / 2) * (0.24-(0.27009)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = 3.66 + (((tickAnim - 0) / 3) * (2.90809-(3.66)));
        yy = 6.03 + (((tickAnim - 0) / 3) * (12.18537-(6.03)));
        zz = -5.4 + (((tickAnim - 0) / 3) * (-0.43273-(-5.4)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
        xx = 2.90809 + (((tickAnim - 3) / 6) * (-1.23291-(2.90809)));
        yy = 12.18537 + (((tickAnim - 3) / 6) * (-4.86702-(12.18537)));
        zz = -0.43273 + (((tickAnim - 3) / 6) * (0.26925-(-0.43273)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
        xx = -1.23291 + (((tickAnim - 9) / 5) * (4.0424-(-1.23291)));
        yy = -4.86702 + (((tickAnim - 9) / 5) * (2.94725-(-4.86702)));
        zz = 0.26925 + (((tickAnim - 9) / 5) * (-7.87805-(0.26925)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
        xx = 4.0424 + (((tickAnim - 14) / 3) * (2.90809-(4.0424)));
        yy = 2.94725 + (((tickAnim - 14) / 3) * (12.18537-(2.94725)));
        zz = -7.87805 + (((tickAnim - 14) / 3) * (-0.43273-(-7.87805)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
        xx = 2.90809 + (((tickAnim - 17) / 7) * (-1.23291-(2.90809)));
        yy = 12.18537 + (((tickAnim - 17) / 7) * (-4.86702-(12.18537)));
        zz = -0.43273 + (((tickAnim - 17) / 7) * (0.26925-(-0.43273)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
        xx = -1.23291 + (((tickAnim - 24) / 4) * (4.0424-(-1.23291)));
        yy = -4.86702 + (((tickAnim - 24) / 4) * (2.94725-(-4.86702)));
        zz = 0.26925 + (((tickAnim - 24) / 4) * (-7.87805-(0.26925)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
        xx = 4.0424 + (((tickAnim - 28) / 2) * (3.66-(4.0424)));
        yy = 2.94725 + (((tickAnim - 28) / 2) * (6.03-(2.94725)));
        zz = -7.87805 + (((tickAnim - 28) / 2) * (-5.4-(-7.87805)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
        xx = -0.79 + (((tickAnim - 0) / 3) * (-2.16319-(-0.79)));
        yy = -1.82 + (((tickAnim - 0) / 3) * (-7.3339-(-1.82)));
        zz = 0.6 + (((tickAnim - 0) / 3) * (1.1954-(0.6)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
        xx = -2.16319 + (((tickAnim - 3) / 4) * (6.40055-(-2.16319)));
        yy = -7.3339 + (((tickAnim - 3) / 4) * (3.73695-(-7.3339)));
        zz = 1.1954 + (((tickAnim - 3) / 4) * (-9.24099-(1.1954)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
        xx = 6.40055 + (((tickAnim - 7) / 2) * (3.32152-(6.40055)));
        yy = 3.73695 + (((tickAnim - 7) / 2) * (14.73142-(3.73695)));
        zz = -9.24099 + (((tickAnim - 7) / 2) * (-1.19576-(-9.24099)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
        xx = 3.32152 + (((tickAnim - 9) / 8) * (-2.16319-(3.32152)));
        yy = 14.73142 + (((tickAnim - 9) / 8) * (-7.3339-(14.73142)));
        zz = -1.19576 + (((tickAnim - 9) / 8) * (1.1954-(-1.19576)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
        xx = -2.16319 + (((tickAnim - 17) / 4) * (6.40055-(-2.16319)));
        yy = -7.3339 + (((tickAnim - 17) / 4) * (3.73695-(-7.3339)));
        zz = 1.1954 + (((tickAnim - 17) / 4) * (-9.24099-(1.1954)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
        xx = 6.40055 + (((tickAnim - 21) / 3) * (3.32152-(6.40055)));
        yy = 3.73695 + (((tickAnim - 21) / 3) * (14.73142-(3.73695)));
        zz = -9.24099 + (((tickAnim - 21) / 3) * (-1.19576-(-9.24099)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
        xx = 3.32152 + (((tickAnim - 24) / 6) * (-0.79-(3.32152)));
        yy = 14.73142 + (((tickAnim - 24) / 6) * (-1.82-(14.73142)));
        zz = -1.19576 + (((tickAnim - 24) / 6) * (0.6-(-1.19576)));
        }
        else {
        xx = 0;
        yy = 0;
        zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*8), armright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-60))*6), armright.rotateAngleZ + (float) Math.toRadians(17+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4))*2));


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+60))*8), armleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*6), armleft.rotateAngleZ + (float) Math.toRadians(-22+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4+60))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4-60*3))*1), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2-60*2))), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4-60*3))*1), body2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2-60))*2), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3))*4), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animWalkingLand(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraScorpion_Waeringoscorpio entity = (EntityPrehistoricFloraScorpion_Waeringoscorpio) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4))*1), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2-60))*1), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*3));
        this.head.rotationPointX = this.head.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-60))*0.1);
        this.head.rotationPointY = this.head.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4))*0.1);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2+60*2))*0.1);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1.14 + (((tickAnim - 0) / 4) * (-3.79855-(1.14)));
            yy = -2.3 + (((tickAnim - 0) / 4) * (11.90061-(-2.3)));
            zz = -0.93 + (((tickAnim - 0) / 4) * (0.77134-(-0.93)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -3.79855 + (((tickAnim - 4) / 4) * (0.35443-(-3.79855)));
            yy = 11.90061 + (((tickAnim - 4) / 4) * (-2.20472-(11.90061)));
            zz = 0.77134 + (((tickAnim - 4) / 4) * (6.05475-(0.77134)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0.35443 + (((tickAnim - 8) / 4) * (6.07249-(0.35443)));
            yy = -2.20472 + (((tickAnim - 8) / 4) * (-16.50608-(-2.20472)));
            zz = 6.05475 + (((tickAnim - 8) / 4) * (-2.62252-(6.05475)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 6.07249 + (((tickAnim - 12) / 7) * (-3.79855-(6.07249)));
            yy = -16.50608 + (((tickAnim - 12) / 7) * (11.90061-(-16.50608)));
            zz = -2.62252 + (((tickAnim - 12) / 7) * (0.77134-(-2.62252)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -3.79855 + (((tickAnim - 19) / 4) * (0.35443-(-3.79855)));
            yy = 11.90061 + (((tickAnim - 19) / 4) * (-2.20472-(11.90061)));
            zz = 0.77134 + (((tickAnim - 19) / 4) * (6.05475-(0.77134)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0.35443 + (((tickAnim - 23) / 4) * (6.07249-(0.35443)));
            yy = -2.20472 + (((tickAnim - 23) / 4) * (-16.50608-(-2.20472)));
            zz = 6.05475 + (((tickAnim - 23) / 4) * (-2.62252-(6.05475)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 6.07249 + (((tickAnim - 27) / 3) * (1.14-(6.07249)));
            yy = -16.50608 + (((tickAnim - 27) / 3) * (-2.3-(-16.50608)));
            zz = -2.62252 + (((tickAnim - 27) / 3) * (-0.93-(-2.62252)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.25 + (((tickAnim - 0) / 1) * (2.08926-(1.25)));
            yy = 0.1 + (((tickAnim - 0) / 1) * (-1.68001-(0.1)));
            zz = 5.53 + (((tickAnim - 0) / 1) * (6.96109-(5.53)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 2.08926 + (((tickAnim - 1) / 3) * (3.38904-(2.08926)));
            yy = -1.68001 + (((tickAnim - 1) / 3) * (-12.02434-(-1.68001)));
            zz = 6.96109 + (((tickAnim - 1) / 3) * (-0.27009-(6.96109)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 3.38904 + (((tickAnim - 4) / 8) * (-2.08855-(3.38904)));
            yy = -12.02434 + (((tickAnim - 4) / 8) * (7.21477-(-12.02434)));
            zz = -0.27009 + (((tickAnim - 4) / 8) * (-0.18884-(-0.27009)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -2.08855 + (((tickAnim - 12) / 4) * (2.08926-(-2.08855)));
            yy = 7.21477 + (((tickAnim - 12) / 4) * (-1.68001-(7.21477)));
            zz = -0.18884 + (((tickAnim - 12) / 4) * (6.96109-(-0.18884)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 2.08926 + (((tickAnim - 16) / 3) * (3.38904-(2.08926)));
            yy = -1.68001 + (((tickAnim - 16) / 3) * (-12.02434-(-1.68001)));
            zz = 6.96109 + (((tickAnim - 16) / 3) * (-0.27009-(6.96109)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 3.38904 + (((tickAnim - 19) / 8) * (-2.08855-(3.38904)));
            yy = -12.02434 + (((tickAnim - 19) / 8) * (7.21477-(-12.02434)));
            zz = -0.27009 + (((tickAnim - 19) / 8) * (-0.18884-(-0.27009)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -2.08855 + (((tickAnim - 27) / 3) * (1.25-(-2.08855)));
            yy = 7.21477 + (((tickAnim - 27) / 3) * (0.1-(7.21477)));
            zz = -0.18884 + (((tickAnim - 27) / 3) * (5.53-(-0.18884)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.72 + (((tickAnim - 0) / 1) * (-1.23291-(-0.72)));
            yy = 2.74 + (((tickAnim - 0) / 1) * (4.86702-(2.74)));
            zz = -0.18 + (((tickAnim - 0) / 1) * (-0.26925-(-0.18)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -1.23291 + (((tickAnim - 1) / 4) * (4.0424-(-1.23291)));
            yy = 4.86702 + (((tickAnim - 1) / 4) * (-2.94725-(4.86702)));
            zz = -0.26925 + (((tickAnim - 1) / 4) * (7.87805-(-0.26925)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.0424 + (((tickAnim - 5) / 3) * (2.90809-(4.0424)));
            yy = -2.94725 + (((tickAnim - 5) / 3) * (-12.18537-(-2.94725)));
            zz = 7.87805 + (((tickAnim - 5) / 3) * (0.43273-(7.87805)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.90809 + (((tickAnim - 8) / 8) * (-1.23291-(2.90809)));
            yy = -12.18537 + (((tickAnim - 8) / 8) * (4.86702-(-12.18537)));
            zz = 0.43273 + (((tickAnim - 8) / 8) * (-0.26925-(0.43273)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -1.23291 + (((tickAnim - 16) / 4) * (4.0424-(-1.23291)));
            yy = 4.86702 + (((tickAnim - 16) / 4) * (-2.94725-(4.86702)));
            zz = -0.26925 + (((tickAnim - 16) / 4) * (7.87805-(-0.26925)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 4.0424 + (((tickAnim - 20) / 3) * (2.90809-(4.0424)));
            yy = -2.94725 + (((tickAnim - 20) / 3) * (-12.18537-(-2.94725)));
            zz = 7.87805 + (((tickAnim - 20) / 3) * (0.43273-(7.87805)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.90809 + (((tickAnim - 23) / 7) * (-0.72-(2.90809)));
            yy = -12.18537 + (((tickAnim - 23) / 7) * (2.74-(-12.18537)));
            zz = 0.43273 + (((tickAnim - 23) / 7) * (-0.18-(0.43273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 4.35 + (((tickAnim - 0) / 1) * (3.32152-(4.35)));
            yy = -11.07 + (((tickAnim - 0) / 1) * (-14.73142-(-11.07)));
            zz = 3.88 + (((tickAnim - 0) / 1) * (1.19576-(3.88)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = 3.32152 + (((tickAnim - 1) / 7) * (-2.16319-(3.32152)));
            yy = -14.73142 + (((tickAnim - 1) / 7) * (7.3339-(-14.73142)));
            zz = 1.19576 + (((tickAnim - 1) / 7) * (-1.1954-(1.19576)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -2.16319 + (((tickAnim - 8) / 5) * (6.40055-(-2.16319)));
            yy = 7.3339 + (((tickAnim - 8) / 5) * (-3.73695-(7.3339)));
            zz = -1.1954 + (((tickAnim - 8) / 5) * (9.24099-(-1.1954)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 6.40055 + (((tickAnim - 13) / 3) * (3.32152-(6.40055)));
            yy = -3.73695 + (((tickAnim - 13) / 3) * (-14.73142-(-3.73695)));
            zz = 9.24099 + (((tickAnim - 13) / 3) * (1.19576-(9.24099)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 3.32152 + (((tickAnim - 16) / 7) * (-2.16319-(3.32152)));
            yy = -14.73142 + (((tickAnim - 16) / 7) * (7.3339-(-14.73142)));
            zz = 1.19576 + (((tickAnim - 16) / 7) * (-1.1954-(1.19576)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -2.16319 + (((tickAnim - 23) / 5) * (6.40055-(-2.16319)));
            yy = 7.3339 + (((tickAnim - 23) / 5) * (-3.73695-(7.3339)));
            zz = -1.1954 + (((tickAnim - 23) / 5) * (9.24099-(-1.1954)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 6.40055 + (((tickAnim - 28) / 2) * (4.35-(6.40055)));
            yy = -3.73695 + (((tickAnim - 28) / 2) * (-11.07-(-3.73695)));
            zz = 9.24099 + (((tickAnim - 28) / 2) * (3.88-(9.24099)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.31 + (((tickAnim - 0) / 3) * (0.35443-(-1.31)));
            yy = -3.44 + (((tickAnim - 0) / 3) * (2.20472-(-3.44)));
            zz = -3.94 + (((tickAnim - 0) / 3) * (-6.05475-(-3.94)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.35443 + (((tickAnim - 3) / 2) * (6.07249-(0.35443)));
            yy = 2.20472 + (((tickAnim - 3) / 2) * (16.50608-(2.20472)));
            zz = -6.05475 + (((tickAnim - 3) / 2) * (2.62252-(-6.05475)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 6.07249 + (((tickAnim - 5) / 8) * (-3.79855-(6.07249)));
            yy = 16.50608 + (((tickAnim - 5) / 8) * (-11.90061-(16.50608)));
            zz = 2.62252 + (((tickAnim - 5) / 8) * (-0.77134-(2.62252)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -3.79855 + (((tickAnim - 13) / 4) * (0.35443-(-3.79855)));
            yy = -11.90061 + (((tickAnim - 13) / 4) * (2.20472-(-11.90061)));
            zz = -0.77134 + (((tickAnim - 13) / 4) * (-6.05475-(-0.77134)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0.35443 + (((tickAnim - 17) / 3) * (6.07249-(0.35443)));
            yy = 2.20472 + (((tickAnim - 17) / 3) * (16.50608-(2.20472)));
            zz = -6.05475 + (((tickAnim - 17) / 3) * (2.62252-(-6.05475)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 6.07249 + (((tickAnim - 20) / 8) * (-3.79855-(6.07249)));
            yy = 16.50608 + (((tickAnim - 20) / 8) * (-11.90061-(16.50608)));
            zz = 2.62252 + (((tickAnim - 20) / 8) * (-0.77134-(2.62252)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -3.79855 + (((tickAnim - 28) / 2) * (-1.31-(-3.79855)));
            yy = -11.90061 + (((tickAnim - 28) / 2) * (-3.44-(-11.90061)));
            zz = -0.77134 + (((tickAnim - 28) / 2) * (-3.94-(-0.77134)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.33 + (((tickAnim - 0) / 5) * (-2.08855-(1.33)));
            yy = 4.81 + (((tickAnim - 0) / 5) * (-7.21477-(4.81)));
            zz = 0.24 + (((tickAnim - 0) / 5) * (0.18884-(0.24)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -2.08855 + (((tickAnim - 5) / 4) * (2.08926-(-2.08855)));
            yy = -7.21477 + (((tickAnim - 5) / 4) * (1.68001-(-7.21477)));
            zz = 0.18884 + (((tickAnim - 5) / 4) * (-6.96109-(0.18884)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 2.08926 + (((tickAnim - 9) / 4) * (3.38904-(2.08926)));
            yy = 1.68001 + (((tickAnim - 9) / 4) * (12.02434-(1.68001)));
            zz = -6.96109 + (((tickAnim - 9) / 4) * (0.27009-(-6.96109)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.38904 + (((tickAnim - 13) / 7) * (-2.08855-(3.38904)));
            yy = 12.02434 + (((tickAnim - 13) / 7) * (-7.21477-(12.02434)));
            zz = 0.27009 + (((tickAnim - 13) / 7) * (0.18884-(0.27009)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -2.08855 + (((tickAnim - 20) / 4) * (2.08926-(-2.08855)));
            yy = -7.21477 + (((tickAnim - 20) / 4) * (1.68001-(-7.21477)));
            zz = 0.18884 + (((tickAnim - 20) / 4) * (-6.96109-(0.18884)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 2.08926 + (((tickAnim - 24) / 4) * (3.38904-(2.08926)));
            yy = 1.68001 + (((tickAnim - 24) / 4) * (12.02434-(1.68001)));
            zz = -6.96109 + (((tickAnim - 24) / 4) * (0.27009-(-6.96109)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 3.38904 + (((tickAnim - 28) / 2) * (1.33-(3.38904)));
            yy = 12.02434 + (((tickAnim - 28) / 2) * (4.81-(12.02434)));
            zz = 0.27009 + (((tickAnim - 28) / 2) * (0.24-(0.27009)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3.66 + (((tickAnim - 0) / 3) * (2.90809-(3.66)));
            yy = 6.03 + (((tickAnim - 0) / 3) * (12.18537-(6.03)));
            zz = -5.4 + (((tickAnim - 0) / 3) * (-0.43273-(-5.4)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 2.90809 + (((tickAnim - 3) / 6) * (-1.23291-(2.90809)));
            yy = 12.18537 + (((tickAnim - 3) / 6) * (-4.86702-(12.18537)));
            zz = -0.43273 + (((tickAnim - 3) / 6) * (0.26925-(-0.43273)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -1.23291 + (((tickAnim - 9) / 5) * (4.0424-(-1.23291)));
            yy = -4.86702 + (((tickAnim - 9) / 5) * (2.94725-(-4.86702)));
            zz = 0.26925 + (((tickAnim - 9) / 5) * (-7.87805-(0.26925)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 4.0424 + (((tickAnim - 14) / 3) * (2.90809-(4.0424)));
            yy = 2.94725 + (((tickAnim - 14) / 3) * (12.18537-(2.94725)));
            zz = -7.87805 + (((tickAnim - 14) / 3) * (-0.43273-(-7.87805)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 2.90809 + (((tickAnim - 17) / 7) * (-1.23291-(2.90809)));
            yy = 12.18537 + (((tickAnim - 17) / 7) * (-4.86702-(12.18537)));
            zz = -0.43273 + (((tickAnim - 17) / 7) * (0.26925-(-0.43273)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -1.23291 + (((tickAnim - 24) / 4) * (4.0424-(-1.23291)));
            yy = -4.86702 + (((tickAnim - 24) / 4) * (2.94725-(-4.86702)));
            zz = 0.26925 + (((tickAnim - 24) / 4) * (-7.87805-(0.26925)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 4.0424 + (((tickAnim - 28) / 2) * (3.66-(4.0424)));
            yy = 2.94725 + (((tickAnim - 28) / 2) * (6.03-(2.94725)));
            zz = -7.87805 + (((tickAnim - 28) / 2) * (-5.4-(-7.87805)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.79 + (((tickAnim - 0) / 3) * (-2.16319-(-0.79)));
            yy = -1.82 + (((tickAnim - 0) / 3) * (-7.3339-(-1.82)));
            zz = 0.6 + (((tickAnim - 0) / 3) * (1.1954-(0.6)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.16319 + (((tickAnim - 3) / 4) * (6.40055-(-2.16319)));
            yy = -7.3339 + (((tickAnim - 3) / 4) * (3.73695-(-7.3339)));
            zz = 1.1954 + (((tickAnim - 3) / 4) * (-9.24099-(1.1954)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 6.40055 + (((tickAnim - 7) / 2) * (3.32152-(6.40055)));
            yy = 3.73695 + (((tickAnim - 7) / 2) * (14.73142-(3.73695)));
            zz = -9.24099 + (((tickAnim - 7) / 2) * (-1.19576-(-9.24099)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 3.32152 + (((tickAnim - 9) / 8) * (-2.16319-(3.32152)));
            yy = 14.73142 + (((tickAnim - 9) / 8) * (-7.3339-(14.73142)));
            zz = -1.19576 + (((tickAnim - 9) / 8) * (1.1954-(-1.19576)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -2.16319 + (((tickAnim - 17) / 4) * (6.40055-(-2.16319)));
            yy = -7.3339 + (((tickAnim - 17) / 4) * (3.73695-(-7.3339)));
            zz = 1.1954 + (((tickAnim - 17) / 4) * (-9.24099-(1.1954)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 6.40055 + (((tickAnim - 21) / 3) * (3.32152-(6.40055)));
            yy = 3.73695 + (((tickAnim - 21) / 3) * (14.73142-(3.73695)));
            zz = -9.24099 + (((tickAnim - 21) / 3) * (-1.19576-(-9.24099)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 3.32152 + (((tickAnim - 24) / 6) * (-0.79-(3.32152)));
            yy = 14.73142 + (((tickAnim - 24) / 6) * (-1.82-(14.73142)));
            zz = -1.19576 + (((tickAnim - 24) / 6) * (0.6-(-1.19576)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*8), armright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-60))*6), armright.rotateAngleZ + (float) Math.toRadians(17+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4))*2));


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+60))*8), armleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*6), armleft.rotateAngleZ + (float) Math.toRadians(-22+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4+60))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4-60*3))*1), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2-60*2))), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*4-60*3))*1), body2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*2-60))*2), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240*3))*4), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));

    }
}




